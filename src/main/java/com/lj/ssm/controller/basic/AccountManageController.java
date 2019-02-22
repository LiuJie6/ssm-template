package com.lj.ssm.controller.basic;

import com.lj.ssm.model.baisc.AccountModel;
import com.lj.ssm.model.response.ResponseResult;
import com.lj.ssm.model.state.State;
import com.lj.ssm.service.basic.account.api.IAccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project Name:ssm-template
 * File Name:AccountManageController
 * Package Name:com.lj.ssm.controller.basic
 * Date:2019/2/22
 * Author:liujie
 * Description:
 * Copyright (c) 2019, 重庆云凯科技有限公司 All Rights Reserved.
 */


@RestController("accountManageController")
@RequestMapping("api/manage/account")
public class AccountManageController {

    @Resource(name = "accountService")
    private IAccountService accountService;

    @GetMapping("create")
    public Object createAccount(@RequestParam(value = "accountName") String accountName,
                                @RequestParam(value = "accountPassword") String accountPassword) {
        try {
            long operationsNum = this.accountService.insertAccount(accountName, accountPassword);
            Map<String, Object> map = new HashMap<>();
            map.put("accountId", operationsNum);
            return new ResponseResult(true, State.SUCCESS.getCode(), "", map);
        } catch (Exception e) {
            return new ResponseResult(false, State.FAILURE.getCode(), e.getMessage());
        }
    }

    @PostMapping("query/count")
    public Object queryCount() {
        try {
            int count = this.accountService.queryCount();
            Map<String, Object> map = new HashMap<>();
            map.put("count", count);
            return new ResponseResult(true, State.SUCCESS.getCode(), "", map);
        } catch (Exception e) {
            return new ResponseResult(false, State.FAILURE.getCode(), e.getMessage());
        }
    }

    @PostMapping("query")
    public Object queryModel(@RequestParam(value = "accountName") String accountName){
        try{
            List<AccountModel> accountModel = this.accountService.queryModels(accountName);
            Map<String, Object> map = new HashMap<>();
            map.put("accountModels", accountModel);
            return new ResponseResult(true, State.SUCCESS.getCode(), "", map);
        }catch (Exception e){
            return new ResponseResult(false, State.FAILURE.getCode(), e.getMessage());
        }
    }
}
