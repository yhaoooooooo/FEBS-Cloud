package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.FiEtlEntitytree;
import com.yonyou.etl.entity.MdAttribute;
import com.yonyou.etl.entity.MdEntity;
import com.yonyou.etl.mapper.FiEtlEntitytreeMapper;
import com.yonyou.etl.mapper.MdAttributeMapper;
import com.yonyou.etl.mapper.MdEntityMapper;
import com.yonyou.etl.service.IMdAttributeService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yhao
 */
@Service
@DS("daily-figl")
public class MdAttributeServiceImpl extends ServiceImpl<MdAttributeMapper, MdAttribute> implements IMdAttributeService {

    @Autowired
    private MdAttributeServiceFiglbaseImpl mdAttributeServiceFiglbase;

    @Autowired
    private MdEntityServiceFiglbaseImpl mdEntityServiceFiglbase;

    @Autowired
    private MdEntityMapper entityMapper;

    @Autowired
    private FiEtlEntitytreeMapper fiEtlEntitytreeMapper;

    @Override
    public List<String> compare() {
        List<FiEtlEntitytree> fiEtlEntitytrees =
                fiEtlEntitytreeMapper.selectList(new LambdaQueryWrapper<FiEtlEntitytree>().eq(FiEtlEntitytree::getTenantid,
                        "a65xtqwz"));
        List<String> sqls = new ArrayList<>();
        List<String> figlbaseSql = new ArrayList<>();
        fiEtlEntitytrees.forEach(entity -> {

            String entitycode = entity.getEntitycode();
//
//            MdEntity mdEntity = entityMapper.selectOne(new QueryWrapper<MdEntity>().lambda().eq
//            (MdEntity::getEntityname,
//                    entitycode));

            MdEntity mdEntity = new MdEntity();
            mdEntity.setEntityname(entitycode);
            mdEntity.setTenantid("a65xtqwz");
            Integer entityCountInFigl = entityMapper.selectCount(new QueryWrapper<>(mdEntity));
            if (entityCountInFigl == 0) {
                sqls.addAll(generateSql(Arrays.asList(mdEntityServiceFiglbase.getBaseMapper().selectOne(new QueryWrapper<>(mdEntity))), "figl"));
            }
            Integer entityCountInFiglbase = mdEntityServiceFiglbase.getBaseMapper().selectCount(new QueryWrapper<>(mdEntity));
            if (entityCountInFiglbase == 0) {
                figlbaseSql.addAll(generateSql(Arrays.asList(entityMapper.selectOne(new QueryWrapper<>(mdEntity))),
                        "figlbase"));
            }
            List<MdAttribute> figlbaseAttributes = mdAttributeServiceFiglbase.selectAttributeByEntityCode(entitycode);
            List<MdAttribute> figlAttributes = MdAttributeServiceImpl.this.selectAttributeByEntityCode(entitycode);

            if (figlAttributes.isEmpty() && figlAttributes.isEmpty()) {
                log.error("》》》》》》 code 都不存在" + entitycode);
                return;
            }


            Map<String, MdAttribute> figlbaseAttributesMap =
                    figlbaseAttributes.stream().collect(Collectors.toMap(item -> item.getPropertyname(), item -> item));
            Map<String, MdAttribute> figlAttributesMap =
                    figlbaseAttributes.stream().collect(Collectors.toMap(item -> item.getPropertyname(), item -> item));

            List<MdAttribute> figlBaseNoteExistis =
                    figlbaseAttributes.stream().filter(item -> !figlAttributesMap.keySet().contains(item.getPropertyname())).collect(Collectors.toList());
            List<MdAttribute> figlNotExists =
                    figlAttributes.stream().filter(item -> !figlbaseAttributesMap.keySet().contains(item.getPropertyname())).collect(Collectors.toList());


            List<String> figl = generateSql(figlNotExists, "figl");
            List<String> figlbase = generateSql(figlBaseNoteExistis, "figlbase");

            sqls.addAll(figl);
            figlbase.addAll(figlbase);
        });
        return sqls;
    }

