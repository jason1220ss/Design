/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.singleton;

/**
 * @author zhongyuan.Yang
 * @Title: 单例模式
 * @Description: (描述此类的功能)
 * @date 2017-11-28 15:57
 */
public class Singleton {
	/**
	 * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
	 */
	private static Singleton singleton = null;

	/**
	 * 私有构造方法：防止类被实例化
	 */
	private Singleton() {}

	/**
	 * 静态工程方法，创建实例
	 * @return
	 */
	public static Singleton getSingleton() {
		if (null == singleton) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

