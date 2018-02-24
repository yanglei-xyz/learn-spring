package cn.yorick.spring.di.base1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/di/base1/di.xml");
		System.out.println("----------------------------------------------------------------------------------------");

		// 通过构造方法赋值
		TestBean bean1 = (TestBean) context.getBean("testBean1");
		System.out.println(bean1);
		System.out.println("----------------------------------------------------------------------------------------");

		// 通过get／set赋值
		TestBean bean2 = (TestBean) context.getBean("testBean2");
		System.out.println(bean2);
		System.out.println("----------------------------------------------------------------------------------------");

	}

}
