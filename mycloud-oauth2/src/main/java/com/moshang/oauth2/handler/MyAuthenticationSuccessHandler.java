package com.moshang.oauth2.handler;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moshang.oauth2.config.SecurityProperties;
import com.moshang.util.LoginType;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xww
 * Created on 2019/5/6.
 */
@Component
public class MyAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * json 转换工具类
     */
    private ObjectMapper objectMapper;
    @Autowired
    private SecurityProperties securityProperties;



    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("登录成功");

        //判断是json 格式返回 还是 view 格式返回
        if (LoginType.JSON.equals(securityProperties.getBrowser().getLoginType())){
            //将 authention 信息打包成json格式返回
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(objectMapper.writeValueAsString(authentication));
        }else {
            //返回view
            super.onAuthenticationSuccess(request,response,authentication);
        }

    }
}
