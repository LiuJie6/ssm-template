package com.lj.ssm.dao.test;

import com.lj.ssm.model.test.UserModel;

/**
 * Project Name:ssm-template
 * File Name:IUserDao
 * Package Name:com.lj.ssm.dao.test
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public interface IUserDao {

    int insertUser(UserModel userModel);

    UserModel getUserInfo(String userName, String cardName);
}
