package cn.yorick.spring.ioc.lazy4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/ioc/lazy4/applicationContext.xml");
		System.out.println("----------------------------------------------------------------------------------------");
		
		//懒加载与非懒加载
		Duck duck = (Duck)context.getBean("duck");
		duck.behavior(); 
		System.out.println("----------------------------------------------------------------------------------------");
	}

}
