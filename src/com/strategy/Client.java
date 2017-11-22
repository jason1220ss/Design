/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.strategy;

/**
 * @author zhongyuan.Yang
 * @Title: 客户端
 * @Description: 调用策略方法
 * @date 2017-11-22 14:39
 */
public class Client {

	public static void main(String[] args) {

		AddStrategy addStrategy = new AddStrategy();
		Environment environment = new Environment(addStrategy);
		System.out.println("Add：" + environment.calculate(12,20));

		SubtractStrategy subtractStrategy = new SubtractStrategy();
		environment.setStrategy(subtractStrategy);
		System.out.println("Subtract：" + environment.calculate(8,2));

		MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
		environment.setStrategy(multiplyStrategy);
		System.out.println("Multiply：" + environment.calculate(3, 4));

		DivideStrategy divideStrategy = new DivideStrategy();
		environment.setStrategy(divideStrategy);
		System.out.printf("Divide：" + environment.calculate(20, 5));
	}
}

