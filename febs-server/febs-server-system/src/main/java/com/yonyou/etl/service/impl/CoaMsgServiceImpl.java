package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.CoaMsg;
import com.yonyou.etl.mapper.CoaMsgMapper;
import com.yonyou.etl.service.ICoaMsgService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class CoaMsgServiceImpl extends ServiceImpl<CoaMsgMapper, CoaMsg> implements ICoaMsgService {

}
