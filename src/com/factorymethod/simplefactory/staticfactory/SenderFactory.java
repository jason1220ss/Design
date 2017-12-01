/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.simplefactory.staticfactory;

import com.factorymethod.simplefactory.MailSender;
import com.factorymethod.simplefactory.Sender;
import com.factorymethod.simplefactory.SmsSender;

/**
 * @author zhongyuan.Yang
 * @Title: 工厂类
 * @Description: 静态方法可以直接调用，不需要实例化工厂类
 * @date 2017-11-29 16:39
 */
public class SenderFactory {
	public static Sender mailProduct() {
		return new MailSender();
	}
	public static Sender smsProduct() {
		return new SmsSender();
	}
}

