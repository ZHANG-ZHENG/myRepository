package com.ruijie.ioc.dao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在Controller的返回类型上使用此注解，就会以ResponseInfo包装返回对象
 */
@Target(ElementType.FIELD) 
@Retention(RetentionPolicy.RUNTIME)
public @interface Join {
	public String thisId() default "";
	public String thatId() default "";
}

