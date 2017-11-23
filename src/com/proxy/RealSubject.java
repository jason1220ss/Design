/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.proxy;

/**
 * @author zhongyuan.Yang
 * @Title: 真实角色
 * @Description: (描述此类的功能)
 * @date 2017-11-23 17:22
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("From Real Subject!");
	}
}

