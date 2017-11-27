package com.observer;/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */

/**
 * @author zhongyuan.Yang
 * @Title: 抽象主题角色
 * @Description: (描述此类的功能)
 * @date 2017-11-27 15:51
 */
public interface Watched {
	/**
	 * 增加观察者
	 * @param watcher
	 */
	void addWatcher(Watcher watcher);

	/**
	 * 移除观察者
	 * @param watcher
	 */
	void removeWatcher(Watcher watcher);

	/**
	 * 通知观察者
	 * @param message
	 */
	void notifyWatcher(String message);
}
