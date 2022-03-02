package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.WbMessageType;
import com.yonyou.etl.mapper.WbMessageTypeMapper;
import com.yonyou.etl.service.IWbMessageTypeService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class WbMessageTypeServiceImpl extends ServiceImpl<WbMessageTypeMapper, WbMessageType> implements IWbMessageTypeService {

}
