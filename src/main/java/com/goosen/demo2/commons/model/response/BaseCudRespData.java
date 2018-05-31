package com.goosen.demo2.commons.model.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="基础响应实体")
public class BaseCudRespData<T> extends BaseRespData {

	private static final long serialVersionUID = 3536431311056183802L;
	
	@ApiModelProperty(value="实体id",example="252525eieorurkf782")
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
