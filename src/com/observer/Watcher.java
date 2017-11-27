/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.observer;

/**
 * @author zhongyuan.Yang
 * @Title: 抽象观察者角色
 * @Description: (描述此类的功能)
 * @date 2017-11-27 15:52
 */
public interface Watcher {
	/**
	 * 得到主题通知时更新自己
	 * @param message
	 */
	void update(String message);
}

