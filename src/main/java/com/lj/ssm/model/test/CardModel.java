package com.lj.ssm.model.test;

import java.util.List;

/**
 * Project Name:ssm-template
 * File Name:CardModel
 * Package Name:com.lj.ssm.model.test
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


public class CardModel {

    private long cardId;

    private long userId;

    private String cardName;

    private String accountAddress;

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }
}
