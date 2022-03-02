package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.ExMappingentity;
import com.yonyou.etl.mapper.ExMappingentityMapper;
import com.yonyou.etl.service.IExMappingentityService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
@DS("#{environment}")
public class ExMappingentityServiceImpl extends ServiceImpl<ExMappingentityMapper, ExMappingentity> implements IExMappingentityService {

}
