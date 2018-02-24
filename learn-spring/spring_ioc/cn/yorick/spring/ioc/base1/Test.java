package cn.yorick.spring.ioc.base1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/ioc/base1/applicationContext.xml");
		System.out.println("----------------------------------------------------------------------------------------");

		// 通过xml中id值获取spring创建的对象
		TestBean wolf = (TestBean) context.getBean("testBean");
		wolf.behavior();
		System.out.println("----------------------------------------------------------------------------------------");
		
//		System.out.println(context.getBean("cn.yorick.spring.ioc.base1.TestBean#0"));

	}

}
