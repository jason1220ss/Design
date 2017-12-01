/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.simplefactory;

/**
 * @author zhongyuan.Yang
 * @Title: 实现接口功能
 * @Description: 短信方式
 * @date 2017-11-29 16:14
 */
public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is short message!");
	}
}

