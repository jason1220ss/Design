/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.strategy;

/**
 * @author zhongyuan.Yang
 * @Title: 环境角色
 * @Description: 注入策略者
 * @date 2017-11-22 11:51
 */
public class Environment {

	private Strategy strategy;

	public Environment(Strategy strategy) {
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int calculate(int a, int b) {
		return strategy.calculate(a,b);
	}

}

