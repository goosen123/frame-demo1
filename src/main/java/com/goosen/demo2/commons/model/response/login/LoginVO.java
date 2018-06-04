package com.goosen.demo2.commons.model.response.login;

import com.goosen.demo2.commons.model.Model;
import com.goosen.demo2.commons.model.po.login.LoginUser;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;





import java.util.Date;
import java.util.List;

/**
 * @desc 登录VO
 *
 * @author zhumaer
 * @since 3/3/2018 22:39 PM
 */
@ApiModel("登录VO")
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class LoginVO implements Model {

    private static final long serialVersionUID = -9111387775700628962L;

    @ApiModelProperty(value = "用户登陆TOKEN")
    private String token;

    @ApiModelProperty(value = "过期时间（单位：秒）")
    private Long ttl;

    @ApiModelProperty(value = "登陆IP")
    private String ip;

    @ApiModelProperty(value = "登陆平台")
    private String platform;

    @ApiModelProperty(value = "登陆时间")
    private Date loginTime;

    @ApiModelProperty(value = "用户信息")
    private LoginUser user;

    @ApiModelProperty(value = "凭证")
    private LoginCredentialVO loginCredential;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public LoginUser getUser() {
		return user;
	}

	public void setUser(LoginUser user) {
		this.user = user;
	}

	public LoginCredentialVO getLoginCredential() {
		return loginCredential;
	}

	public void setLoginCredential(LoginCredentialVO loginCredential) {
		this.loginCredential = loginCredential;
	}
    
}

