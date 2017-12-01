/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.factorymethod;

/**
 * @author zhongyuan.Yang
 * @Title: 具体工厂类
 * @Description: 手机发短信
 * @date 2017-11-30 16:35
 */
public class PhoneFactory implements Factory{
	@Override
	public Sender produce() {
		System.out.print("手机发送");
		return new SmsSender();
	}
}

