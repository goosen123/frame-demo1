package com.goosen.demo2.commons.model.bo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//import io.swagger.annotations.ApiModelProperty;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;

/**
 * @desc 登录的用户
 *
 * @author zhumaer
 * @since 6/20/2017 3:00 PM
 */
//@Data
//@EqualsAndHashCode(callSuper = false)
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class LoginUser implements Serializable{

	private static final long serialVersionUID = -3675314128118074922L;

	@ApiModelProperty(value = "用户ID")
	private String id;

	@ApiModelProperty(value = "登陆账号")
	private String nickname;

	@ApiModelProperty(value = "性别")
	private String gender;

	@ApiModelProperty(value = "头像")
	private String avatar;

	@ApiModelProperty(value = "类型")
	private String type;

	@ApiModelProperty(value = "最新登陆IP")
	private String latestLoginIp;

	@ApiModelProperty(value = "最新登陆时间")
	private Date latestLoginTime;

	
	
	
	
	
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

	public String getLatestLoginIp() {
		return latestLoginIp;
	}

	public void setLatestLoginIp(String latestLoginIp) {
		this.latestLoginIp = latestLoginIp;
	}

	public Date getLatestLoginTime() {
		return latestLoginTime;
	}

	public void setLatestLoginTime(Date latestLoginTime) {
		this.latestLoginTime = latestLoginTime;
	}

}
