package com.goosen.demo2.entity.response;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.goosen.demo2.commons.annotations.EnumValue;
import com.goosen.demo2.commons.validator.CreateGroup;
import com.goosen.demo2.entity.User.UserGenderEnum;

public class UserModel {
	
	private static final long serialVersionUID = -7491215402569546437L;
	
	@NotBlank(groups={CreateGroup.class})
	@Length(min=1, max=64)
	private String nickname;

	@NotBlank
	@EnumValue(enumClass=UserGenderEnum.class, enumMethod="isValidName")
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
