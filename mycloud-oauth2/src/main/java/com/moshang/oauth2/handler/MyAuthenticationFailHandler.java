package com.moshang.oauth2.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moshang.oauth2.config.SecurityProperties;
import com.moshang.util.LoginType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
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
public class MyAuthenticationFailHandler extends SimpleUrlAuthenticationFailureHandler {
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * json 转换工具类
     */
    private ObjectMapper objectMapper;

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {

        logger.info("登录失败");

        //如果是json 格式
        if (LoginType.JSON.equals(securityProperties.getBrowser().getLoginType())){
            //设置状态码
            response.setStatus(500);
            //将 登录失败 信息打包成json格式返回
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(objectMapper.writeValueAsString(e));
        }else{
            //如果不是json格式，返回view
            super.onAuthenticationFailure(request,response,e);
        }

    }
}
