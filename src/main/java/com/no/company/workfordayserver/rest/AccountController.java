package com.no.company.workfordayserver.rest;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class AccountController {

    private ArrayList<Account> accounts;

    public AccountController() {
        this.accounts = new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/account/register/")
    public void register(@RequestBody Account account){
        accounts.add(account);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/account/login")
    public boolean autorized(@RequestBody Account logAccount){
        //noinspection OptionalGetWithoutIsPresent
        return accounts.stream().filter(regAccount2 -> regAccount2.getLogin().compareTo(logAccount.getLogin())==0)
                .findFirst().get().checkPassword(logAccount.getPassword());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/account/change/password")
    public void setPassword(@RequestBody Account account, @RequestHeader String Authorization){
        Account regAccount = checkToken(Authorization, account.getLogin());
        if (regAccount!=null)
                regAccount.setPassword(account.getPassword());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/account/change/login")
    public void setLogin(@RequestBody Account account, @RequestHeader String Authorization){
        Account regAccount = checkToken(Authorization, account.getLogin());
        if (regAccount!=null)
            regAccount.setLogin(account.getLogin());
    }

    //forTesting
    @RequestMapping(method = RequestMethod.GET, value = "/account/get")
    public Account getAccount(@RequestParam( name = "login") String login){
        return accounts.stream().filter(account -> account.getLogin().compareTo(login)==0)
                .findFirst().get();
    }

    //TODO
    public Account checkToken(String token, /*Temporary  Solution*/ String login){
        return accounts.stream().filter(account -> account.getLogin().compareTo(login)==0)
                .findFirst().get();
    }
}
