package com.goosen.demo2.entity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户列表实体")
public class UserList {

	private static final long serialVersionUID = -7491215402569546437L;
	
	@ApiModelProperty(value="用户昵称",example="郭靖")
	private String nickname;

	@ApiModelProperty(value="性别",example="MALE")
	private String gender;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
