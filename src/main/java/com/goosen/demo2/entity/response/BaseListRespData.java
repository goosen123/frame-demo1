package com.goosen.demo2.entity.response;

import java.util.List;

import com.goosen.demo2.entity.User;

/** 
 * 类说明 
 * @author  sunney
 * @version V1.0  
 * @createTime 创建时间：2016年2月23日 上午11:41:31 
 * @email huangjiangnanjava@163.com
 */
public class BaseListRespData<T> extends BaseRespData{

	private static final long serialVersionUID = 3536431311056183802L;

	private List<T> list;
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
 