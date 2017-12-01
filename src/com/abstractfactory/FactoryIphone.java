package com.abstractfactory;/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */

/**
 * @author zhongyuan.Yang
 * @Title: 抽象工厂类
 * @Description: 情景设置：生产两款苹果手机：Iphone6和Iphone8。
 * Iphone6的系统是IOS 8.0，处理器是A8；Iphone8的系统是IOS 11，处理器是A11.
 * @date 2017-11-30 17:25
 */
public interface FactoryIphone {
	/**
	 * 系统
	 * @return
	 */
	IOS createIOS();

	/**
	 * 处理器
	 * @return
	 */
	Processor createProcessor();
}
