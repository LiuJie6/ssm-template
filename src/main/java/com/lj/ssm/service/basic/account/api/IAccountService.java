package com.lj.ssm.service.basic.account.api;

import com.lj.ssm.model.baisc.AccountModel;

import java.util.List;

/**
 * Project Name:ssm-template
 * File Name:IAccountService
 * Package Name:com.lj.ssm.service.basic.account.api
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public interface IAccountService {

    /**
     * 新增
     *
     * @param accountName     用户名
     * @param accountPassword 用户密码
     * @return 操作条数
     */
    long insertAccount(String accountName, String accountPassword);

    /**
     * 查询总数
     *
     * @return 总数
     */
    int queryCount();

    /**
     * update
     *
     * @param accountName     账号名
     * @param accountPassword 账号密码
     * @return 操作条数
     */
    long updateAccount(String accountName, String accountPassword);

    /**
     * 查询
     *
     * @param accountName 账号名
     * @return 查询结果
     */
    AccountModel queryModel(String accountName);

    /**
     * 删除
     *
     * @param accountName 账户名
     * @return 操作条数
     */
    long deleteAccount(String accountName);

    /**
     * 查询多条
     *
     * @param accountName 账户名
     * @return 查询结果
     */
    List<AccountModel> queryModels(String accountName);

}
