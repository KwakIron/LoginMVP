package com.guozhe.android.http.login.login.login.model;

/**
 * Created by guozhe on 2017. 10. 5..
 */

public class UserModel implements IUser{
    String name;
    String passwd;

    public UserModel(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPasswd() {
        return passwd;
    }

    @Override
    public int checkUserValidity(String name, String passwd){
        if (name==null || passwd==null || !name.equals(getName())||!passwd.equals(getPasswd())){
            return -1;
        }
        return 0;
    }
}
