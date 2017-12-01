/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.simplefactory.manyfactory;

import com.factorymethod.simplefactory.Sender;

/**
 * @author zhongyuan.Yang
 * @Title: 测试
 * @Description: (描述此类的功能)
 * @date 2017-11-29 16:37
 */
public class FactoryTest {
	public static void main(String[] args) {
		SenderFactory senderFactory = new SenderFactory();
		Sender sender = senderFactory.smsProduct();
		sender.send();
	}
}

