package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.PubEtlLog;
import com.yonyou.etl.mapper.PubEtlLogMapper;
import com.yonyou.etl.service.IPubEtlLogService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class PubEtlLogServiceImpl extends ServiceImpl<PubEtlLogMapper, PubEtlLog> implements IPubEtlLogService {

}
