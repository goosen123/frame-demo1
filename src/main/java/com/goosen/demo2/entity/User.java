package com.goosen.demo2.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.goosen.demo2.commons.validator.CreateGroup;

public class User {
	private String id;
	 /**
     * 昵称
     */
    @NotBlank
    @Length(min = 1, max = 64, groups = CreateGroup.class)
	private String nickName;
	private String pwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
