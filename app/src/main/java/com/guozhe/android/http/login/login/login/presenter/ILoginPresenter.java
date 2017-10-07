package com.guozhe.android.http.login.login.login.presenter;

/**
 * Created by guozhe on 2017. 10. 5..
 */

public interface ILoginPresenter {
    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}
