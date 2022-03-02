package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.ReportInfo;
import com.yonyou.etl.mapper.ReportInfoMapper;
import com.yonyou.etl.service.IReportInfoService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class ReportInfoServiceImpl extends ServiceImpl<ReportInfoMapper, ReportInfo> implements IReportInfoService {

}
