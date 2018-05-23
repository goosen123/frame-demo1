package com.goosen.demo2.entity.response;

public class BaseModelRespData<T> extends BaseRespData {
	
	private static final long serialVersionUID = 3536431311056183802L;
	
	private T model;

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}
	
}
