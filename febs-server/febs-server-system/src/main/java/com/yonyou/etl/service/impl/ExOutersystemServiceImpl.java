package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.ExOutersystem;
import com.yonyou.etl.mapper.ExOutersystemMapper;
import com.yonyou.etl.service.IExOutersystemService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
@DS("#{environment}")
public class ExOutersystemServiceImpl extends ServiceImpl<ExOutersystemMapper, ExOutersystem> implements IExOutersystemService {

}
