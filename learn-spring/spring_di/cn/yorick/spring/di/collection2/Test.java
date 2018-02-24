package cn.yorick.spring.di.collection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/di/collection2/di.xml");
		System.out.println("----------------------------------------------------------------------------------------");

		// 通过get／set赋值
		TestBean bean = (TestBean) context.getBean("testBean");
		System.out.println(bean);
		System.out.println("----------------------------------------------------------------------------------------");

	}

}
