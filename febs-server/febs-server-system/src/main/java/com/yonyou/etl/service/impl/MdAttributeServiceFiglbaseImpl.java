package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
* @author yhao
*/
@Service
@DS("daily-figlbase")
public class MdAttributeServiceFiglbaseImpl extends ServiceImpl<MdAttributeMapper, MdAttribute> implements IMdAttributeService {



    @Autowired
    private MdEntityMapper entityMapper;

    @Autowired
    private FiEtlEntitytreeMapper fiEtlEntitytreeMapper;

    @Override
    public List<String> compare() {
        List<FiEtlEntitytree> fiEtlEntitytrees = fiEtlEntitytreeMapper.selectList(new QueryWrapper<>());
        fiEtlEntitytrees.forEach(entity -> {

            String entitycode = entity.getEntitycode();

            MdEntity mdEntity = entityMapper.selectOne(new QueryWrapper<MdEntity>().lambda().eq(MdEntity::getEntityname,
                    entitycode));

        });
        return null;
    }

    @Override
    public List<MdAttribute> selectAttributeByEntityCode(String entitycode) {

        LambdaQueryWrapper<MdEntity> mdEntityLambdaQueryWrapper = new QueryWrapper<MdEntity>().lambda().eq(MdEntity::getEntityname,
                entitycode)
                .like(MdEntity::getTenantid, "a65");

        MdEntity one = entityMapper.selectOne(mdEntityLambdaQueryWrapper);
        if (one == null) {
            return Collections.emptyList();
        }
        return this.list(new LambdaQueryWrapper<MdAttribute>().eq(MdAttribute::getOwnerentity, one.getId()).eq(MdAttribute::getTenantid, one.getTenantid()));
    }

    @Override
    public List<MdAttribute> selectAttributeByEntityCode(String tenantId, String entitycode) {
        return null;
    }

}
