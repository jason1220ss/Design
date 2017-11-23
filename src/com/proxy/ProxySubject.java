/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.proxy;

/**
 * @author zhongyuan.Yang
 * @Title: 代理角色
 * @Description: (描述此类的功能)
 * @date 2017-11-23 17:24
 */
public class ProxySubject extends Subject {

	/**
	 * 代理角色内部引用真实角色
	 */
	private RealSubject realSubject;
	@Override
	public void request() {

		// 在真实角色操作之前的附加操作
		this.preRequest();

		if (null == realSubject) {
			realSubject = new RealSubject();
		}

		//真实角色的操作
		realSubject.request();

		// 在真实角色操作之后的附加操作
		this.afterRequest();
	}

	private void preRequest() {
		System.out.println("pre request");
	}
	private void afterRequest() {
		System.out.println("after request");
	}
}

