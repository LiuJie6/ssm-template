package com.lj.ssm.model.test;

import java.util.List;

/**
 * Project Name:ssm-template
 * File Name:UserModel
 * Package Name:com.lj.ssm.model.test
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */
public class UserModel {

    private long userId;

    private String userName;

    private String password;

    private String email;

    private CardModel cardModel;

    private List<BankCardModel> bankCardModels;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CardModel getCardModel() {
        return cardModel;
    }

    public void setCardModel(CardModel cardModel) {
        this.cardModel = cardModel;
    }

    public List<BankCardModel> getBankCardModels() {
        return bankCardModels;
    }

    public void setBankCardModels(List<BankCardModel> bankCardModels) {
        this.bankCardModels = bankCardModels;
    }
}
