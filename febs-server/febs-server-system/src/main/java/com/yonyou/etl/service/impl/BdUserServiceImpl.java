package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.BdUser;
import com.yonyou.etl.mapper.BdUserMapper;
import com.yonyou.etl.service.IBdUserService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class BdUserServiceImpl extends ServiceImpl<BdUserMapper, BdUser> implements IBdUserService {

}
