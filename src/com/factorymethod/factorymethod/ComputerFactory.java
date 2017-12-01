/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.factorymethod.factorymethod;

/**
 * @author zhongyuan.Yang
 * @Title: 具体工厂类
 * @Description: 电脑发送邮件
 * @date 2017-11-30 16:28
 */
public class ComputerFactory implements Factory{
	@Override
	public Sender produce() {
		System.out.print("电脑发送");
		return new MailSender();
	}
}

