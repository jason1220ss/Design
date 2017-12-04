package com.singleton.enumsingleton;/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
/**
 * @author zhongyuan.Yang
 * @Title: 单例和枚举
 * @Description: (描述此类的功能)
 * @date 2017-12-01 16:45
 */
public enum Singleton {
	/**
	 * 定义一个枚举的元素，它就代表了Singleton的一个实例。
	 */

	uniqueInstance;

	/**
	 * 单例可以有自己的操作
	 */
	public void singletonOperation(){
		//功能处理
	}
}
