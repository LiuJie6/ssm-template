package com.lj.ssm.model.baisc;

/**
 * Project Name:ssm-template
 * File Name:AccountModel
 * Package Name:com.lj.ssm.model.baisc
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */



public class AccountModel {

    private long accountId;

    private String accountName;

    private String accountPassword;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountPassword='" + accountPassword + '\'' +
                '}';
    }
}
