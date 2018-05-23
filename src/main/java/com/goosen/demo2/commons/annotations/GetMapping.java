package com.goosen.demo2.commons.annotations;

import java.lang.annotation.*;

/**
 * @desc 标识get请求注解
 * 
 * @author Goosen
 * @since 10/17/2018 3:13 PM
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GetMapping {

}
