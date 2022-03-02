package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.BdBilltype;
import com.yonyou.etl.mapper.BdBilltypeMapper;
import com.yonyou.etl.service.IBdBilltypeService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
@DS("#{environment}")

public class BdBilltypeServiceImpl extends ServiceImpl<BdBilltypeMapper, BdBilltype> implements IBdBilltypeService {

}
