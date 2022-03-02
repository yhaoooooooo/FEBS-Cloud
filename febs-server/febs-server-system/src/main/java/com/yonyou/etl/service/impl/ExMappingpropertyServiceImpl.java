package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.ExMappingproperty;
import com.yonyou.etl.mapper.ExMappingpropertyMapper;
import com.yonyou.etl.service.IExMappingpropertyService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
@DS("#{environment}")
public class ExMappingpropertyServiceImpl extends ServiceImpl<ExMappingpropertyMapper, ExMappingproperty> implements IExMappingpropertyService {

}
