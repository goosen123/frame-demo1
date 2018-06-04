package com.goosen.demo2.commons.model.po.user;

import java.util.List;

import com.goosen.demo2.commons.model.BasePO;

public class User extends BasePO<String>{
	
	private static final long serialVersionUID = -7491215402569546437L;
	
	private String id;

	private String nickname;

	private String gender;

	private String avatar;

	private String type;

	private String status;
	
	private Double wallet;

	private List<User> list;
	

	
	
	public Double getWallet() {
		return wallet;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
