package cn.yorick.spring.annotation.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/annotation/ioc/applicationContext.xml");
		System.out.println("----------------------------------------------------------------------------------------");

		// 通过构造方法赋值
		TestBean bean = (TestBean) context.getBean("testBean");
		bean.behavior();
		System.out.println("----------------------------------------------------------------------------------------");

	}

}
