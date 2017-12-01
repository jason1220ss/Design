/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.abstractfactory;

/**
 * @author zhongyuan.Yang
 * @Title: 具体工厂类
 * @Description: 生产Iphone6
 * @date 2017-11-30 17:35
 */
public class FactoryIphone6 implements FactoryIphone{
	@Override
	public IOS createIOS() {
		return new IOS8();
	}

	@Override
	public Processor createProcessor() {
		return new ProcessorA8();
	}
}

