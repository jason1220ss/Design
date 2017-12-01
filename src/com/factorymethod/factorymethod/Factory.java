package com.factorymethod.factorymethod;/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */

/**
 * @author zhongyuan.Yang
 * @Title: 抽象工厂类
 * @Description: 发消息的设备(情景设置：电脑发邮件；手机发短信)
 * @date 2017-11-30 16:27
 */
public interface Factory {
	Sender produce();
}
