package com.ztev.ums.ztev.mqpy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SimpleApplication {
	static Logger logger = LogManager.getLogger(SimpleApplication.class);
	public static ApplicationContext application = SpringApplication.run(SimpleApplication.class);
	public static void main(String[] args) {
		logger.info("mq加载初始化成功~~~");
	}
}
