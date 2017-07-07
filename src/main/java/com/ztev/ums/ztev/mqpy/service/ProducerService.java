package com.ztev.ums.ztev.mqpy.service;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;

@Component
public class ProducerService {
	Logger log = LogManager.getLogger(getClass());
	@Autowired
	private JmsTemplate jmsTemplate;
	
	/**
	 * 发送Text消息队列
	 * @param message
	 */
	public void sendTextQueueMessage(String queueName, final String message) throws JMSException {
		jmsTemplate.send(new ActiveMQQueue(queueName), new MessageCreator(){
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}
	
	/**
	 * 发送消息并处理消息返回值
	 * @param message
	 * @throws JMSException 
	 */
	public String sendTextQueueMessageAndReceive(String queueName,final String message) throws JMSException {
		Message replyMessage = jmsTemplate.sendAndReceive(new ActiveMQQueue(queueName), new MessageCreator(){
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
		
		log.info("sendTextAndReceive: {}", JSON.toJSONString(replyMessage));
		TextMessage textMessage = (TextMessage)replyMessage;
		return textMessage.getText();
	}
	
	/**
	 * 订单入队列
	 * @param info
	 * @throws JMSException 
	 */
	public String sendObjectQueueMessage(String queueName,final Serializable info) throws JMSException {
		Message message = jmsTemplate.sendAndReceive(new ActiveMQQueue(queueName), new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(info);
			}
		});
		log.info("sendTextAndReceive: {}", JSON.toJSONString(message));
		TextMessage textMessage = (TextMessage)message;
		return textMessage.getText();
	}
}