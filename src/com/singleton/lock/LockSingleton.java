/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.singleton.lock;

/**
 * @author zhongyuan.Yang
 * @Title: 双重检查加锁式单例模式
 * @Description: (描述此类的功能)
 * @date 2017-12-01 11:45
 */
public class LockSingleton {
	/**
	 * 注意：在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，
	 * 会导致“双重检查加锁”的失败，因此“双重检查加锁”机制只只能用在java5及以上的版本。
	 */
	/**
	 * 被volatile修饰的变量的值，将不会被本地线程缓存，
	 * 所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
	 */
	private volatile static LockSingleton instance = null;

	private LockSingleton() {}
	/**
	 * 第一重检查：进入方法后，先检查实例是否存在，如果不存在才进行下面的同步块；
	 * 第二重检查：进入同步块过后，再次检查实例是否存在，如果不存在，就在同步的情况下创建一个实例。
	 * 这样一来，就只需要同步一次了，从而减少了多次在同步情况下进行判断所浪费的时间。
	 * @return
	 */
	public static LockSingleton getInstance() {
		//先检查实例是否存在，如果不存在才进入下面的同步块
		if (null == instance) {
			//同步块，线程安全的创建实例
			synchronized (LockSingleton.class) {
				//再次检查实例是否存在，如果不存在才真正的创建实例
				if (null == instance) {
					instance = new LockSingleton();
				}
			}
		}
		return instance;
	}
}

