package com.moshang.oauth2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xww
 * Created on 2019/5/6.
 */
@Component
@ConfigurationProperties(prefix = "colud.security")
public class SecurityProperties {
    /**
     * 浏览器 属性类
     */
    private BrowserProperties browser = new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
