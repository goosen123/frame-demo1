package com.goosen.demo2.commons.model.response.login;

import com.goosen.demo2.commons.annotations.EnumValue;
import com.goosen.demo2.commons.model.BasePO;
import com.goosen.demo2.commons.model.Model;

import io.swagger.annotations.ApiModelProperty;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @desc 登录凭证VO

 * @author zhumaer
 * @since 6/15/2017 2:48 PM
 */
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class LoginCredentialVO implements Model {

    private static final long serialVersionUID = 5550420394013305835L;

    @ApiModelProperty(value = "凭证ID")
    private Long id;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "账号类型")
    private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
