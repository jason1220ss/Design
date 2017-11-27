/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.observer;

/**
 * @author zhongyuan.Yang
 * @Title: 具体观察者角色
 * @Description: (描述此类的功能)
 * @date 2017-11-27 15:57
 */
public class ConcreteWatcher implements Watcher {

	@Override
	public void update(String message) {
		System.out.println(message);
	}
}

