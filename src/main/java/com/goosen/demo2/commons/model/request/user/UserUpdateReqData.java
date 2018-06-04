package com.goosen.demo2.commons.model.request.user;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.goosen.demo2.commons.annotations.EnumValue;
import com.goosen.demo2.commons.annotations.MoneyValue;
import com.goosen.demo2.commons.model.request.BaseReqData;
import com.goosen.demo2.commons.validator.CreateGroup;

public class UserUpdateReqData extends BaseReqData{

	private static final long serialVersionUID = 3536431311056183802L;
	
	@NotEmpty
	@Length(min=1, max=64)
	private String id;

//	@NotBlank(groups={CreateGroup.class})
//	@Length(min=1, max=64)
	private String nickname;

//	@NotBlank
//	@EnumValue(enumClass=UserGenderEnum.class, enumMethod="isValidName")
	private String gender;

//	@Length(max=256)
	private String avatar;

	private String type;

	private String status;
	
//	@MoneyValue
	private Double wallet;

	
	/**
	 * 用户性别枚举
	 */
	public enum UserGenderEnum {
		/**男*/
		MALE,
		/**女*/
		FEMALE,
		/**未知*/
		UNKNOWN;

		public static boolean isValidName(String name) {
			for (UserGenderEnum userGenderEnum : UserGenderEnum.values()) {
				if (userGenderEnum.name().equals(name)) {
					return true;
				}
			}
			return false;
		}
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

	public Double getWallet() {
		return wallet;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}
	
}
