/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.simplefactory.staticfactory;

import com.factorymethod.simplefactory.Sender;

/**
 * @author zhongyuan.Yang
 * @Title: 测试
 * @Description: (描述此类的功能)
 * @date 2017-11-29 16:41
 */
public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SenderFactory.mailProduct();
		sender.send();
	}
}

