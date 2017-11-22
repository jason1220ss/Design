/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.strategy;

/**
 * @author zhongyuan.Yang
 * @Title: 具体策略角色
 * @Description: 策略类，实现公共类
 * @date 2017-11-22 11:44
 */
public class AddStrategy implements Strategy {
	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
}

