package com.goosen.demo2.model.request.user;

import org.hibernate.validator.constraints.NotBlank;

import com.goosen.demo2.commons.model.User;

public class UserCommitReqData extends User{

	private static final long serialVersionUID = 3536431311056183802L;
	
//	@NotBlank
	private String actionType;
	
	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
}
