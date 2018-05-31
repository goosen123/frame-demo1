package com.goosen.demo2.commons.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import com.goosen.demo2.commons.enums.CallSourceEnum;
import com.goosen.demo2.commons.model.po.LoginCredential;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;

/**
 * 登录的TOKEN
 * @author Goosen
 * @since 2018-05-31 pm
 */
@ApiModel("登录的TOKEN")
//@Data
//@EqualsAndHashCode(callSuper = false)
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class LoginToken {

	@ApiModelProperty(value = "登陆token ID", required = true, position = 0)
	private String id;

	@ApiModelProperty(value = "生存时长(单位：秒)", required = true, position = 1)
	private Long ttl;

	@ApiModelProperty(value = "登录IP", required = true, position = 2)
	private String ip;

	/**
	 * 平台 {@link CallSourceEnum}
	 */
	@ApiModelProperty(value = "登录平台", required = true, position = 3)
	private String platform;

	@ApiModelProperty(value = "登录时间", required = true, position = 4)
	private Date createTime;

	@ApiModelProperty(value = "登录凭证", required = true, position =5)
	LoginCredential loginCredential;

	@ApiModelProperty(value = "登录的用户信息", required = true, position = 6)
	private LoginUser loginUser;

	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTtl() {
		return ttl;
	}

	public void setTtl(Long ttl) {
		this.ttl = ttl;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public LoginCredential getLoginCredential() {
		return loginCredential;
	}

	public void setLoginCredential(LoginCredential loginCredential) {
		this.loginCredential = loginCredential;
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}
}
