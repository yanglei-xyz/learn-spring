package cn.yorick.spring.ioc.singleton2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"cn/yorick/spring/ioc/singleton2/applicationContext.xml");
		System.out.println("----------------------------------------------------------------------------------------");

		// scope用来控制spring 容器产生对象的方式，可以是单例也可以是多例，prototype（多例）
		Dog dog1 = (Dog) context.getBean("dog");
		Dog dog2 = (Dog) context.getBean("dog");
		System.out.println(dog1 == dog2);// false
		System.out.println("----------------------------------------------------------------------------------------");

	}

}
