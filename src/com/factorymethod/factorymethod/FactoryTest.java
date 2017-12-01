/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.factorymethod;

/**
 * @author zhongyuan.Yang
 * @Title: 测试类
 * @Description: (描述此类的功能)
 * @date 2017-11-30 16:37
 */
public class FactoryTest {
	public static void main(String[] args) {
		Factory factory = new PhoneFactory();
		Sender sender = factory.produce();
		sender.send();
	}
}

