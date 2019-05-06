package com.moshang.oauth2.config;

import com.moshang.util.LoginType;

/**
 * @author xww
 * Created on 2019/5/6.
 */
public class BrowserProperties {
    /**
     *  loginPage 默认值  是login.html
     */
    private String loginPage = "/login.html";

    /**
     * 默认 返回 json 类型
     */
    private LoginType loginType = LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
