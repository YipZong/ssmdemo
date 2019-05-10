package com.ssm.demo.service.impl;

import com.ssm.demo.dao.DescriptionDao;
import com.ssm.demo.entity.Description;
import com.ssm.demo.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 13 on 2018/6/27.
 */
@Service("descriptionService")//注意这个注解
public class DescriptionServiceImpl implements DescriptionService {

    @Autowired
    private DescriptionDao descriptionDao;

    @Override
    public Description getLastDescription() {
        return descriptionDao.getLastDescription();
    }
}