    @SneakyThrows
    private List<String> generateSql(List<?> objs, String database) {

        List<String> sql = new ArrayList<>();
        for (Object o : objs) {

            Class clazz = o.getClass();
            Field[] declaredFields = clazz.getDeclaredFields();
            TableName annotation = (TableName) clazz.getAnnotation(TableName.class);
            String tablename = annotation.value();
            String sqlTemplate = prepareStatementSql(tablename, clazz, declaredFields);

            for (int i = 0; i < declaredFields.length; i++) {
                Field field = declaredFields[i];
                if (field.getName().equals("serialVersionUID")) {
                    sqlTemplate = sqlTemplate.replaceFirst("yhao_field@@@@@,", "")
                            .replaceFirst("yhao_value@@@@@", "");
                    continue;
                }
                String tableFieldName = null;
                if (field.getName().equals("id")) {
                    tableFieldName = "id";
                } else {
                    tableFieldName = field.getAnnotation(TableField.class).value();
                }

                Method method = clazz.getMethod(getMethodName(field.getName()), null);

                String value = null;
                if (tableFieldName.equals("id")) {
                    value = UUID.randomUUID().toString();
                } else if (tablename.equals("md_attribute")) {
                    if (tableFieldName.equals("ownerEntity")) {

                    }
                }else {
                    value = method.invoke(o, null) == null ? null : method.invoke(o, null).toString();
                }

                sqlTemplate = sqlTemplate.replaceFirst("yhao_field@@@@@", tableFieldName);
                sqlTemplate = sqlTemplate.replaceFirst("yhao_value@@@@@", value == null ? "null" : "'" + value + "'");
            }
            sql.add(sqlTemplate);
        }

        return sql;
    }

    private String prepareStatementSql(String tablename, Class clazz, Field[] declaredFields) {

        String params = "";
        for (int i = 0; i < declaredFields.length; i++) {
            params += "yhao_value@@@@@,";
        }
        params = params.substring(0, params.length() - 1);
        String sqlTemplate = String.format("insert into %s (%s) values (%s)", tablename, params.replace(
                "yhao_value@@@@@",
                "yhao_field@@@@@")
                , params);
        return sqlTemplate;
    }

    private String getMethodName(String name) {
        char c = name.toCharArray()[0];
        return "get" + (c + "").toUpperCase(Locale.ROOT) + name.substring(1);
    }

    @Override
    public List<MdAttribute> selectAttributeByEntityCode(String entitycode) {
        return this.selectAttributeByEntityCode("a65", entitycode);
    }

    @Override
    public List<MdAttribute> selectAttributeByEntityCode(String tenantId, String entitycode) {
        LambdaQueryWrapper<MdEntity> mdEntityLambdaQueryWrapper =
                new QueryWrapper<MdEntity>().lambda().eq(MdEntity::getEntityname,
                                entitycode)
                        .like(MdEntity::getTenantid, tenantId);

        MdEntity one = entityMapper.selectOne(mdEntityLambdaQueryWrapper);
        if (one == null) {
            return Collections.emptyList();
        }
        List<MdAttribute> list = this.list(new LambdaQueryWrapper<MdAttribute>().eq(MdAttribute::getOwnerentity, one.getId()).eq(MdAttribute::getTenantid, one.getTenantid()));
        for (MdAttribute mdAttribute : list) {
            if ("40".equals(mdAttribute.getAssemblytype())) {
                MdEntity refEntity = entityMapper.selectById(mdAttribute.getRefentity());
                if (refEntity != null && refEntity.getEntityname().equals(mdAttribute.getRefentitycode())) {
                    mdAttribute.setRefEntityCodeCorrectly(true);
                }
            }
        }

        return null;
    }
}
