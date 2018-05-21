package com.goosen.demo2.entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.goosen.demo2.commons.model.po.BasePO;
import com.goosen.demo2.commons.validator.CreateGroup;

public class User extends BasePO<String>{
	
	private static final long serialVersionUID = -7491215402569546437L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT REPLACE(UUID(),'-','')")
	@Length(min=1, max=64)
	private String id;

	@NotBlank
	@Length(min=1, max=64)
	private String nickname;

	@NotBlank
	private String gender;

	@Length(max=256)
	private String avatar;

	@NotBlank
	private String type;

	@NotBlank
	private String status;

	private List<User> list;
	
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
