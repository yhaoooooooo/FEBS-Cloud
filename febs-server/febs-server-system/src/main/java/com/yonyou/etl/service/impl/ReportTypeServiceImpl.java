package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.ReportType;
import com.yonyou.etl.mapper.ReportTypeMapper;
import com.yonyou.etl.service.IReportTypeService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class ReportTypeServiceImpl extends ServiceImpl<ReportTypeMapper, ReportType> implements IReportTypeService {

}
