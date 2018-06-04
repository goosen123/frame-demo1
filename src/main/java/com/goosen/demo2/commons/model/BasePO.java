package com.goosen.demo2.commons.model;

//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;

import java.util.Date;

import javax.persistence.Column;

/**
 * 基础PO类
 * @author Goosen
 * @since 2018-05-31 pm
 */
//@Data
public abstract class BasePO<PK> implements PO<PK> {

//	@ApiModelProperty(value = "创建时间")
	@Column(name = "create_time")
	private Date createTime = new Date();

//	@ApiModelProperty(value = "更新时间")
	@Column(name = "update_time")
	private Date updateTime = new Date();

//	public BasePO() {
//		
//	}
//	
//	public BasePO(Date createTime,Date updateTime) {
//		this.createTime = createTime;
//		this.updateTime = updateTime;
//	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
