package com.yonyou.etl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yonyou.etl.entity.ExMappingproperty;

import java.util.List;

/**
* @author yhao
*/
public interface ExMappingpropertyMapper extends BaseMapper<ExMappingproperty> {

    List<ExMappingproperty> selectByEntityId(String entityId);

}
