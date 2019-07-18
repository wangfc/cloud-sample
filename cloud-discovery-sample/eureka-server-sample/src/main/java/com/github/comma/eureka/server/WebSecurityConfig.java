package com.github.comma.eureka.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author wangfuchu
 * @desciption
 * @date 2019/7/17
 */
@Configuration
public class WebSecurityConfig {

    @EnableWebSecurity
    public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            //加入security后，会开戾csrf，注册请求会被拦截，导致注册失败，忽略/eureka开头的请求
            http.csrf().ignoringAntMatchers("/eureka/**");
            super.configure(http);
        }
    }
}
