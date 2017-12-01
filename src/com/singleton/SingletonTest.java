/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.singleton;

import com.singleton.eager.EagerSingleton;

/**
 * @author zhongyuan.Yang
 * @Title: 测试
 * @Description: (描述此类的功能)
 * @date 2017-11-28 16:00
 */
public class SingletonTest {
	public static void main(String[] args) {
		EagerSingleton singleton1 = EagerSingleton.getInstance();
		EagerSingleton singleton2 = EagerSingleton.getInstance();
		/* 判断两个对象是否相等，检测是否只创建了一个对象 */
		System.out.println(singleton1.equals(singleton2));
	}
}

