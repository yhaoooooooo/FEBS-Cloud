package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.BdCurrency;
import com.yonyou.etl.mapper.BdCurrencyMapper;
import com.yonyou.etl.service.IBdCurrencyService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class BdCurrencyServiceImpl extends ServiceImpl<BdCurrencyMapper, BdCurrency> implements IBdCurrencyService {

}
