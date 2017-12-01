/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.factorymethod;

/**
 * @author zhongyuan.Yang
 * @Title: 实现接口功能
 * @Description: 邮件方式
 * @date 2017-11-29 16:13
 */
public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("mail!");
	}
}