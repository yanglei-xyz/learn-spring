package cn.yorick.spring.ioc.importAnotherXml5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/ioc/importAnotherXml5/applicationContext.xml");
		System.out.println("----------------------------------------------------------------------------------------");
		
		context.getBean("anothor");
		System.out.println("----------------------------------------------------------------------------------------");
	}

}
