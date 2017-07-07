package com.ztev.ums.ztev.mqpy.init;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.SimpleMessageConverter;

@Configuration
public class ActiveMQInit {
	//初始化信息-->连接工厂,连接池,缺少目的地的jmsTemplate
	@Bean(name="jmsTemplate-py")
	public JmsTemplate jmsTemplate(ActiveMQConnectionFactory connectionFactory) {
		PooledConnectionFactory pool = new PooledConnectionFactory(connectionFactory);
		pool.setMaxConnections(5);
		JmsTemplate template = new JmsTemplate(pool);
		template.setMessageConverter(new SimpleMessageConverter());
		return template;
	}
}
