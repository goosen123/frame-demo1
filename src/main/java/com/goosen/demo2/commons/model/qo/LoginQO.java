package com.goosen.demo2.commons.model.qo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * @desc 登录QO
 *
 * @author zhumaer
 * @since 3/3/2018 22:39 PM
 */
@ApiModel(value="登录QO")
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class LoginQO {

    @NotBlank
    @ApiModelProperty(value = "账号")
    private String account;

    @NotBlank
    @ApiModelProperty(value = "密码")
    private String pwd;

    @NotEmpty
    @ApiModelProperty(value = "凭证类型")
    private List<String> type;
    
    

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}
	
}

