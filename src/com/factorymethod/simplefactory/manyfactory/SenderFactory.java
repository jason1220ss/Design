/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.simplefactory.manyfactory;

import com.factorymethod.simplefactory.MailSender;
import com.factorymethod.simplefactory.Sender;
import com.factorymethod.simplefactory.SmsSender;

/**
 * @author zhongyuan.Yang
 * @Title: 工厂类
 * @Description: 返回不同对象实体
 * @date 2017-11-29 16:34
 */
public class SenderFactory {

	public Sender mailProduce() {
		return new MailSender();
	}
	public Sender smsProduct() {
		return new SmsSender();
	}
}

