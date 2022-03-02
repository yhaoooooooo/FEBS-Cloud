package com.yonyou.etl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yonyou.etl.entity.MdAttribute;

import java.util.List;

/**
* @author yhao
*/
public interface IMdAttributeService extends IService<MdAttribute> {

    List<String> compare();

    List<MdAttribute> selectAttributeByEntityCode(String entitycode);

    List<MdAttribute> selectAttributeByEntityCode(String tenantId, String entitycode);
}
