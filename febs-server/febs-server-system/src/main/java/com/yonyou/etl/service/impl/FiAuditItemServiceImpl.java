package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.FiAuditItem;
import com.yonyou.etl.mapper.FiAuditItemMapper;
import com.yonyou.etl.service.IFiAuditItemService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class FiAuditItemServiceImpl extends ServiceImpl<FiAuditItemMapper, FiAuditItem> implements IFiAuditItemService {

}
