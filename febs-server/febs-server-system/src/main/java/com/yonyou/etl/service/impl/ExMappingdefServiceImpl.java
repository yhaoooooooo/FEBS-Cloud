package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.*;
import com.yonyou.etl.mapper.ExMappingdefMapper;
import com.yonyou.etl.mapper.MdEntityMapper;
import com.yonyou.etl.service.IBdBilltypeService;
import com.yonyou.etl.service.IExMappingdefService;
import com.yonyou.etl.service.IExMappingentityService;
import com.yonyou.etl.service.IExMappingpropertyService;
import com.yonyou.etl.vo.ExmappingDefVo;
import com.yonyou.etl.vo.ExmappingEntityVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
* @author yhao
*/
@Service
@DS("#{environment}")
public class ExMappingdefServiceImpl extends ServiceImpl<ExMappingdefMapper, ExMappingdef> implements IExMappingdefService {
    @Autowired
    private IBdBilltypeService iBdBilltypeService;
    @Autowired
    private IExMappingentityService iExMappingentityService;
    @Autowired
    private IExMappingpropertyService iExMappingpropertyService;


    private static final String SEQ_PATTERN = "00000000000";
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat(SEQ_PATTERN);

    public static void main(String[] args) {
        System.out.println(DECIMAL_FORMAT.format(Long.parseLong("100")));
    }
    /**
     *
     * @param eos_pk : 事件中心 eos_pk
     * @return yyyy-MM-dd 24:00:00 eos_pk
     */
    private String buildDataVersionByEventSeq(String eos_pk, String date) {
        if (eos_pk == null) {
            return null;
        }
        return date + " 24:00:00 " + DECIMAL_FORMAT.format(eos_pk);
    }

    @Autowired
    private MdEntityMapper entityMapper;
    @Override
    public List<ExmappingDefVo> queryByEntityCode(String entityCode) {
        MdEntity mdEntity =
                entityMapper.selectOne(new LambdaQueryWrapper<MdEntity>().eq(MdEntity::getTenantid, "a65xtqwz").eq(MdEntity::getEntityname,
                        entityCode));
        BdBilltype bdBilltype = iBdBilltypeService.getOne(new LambdaQueryWrapper<BdBilltype>().like(BdBilltype::getTenantid
                , "a65xtqwz").eq(BdBilltype::getEntityid, mdEntity.getId()));
        List<ExMappingdef> list =
                this.list(new LambdaQueryWrapper<ExMappingdef>().like(ExMappingdef::getTenantid,
                        "a65xtqwz").eq(ExMappingdef::getSrcBilltype, bdBilltype.getId()).orderByAsc(ExMappingdef::getId));

        List<ExmappingDefVo> data = new ArrayList<>();
        for (ExMappingdef e : list) {

            ExmappingDefVo exmappingDefVo = new ExmappingDefVo();
            data.add(exmappingDefVo);
            BeanUtils.copyProperties(e, exmappingDefVo);

            List<ExMappingentity> exMappingentities = iExMappingentityService.list(new LambdaQueryWrapper<ExMappingentity>()
                    .like(ExMappingentity::getTenantid, "a65xtqwz").eq(ExMappingentity::getMappingdefid,
                            e.getId()).orderByAsc(ExMappingentity::getParentid));

            for (ExMappingentity entity : exMappingentities) {
                ExmappingEntityVo exmappingEntityVo = new ExmappingEntityVo();
                exmappingEntityVo.setSrcEntityName(entityMapper.selectById(entity.getSrcEntityid()).getEntityname());
                exmappingEntityVo.setDesEntityName(entityMapper.selectById(entity.getDesEntityid()).getEntityname());
                BeanUtils.copyProperties(entity, exmappingEntityVo);
                exmappingDefVo.getChildren().add(exmappingEntityVo);
                List<ExMappingproperty> properties = iExMappingpropertyService.list(new LambdaQueryWrapper<ExMappingproperty>()
                        .like(ExMappingproperty::getTenantid, "a65xtqwz").eq(ExMappingproperty::getEntitymapid,
                                entity.getId()).orderByAsc(ExMappingproperty::getDesProperty));
                exmappingEntityVo.getChildren().addAll(properties);
            }

        }
        return data;
    }
}
