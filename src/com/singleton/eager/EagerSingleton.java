/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.singleton.eager;

/**
 * @author zhongyuan.Yang
 * @Title: 饿汉式单例模式
 * @Description: (描述此类的功能)
 * @date 2017-11-28 15:57
 */
public class EagerSingleton {
	/**
	 * 类加载时就初始化静态变量instance：调用私有构造方法，创建实例
	 */
	private static EagerSingleton instance = new EagerSingleton();

	/**
	 * 私有构造方法：防止在外围被实例化
	 */
	private EagerSingleton() {}

	/**
	 * 静态工程方法
	 * @return
	 */
	public static EagerSingleton getInstance() {
		return instance;
	}
}

