package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.BdBank;
import com.yonyou.etl.mapper.BdBankMapper;
import com.yonyou.etl.service.IBdBankService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class BdBankServiceImpl extends ServiceImpl<BdBankMapper, BdBank> implements IBdBankService {

}
