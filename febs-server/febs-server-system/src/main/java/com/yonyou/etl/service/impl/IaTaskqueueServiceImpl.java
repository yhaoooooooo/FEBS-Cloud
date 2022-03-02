package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.IaTaskqueue;
import com.yonyou.etl.mapper.IaTaskqueueMapper;
import com.yonyou.etl.service.IIaTaskqueueService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class IaTaskqueueServiceImpl extends ServiceImpl<IaTaskqueueMapper, IaTaskqueue> implements IIaTaskqueueService {

}
