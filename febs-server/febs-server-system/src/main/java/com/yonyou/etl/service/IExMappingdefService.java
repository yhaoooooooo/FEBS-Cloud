package com.yonyou.etl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yonyou.etl.entity.ExMappingdef;
import com.yonyou.etl.vo.ExmappingDefVo;

import java.util.List;

/**
* @author yhao
*/
public interface IExMappingdefService extends IService<ExMappingdef> {

    List<ExmappingDefVo> queryByEntityCode(String entityCode);

}
