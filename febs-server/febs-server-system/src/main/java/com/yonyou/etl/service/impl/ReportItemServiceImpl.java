package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.ReportItem;
import com.yonyou.etl.mapper.ReportItemMapper;
import com.yonyou.etl.service.IReportItemService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class ReportItemServiceImpl extends ServiceImpl<ReportItemMapper, ReportItem> implements IReportItemService {

}
