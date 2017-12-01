/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.abstractfactory;

/**
 * @author zhongyuan.Yang
 * @Title: 测试类
 * @Description: (描述此类的功能)
 * @date 2017-11-30 17:37
 */
public class FactoryTest {
	public static void main(String[] args) {
		FactoryIphone factoryIphone = new FactoryIphone6();
		IOS ios = factoryIphone.createIOS();
		Processor processor = factoryIphone.createProcessor();
		ios.system();;
		processor.processing();
	}
}

