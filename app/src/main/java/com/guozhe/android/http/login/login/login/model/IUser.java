package com.guozhe.android.http.login.login.login.model;

/**
 * Created by guozhe on 2017. 10. 5..
 */

public interface IUser {
    String getName();

    String getPasswd();

    int checkUserValidity(String name, String passwd);
}
