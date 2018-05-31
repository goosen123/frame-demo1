package com.goosen.demo2.model.response.goods;

import java.util.Date;
import java.util.List;

import com.goosen.demo2.commons.model.User;

public class GoodsListRespData {
	private static final long serialVersionUID = -1798624246112367234L;
	
	
    private List<User> goodsList;

    private String hh;
    
    private Integer ih;
    
    private Date createDate;

	public List<User> getGoodsList() {
		return goodsList;
	}


	public void setGoodsList(List<User> goodsList) {
		this.goodsList = goodsList;
	}


	public String getHh() {
		return hh;
	}


	public void setHh(String hh) {
		this.hh = hh;
	}


	public Integer getIh() {
		return ih;
	}


	public void setIh(Integer ih) {
		this.ih = ih;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
