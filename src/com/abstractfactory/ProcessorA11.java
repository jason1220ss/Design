/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.abstractfactory;

/**
 * @author zhongyuan.Yang
 * @Title: 具体产品类
 * @Description: A11 处理器
 * @date 2017-11-30 17:18
 */
public class ProcessorA11 implements Processor{
	@Override
	public void processing() {
		System.out.println("This is A11 Processor!");
	}
}

