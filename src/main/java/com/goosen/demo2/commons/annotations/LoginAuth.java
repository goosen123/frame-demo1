package com.goosen.demo2.commons.annotations;

import java.lang.annotation.*;

/**
 * 已登录权限验证注解
 * @author Goosen
 * @since 2018-05-31 pm
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginAuth {

}
