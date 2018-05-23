package com.goosen.demo2.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 通用的实体或者java bean的父类
 * @author jarlun
 */
@SuppressWarnings("serial")
public abstract class GenericEntity implements Serializable {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
