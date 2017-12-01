/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.singleton.holderclass;

/**
 * @author zhongyuan.Yang
 * @Title: Lazy initialization holder class模式
 * @Description: (描述此类的功能)
 * @date 2017-12-01 16:09
 */
public class Singleton {
	/**
	 * 私有构造方法
	 */
	private Singleton() {}

	private static class SingletonHolder {
		/**
		 * 静态初始化器，由JVM保证线程安全
		 */
		private static Singleton instance = new Singleton();
	}

	/**
	 * getInstance方法第一次被调用的时候，第一次读取SingletonHolder.instance，SingletonHolder类得到初始化；
	 * 而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例，
	 * 由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
	 * @return
	 */
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}

