package com.lj.ssm.service.basic.account.impl;

import com.lj.ssm.dao.basic.IAccountDao;
import com.lj.ssm.model.baisc.AccountModel;
import com.lj.ssm.service.basic.account.api.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project Name:ssm-template
 * File Name:AccountServiceImpl
 * Package Name:com.lj.ssm.service.basic.account.impl
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


@Service("accountService")
public class AccountServiceImpl implements IAccountService{

    @Resource
    private IAccountDao accountDao;

    /**
     * 新增
     *
     * @param accountName     用户名
     * @param accountPassword 用户密码
     * @return 用户id
     */
    @Override
    public long insertAccount(String accountName, String accountPassword) {
        AccountModel accountModel = new AccountModel();
        accountModel.setAccountName(accountName);
        accountModel.setAccountPassword(accountPassword);
        return this.accountDao.insertAccount(accountModel);
    }

    /**
     * 查询总数
     *
     * @return 总数
     */
    @Override
    public int queryCount() {
        return this.accountDao.queryCount();
    }

    /**
     * update
     *
     * @param accountName     账号名
     * @param accountPassword 账号密码
     * @return 账号id
     */
    @Override
    public long updateAccount(String accountName, String accountPassword) {
        return 0;
    }

    /**
     * 查询
     *
     * @param accountName 账号名
     * @return 查询结果
     */
    @Override
    public AccountModel queryModel(String accountName) {
        return this.accountDao.queryModel(accountName);
    }

    /**
     * 删除
     *
     * @param accountName 账户名
     * @return 账户id
     */
    @Override
    public long deleteAccount(String accountName) {
        return 0;
    }

    /**
     * 查询多条
     *
     * @param accountName 账户名
     * @return 查询结果
     */
    @Override
    public List<AccountModel> queryModels(String accountName) {
        return this.accountDao.queryModels(accountName);
    }
}
