package com.goosen.demo2.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.goosen.demo2.commons.annotations.GetMapping;
import com.goosen.demo2.commons.annotations.ResponseResult;
import com.goosen.demo2.commons.enums.ResultCode;
import com.goosen.demo2.commons.exception.BusinessException;
import com.goosen.demo2.commons.model.qo.PageQO;
import com.goosen.demo2.commons.model.vo.PageVO;
import com.goosen.demo2.commons.utils.RequestContextUtil;
import com.goosen.demo2.entity.User;
import com.goosen.demo2.entity.response.BaseListRespData;
import com.goosen.demo2.entity.response.UserList;
import com.goosen.demo2.entity.response.UserListRespData;
import com.goosen.demo2.service.PersonService;

@RestController
@RequestMapping(value="person")
public class PersonController {
	protected Logger log = LoggerFactory.getLogger(getClass());

//	@Autowired
//    private UserService userService;
	
	@Autowired
    private PersonService personService;
	
	@ResponseResult
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = {"addUser1"})//,method=RequestMethod.POST
	public User addUser1(@Validated @RequestBody User user) {//(CreateGroup.class)
		
		log.info("进来addUser<<<<<<<<<<<<<<<<<<<<");
		
//		int i =2/0;
		
//		String str = null;
//		Assert.notNull(str, "str is not null.");
		
//		String testStr = personService.insertest("哈哈");
//		log.info("testStr:"+testStr);
		
//		personService.updateLoginInfo(user);
		
//		user = personService.selectByKey(user.getId());
		
//		BaseAdd baseAdd = new BaseAdd();
//		baseAdd.setId(user.getId());
		
//		List<User> list = new ArrayList<User>();
//		User user1 = new User();
//		user1.setId("123");
//		user1.setNickname("hh");
//		list.add(user1);
//		User user2 = new User();
//		user2.setId("124");
//		user2.setNickname("hh2");
//		list.add(user2);
//		user.setList(list);
		
//		GoodsListRespData resp = new GoodsListRespData();
//		//resp.setGoodsList(list);
//		resp.setHh("hh");
//		resp.setIh(10);
//		resp.setCreateDate(new Date());
		
//		List<User> list = user.getList();
//		for (int i = 0; i < list.size(); i++) {
//			User user1 = list.get(i);
//			log.info("user.nickname:"+user1.getNickname());
//		}
		
		return user;
	}
	
	@ResponseResult
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = {"getUser1"})//,method=RequestMethod.GET
	public User getUser1(String id,String nickname) {//(CreateGroup.class)
		
		log.info("进来getUser1<<<<<<<<<<<<<<<<<<<<");
		log.info("接收的参数：id"+id+",nickname:"+nickname);
		
		HttpServletRequest request = RequestContextUtil.getRequest();
		String idReq = request.getParameter("id");
		log.info("接收的参数：idReq"+idReq);
		
		User user1 = new User();
		user1.setId("123");
		user1.setNickname("hh");
		
		return user1;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = {"callbackAli"})
	public String callbackAli() {
		
		log.info("进来callbackAli<<<<<<<<<<<<<<<<<<<<");
		
		HttpServletRequest request = RequestContextUtil.getRequest();

//		log.info("支付宝回调");
//		//获取支付宝POST过来反馈信息
//		Map<String,String> params = new HashMap<String,String>();
//		Map requestParams = request.getParameterMap();
//		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
//			String name = (String) iter.next();
//			String[] values = (String[]) requestParams.get(name);
//			String valueStr = "";
//			for (int i = 0; i < values.length; i++) {
//				valueStr = (i == values.length - 1) ? valueStr + values[i]
//						: valueStr + values[i] + ",";
//			}
//			//乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
//			//valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
//			params.put(name, valueStr);
//		}
//		
//		//获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
//		//商户订单号
//		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
//
//		//支付宝交易号
//		String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
//
//		//交易状态
//		String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");
//
//		// 获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以上仅供参考)//
//
//		log.info("支付宝回调out_trade_no=" + out_trade_no + "trade_no" + trade_no);
//
//		if (AlipayNotify.verify(params)) {// 验证成功
//			// 请在这里加上商户的业务逻辑程序代码
//			// ——请根据您的业务逻辑来编写程序（以下代码仅作参考）——
//			/*WAIT_BUYER_PAY	交易创建，等待买家付款。
//			TRADE_CLOSED	在指定时间段内未支付时关闭的交易；
//			在交易完成全额退款成功时关闭的交易。
//			TRADE_SUCCESS	交易成功，且可对该交易做操作，如：多级分润、退款等。
//			TRADE_FINISHED	交易成功且结束，即不可再做任何操作。*/
//			if (trade_status.equals("TRADE_FINISHED")||trade_status.equals("TRADE_SUCCESS")) {
//				// 判断该笔订单是否在商户网站中已经做过处理
//				// 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
//				// 如果有做过处理，不执行商户的业务程序
//				// 注意：
//				// 付款完成后，支付宝系统发送该交易状态通知
//				// 请务必判断请求时的total_fee、seller_id与通知时获取的total_fee、seller_id为一致的
//				logger.info("支付宝TRADE_SUCCESS，支付成功，params" + params.toString());
//				PayCallBackReqData payCallBackReqData = new PayCallBackReqData();
//				payCallBackReqData.setExtend(params.toString());
//				payCallBackReqData.setOrder_no(out_trade_no);
//				payCallBackReqData.setOut_trade_no(trade_no);
//				payCallBackReqData.setTrade_status(1);//支付成功
//				return callback(payCallBackReqData);
//			}else{
//				logger.info("支付宝TRADE_SUCCESS，支付失败，params=" + params.toString());
//				/*PayCallBackReqData payCallBackReqData = new PayCallBackReqData();
//				payCallBackReqData.setExtend(params.toString());
//				payCallBackReqData.setOrder_no(out_trade_no);
//				payCallBackReqData.setOut_trade_no(trade_no);
//				payCallBackReqData.setTrade_status(2);//支付成功
//				return callback(payCallBackReqData);*/
//				return FAILURE;
//			}
//		} else {// 验证失败
//			logger.info("支付宝认证失败，params="+params.toString());
//			return FAILURE;
//		}
		return "success";
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = {"callbackWx"})
	public String callbackWx() throws Exception {
		
		log.info("进来callbackWx<<<<<<<<<<<<<<<<<<<<");
		
		HttpServletRequest request = RequestContextUtil.getRequest();
		HttpServletResponse response = RequestContextUtil.getResponse();

		log.info("微信回调");
		BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String backXml = "";
		String line = null;
		while ((line = in.readLine()) !=null) {
			backXml += line;
		}
		Document reback = DocumentHelper.parseText(backXml);
		Element rootElement = reback.getRootElement();
		Element return_code = rootElement.element("return_code");
		String returnCode  = return_code.getText();
		//测试
		if(returnCode == null || returnCode.length() == 0){
			throw new BusinessException(ResultCode.PARAM_IS_BLANK);
		}
		log.info("参数returnCode："+returnCode);
//		Element out_trade_no = rootElement.element("out_trade_no");
//		String outTradeNo  = out_trade_no.getText();
//		Element transaction_id = rootElement.element("transaction_id");
//		String transactionId  = transaction_id.getText();
		
//		log.info("微信回调out_trade_no="+outTradeNo+",return_code="+returnCode);
		PrintWriter out = response.getWriter(); 
	
		String backStr = "";
//		if("SUCCESS".equalsIgnoreCase(returnCode)){
//			log.info("微信TRADE_SUCCESS，支付成功，params" + reback.asXML());
//			
//			Element sign = rootElement.element("sign");
//			String sign_str  = sign.getText();
//			
////			String workPaySignValue = WxPayMgr.buildSign(rootElement, WxpayConfig.mch_key);
////			// 缺少认证回调方法
////			if(sign_str.equals(workPaySignValue)){
////				PayCallBackReqData payCallBackReqData = new PayCallBackReqData();
////				payCallBackReqData.setExtend(reback.asXML());
////				payCallBackReqData.setOrder_no(outTradeNo);
////				payCallBackReqData.setOut_trade_no(transactionId);
////				payCallBackReqData.setTrade_status(1);//支付成功
////				backStr = callback(payCallBackReqData).toUpperCase();
////			}else{
////				logger.info("签名不一样,workPaySignValue="+workPaySignValue);
////				backStr = FAILURE.toUpperCase();
////			}
//		}else{
//			log.info("微信TRADE_SUCCESS，支付失败，params" + reback.asXML());
//			/*PayCallBackReqData payCallBackReqData = new PayCallBackReqData();
//			payCallBackReqData.setExtend(reback.asXML());
//			payCallBackReqData.setOrder_no(outTradeNo);
//			payCallBackReqData.setOut_trade_no(transactionId);
//			payCallBackReqData.setTrade_status(2);//支付失败
//			backStr = callback(payCallBackReqData).toUpperCase();*/
//		}
		
		Document document = DocumentHelper.createDocument();// 创建根节点
		Element back_root = document.addElement("xml");
		Element code = back_root.addElement("return_code");
		code.setText(backStr);
		Element return_msg = back_root.addElement("return_msg");
		return_msg.setText("OK");
		log.info(document.asXML());
		out.println(document.asXML());
		return null;
	}
	
	//分页
	@ResponseResult
	@RequestMapping(value = {"getList1"})
    public PageVO<User> getList1(PageQO pageQO) {
		Page<User> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize(), pageQO.getOrderBy());
		personService.findAllUserList();
        return PageVO.build(page);
    }
	
	//不分页
	@ResponseResult
	@RequestMapping(value = {"getList2"})
    public UserListRespData getList2() {
		List<UserList> list = personService.findAllUserList();
		UserListRespData userListRespData = new UserListRespData();
		userListRespData.setExtr("扩展的东西");
		userListRespData.setList(list);//new ArrayList<User>()
        return userListRespData;
    }
	
	//分页
	@ResponseResult
	@RequestMapping(value = {"getList3"})
    public PageVO<UserList> getList3(PageQO pageQO) {
		PageVO<UserList> page = personService.findUserPage(pageQO);
        return page;
    }
	
	@ResponseResult
	@RequestMapping(value = {"getList4"})
    public BaseListRespData<UserList> getList4() {
		BaseListRespData<UserList> baseListRespData = personService.findAllUserList2();
        return baseListRespData;
    }
	
////	@RequestMapping(value = {"getList3"})
////	public PageVO<User> getList(PageQO pageQO, User userQO) {
////	    pageQO.setCondition(userQO);
////	    return userService.selectPage(pageQO);
////	}
//
//    //@GetMapping
////	@RequestMapping(value = {"getList"})
////    public PageVO<User> getList(PageQO pageQO, User userQO) {
////        pageQO.setCondition(userQO);
////        return userService.selectPage(pageQO);
////    }
	
}
