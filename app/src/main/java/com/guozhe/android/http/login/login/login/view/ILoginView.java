package com.guozhe.android.http.login.login.login.view;

/**
 * Created by guozhe on 2017. 10. 5..
 */

public interface ILoginView {
    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}
