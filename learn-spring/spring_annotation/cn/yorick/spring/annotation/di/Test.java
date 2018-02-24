package cn.yorick.spring.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/annotation/di/applicationContext.xml");
		System.out.println("----------------------------------------------------------------------------------------");

		// 通过构造方法赋值
		TestBean bean = (TestBean) context.getBean("testBean");
		System.out.println(bean);
		System.out.println("----------------------------------------------------------------------------------------");

	}

}
