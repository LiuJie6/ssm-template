package com.lj.ssm.dao.basic;

import com.lj.ssm.model.baisc.AccountModel;

import java.util.List;

/**
 * Project Name:ssm-template
 * File Name:IAccountDao
 * Package Name:com.lj.ssm.dao.basic
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public interface IAccountDao {

    /**
     * 新增账号
     *
     * @param accountModel 账号模型
     * @return 插入条数
     */
    long insertAccount(AccountModel accountModel);

    /**
     * 查询账号总数
     *
     * @return 总数
     */
    int queryCount();

    /**
     * 根据账户名查询账户
     *
     * @param accountName 账户名
     * @return 查询结果
     */
    AccountModel queryModel(String accountName);

    /**
     * 修改账户信息
     *
     * @param accountModel 账户模型
     * @return 操作条数
     */
    long updateAccount(AccountModel accountModel);

    /**
     * 根据账户名删除账户
     *
     * @param accountName 账户名
     * @return 操作条数
     */
    long deleteAccount(String accountName);

    /**
     * 查询多条
     * @param accountName 账户名
     * @return 查询结果
     */
    List<AccountModel> queryModels(String accountName);
}
