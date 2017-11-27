/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongyuan.Yang
 * @Title: 具体主题角色
 * @Description: (描述此类的功能)
 * @date 2017-11-27 15:56
 */
public class ConcreteWatched implements Watched {

	/**
	 * 存放所有的观察者
	 */
	List<Watcher> watcherList = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		watcherList.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		watcherList.remove(watcher);
	}

	@Override
	public void notifyWatcher(String message) {
		for (Watcher watcher : watcherList) {
			watcher.update(message);
		}
	}
}

