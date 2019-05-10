package com.ssm.demo.dao;

import com.ssm.demo.entity.Description;

/**
 * Created by 13 on 2018/6/27.
 */
public interface DescriptionDao {

    /**
     * 获取最新一条描述
     *
     * @return
     */
    Description getLastDescription();
}
