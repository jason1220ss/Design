/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.proxy;

/**
 * @author zhongyuan.Yang
 * @Title: 客户端
 * @Description: (描述此类的功能)
 * @date 2017-11-23 17:32
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.request();
	}
}

