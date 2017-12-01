/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.singleton.lazy;

/**
 * @author zhongyuan.Yang
 * @Title: 懒汉式单例模式
 * @Description: (描述此类的功能)
 * @date 2017-11-28 15:57
 */
public class LazySingleton {
	/**
	 * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
	 */
	private static LazySingleton instance = null;

	/**
	 * 私有构造方法：防止类在外围被实例化
	 */
	private LazySingleton() {}

	/**
	 * 静态工程方法，创建实例
	 * @return
	 */
	public static synchronized LazySingleton getInstance() {
		if (null == instance) {
			instance = new LazySingleton();
		}
		return instance;
	}
}

