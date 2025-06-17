package com.yehorychev.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import javax.sql.DataSource;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource);

//        UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("yehor")
//                        .password("yehor")
//                        .roles("EMPLOYEE"))
//                .withUser(userBuilder.username("tanya")
//                        .password("tanya")
//                        .roles("HR"))
//                .withUser(userBuilder.username("mike")
//                        .password("mike")
//                        .roles("MANAGER", "HR"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                .hasAnyRole("EMPLOYEE", "HR", "MANAGER")
                .antMatchers("/hr_info")
                .hasRole("HR")
                .antMatchers("/manager_info")
                .hasRole("MANAGER")
                .and()
                .formLogin()
                .permitAll();
    }
}