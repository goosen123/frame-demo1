package com.goosen.demo2.model.response.user;

import java.util.List;

import com.goosen.demo2.commons.model.User;
import com.goosen.demo2.commons.model.response.BaseListRespData;

public class UserListRespData extends BaseListRespData<UserList>{
	private static final long serialVersionUID = -7491215402569546437L;
	
	private String extr;

	public String getExtr() {
		return extr;
	}

	public void setExtr(String extr) {
		this.extr = extr;
	}
	
}
