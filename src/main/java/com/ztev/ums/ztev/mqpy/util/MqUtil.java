package com.ztev.ums.ztev.mqpy.util;
import java.io.Serializable;

import javax.jms.JMSException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.ztev.ums.ztev.mqpy.SimpleApplication;
import com.ztev.ums.ztev.mqpy.service.ProducerService;

public class MqUtil {
	static ProducerService producerService = SimpleApplication.application.getBean(ProducerService.class);
	private static Logger logger = LogManager.getLogger(MqUtil.class);
	
	public static void sendTextQueueMessage(String queueName,String message){
		logger.info("目的地:{},消息:{}", queueName, message);
		try {
			producerService.sendTextQueueMessage(queueName,message);
		} catch (JMSException e) {
			e.printStackTrace();
			logger.error(e);
		}
	}
	/**
	 * 用json的方式传递对象
	 * @param queueName
	 * @param obj
	 */
	public static void sendTextQueueMessage(String queueName,Serializable obj){
		String jsonStr = JSON.toJSONString(obj);
		logger.info("目的地:{},消息:{}", queueName, jsonStr);
		try {
			producerService.sendTextQueueMessage(queueName,jsonStr);
		} catch (JMSException e) {
			e.printStackTrace();
			logger.error(e);
		}
	}
	
	
	public static String sendTextQueueMessageAndReceive(String queueName,String message){
		logger.info("目的地:{},消息:{}", queueName, message);
		try {
			return producerService.sendTextQueueMessageAndReceive(queueName,message);
		} catch (JMSException e) {
			e.printStackTrace();
			logger.error(e);
		}
		return null;
	}
	
	public static String sendObjectQueueMessage(String queueName,Serializable obj){
		String jsonStr = JSON.toJSONString(obj);
		logger.info("目的地:{},消息:{}", queueName, jsonStr);
		try {
			return producerService.sendObjectQueueMessage(queueName, obj);
		} catch (JMSException e) {
			e.printStackTrace();
			logger.error(e);
		}
		return null;
	}
}
