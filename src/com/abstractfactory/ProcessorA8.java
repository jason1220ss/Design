/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.abstractfactory;

/**
 * @author zhongyuan.Yang
 * @Title: 具体产品类
 * @Description: A8 处理器
 * @date 2017-11-30 17:16
 */
public class ProcessorA8 implements Processor{
	@Override
	public void processing() {
		System.out.println("This is A8 Processor!");
	}
}

