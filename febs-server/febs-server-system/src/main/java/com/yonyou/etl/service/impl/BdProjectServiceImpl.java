package com.yonyou.etl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.BdProject;
import com.yonyou.etl.mapper.BdProjectMapper;
import com.yonyou.etl.service.IBdProjectService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
public class BdProjectServiceImpl extends ServiceImpl<BdProjectMapper, BdProject> implements IBdProjectService {

}
