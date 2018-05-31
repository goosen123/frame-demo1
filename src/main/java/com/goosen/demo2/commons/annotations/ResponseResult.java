package com.goosen.demo2.commons.annotations;

import com.goosen.demo2.commons.result.PlatformResult;
import com.goosen.demo2.commons.result.Result;

import java.lang.annotation.*;

/**
 * 接口返回结果增强  会通过拦截器拦截后放入标记，在ResponseResultHandler 进行结果处理
 * @author Goosen
 * @since 2018-05-31 pm
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {

    Class<? extends Result>  value() default PlatformResult.class;

}
