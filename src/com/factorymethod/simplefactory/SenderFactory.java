/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.simplefactory;

/**
 * @author zhongyuan.Yang
 * @Title: 工厂类
 * @Description: (描述此类的功能)
 * @date 2017-11-29 16:15
 */
public class SenderFactory {

	/**
	 * 通过传递的字符串判断是哪种工厂的方法
	 * @param type
	 * @return
	 */
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("输入有误！！！");
			return null;
		}
	}
}

