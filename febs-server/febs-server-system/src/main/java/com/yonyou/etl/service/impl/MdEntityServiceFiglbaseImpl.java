package com.yonyou.etl.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yonyou.etl.entity.MdEntity;
import com.yonyou.etl.mapper.MdEntityMapper;
import com.yonyou.etl.service.IMdEntityService;
import org.springframework.stereotype.Service;

/**
* @author yhao
*/
@Service
@DS("daily-figlbase")
public class MdEntityServiceFiglbaseImpl extends ServiceImpl<MdEntityMapper, MdEntity> implements IMdEntityService {

}
