package com.goosen.demo2.entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.goosen.demo2.commons.annotations.EnumValue;
import com.goosen.demo2.commons.annotations.MoneyValue;
import com.goosen.demo2.commons.model.po.BasePO;
import com.goosen.demo2.commons.validator.CreateGroup;

public class User extends BasePO<String>{
	
	private static final long serialVersionUID = -7491215402569546437L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT REPLACE(UUID(),'-','')")
	@Length(min=1, max=64)
	private String id;

	@NotBlank(groups={CreateGroup.class})
	@Length(min=1, max=64)
	private String nickname;

	@NotBlank
	@EnumValue(enumClass=UserGenderEnum.class, enumMethod="isValidName")
	private String gender;

	@Length(max=256)
	private String avatar;

	private String type;

	private String status;
	
	@MoneyValue
	private Double wallet;

	private List<User> list;
	
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
