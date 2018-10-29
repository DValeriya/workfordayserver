package com.no.company.workfordayserver.rest;

import java.util.Date;

public class Account {

    private String login;
    private String name;
    private String surname;
    private String password;
    private String mail;
    private String phoneNumber;
    //TODO
    /*private Date date_of_register;
    private Date birth;*/
    private int readyOders;

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
/*
    public Date getDate_of_register() {
        return date_of_register;
        //TODO
    }

    public Date getBirth() {
        return birth;
        //TODO
    }*/

    public int getReadyOders() {
        return readyOders;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
/*
    public void setDate_of_register(Date date_of_register) {
        this.date_of_register = date_of_register;
        //TODO
    }

    public void setBirth(Date birth) {
        this.birth = birth;
        //TODO
    }*/

    public void setReadyOders(int readyOders) {
        this.readyOders = readyOders;
    }

    public boolean checkPassword(String password){
        return this.getPassword().compareTo(password) == 0;
    }


}
