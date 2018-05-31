package com.goosen.demo2.commons.model.request;

import javax.validation.constraints.NotNull;

public class BaseDeleteReqData<T> extends BaseReqData{

	private static final long serialVersionUID = 3536431311056183802L;
	
	@NotNull
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
