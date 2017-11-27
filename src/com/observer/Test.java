/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.observer;

/**
 * @author zhongyuan.Yang
 * @Title: 测试
 * @Description: (描述此类的功能)
 * @date 2017-11-27 16:01
 */
public class Test {
	public static void main(String[] args) {

		Watched watched = new ConcreteWatched();

		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();

		watched.addWatcher(watcher1);
		watched.addWatcher(watcher2);
		watched.addWatcher(watcher3);

		watched.notifyWatcher("hello");

		watched.removeWatcher(watcher1);
		watched.notifyWatcher("delete one");
	}
}

