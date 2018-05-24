package com.goosen.demo2.entity.response;

public class BaseCudRespData<T> extends BaseRespData {

	private static final long serialVersionUID = 3536431311056183802L;
	
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
