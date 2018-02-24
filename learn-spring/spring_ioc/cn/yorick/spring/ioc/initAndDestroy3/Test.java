package cn.yorick.spring.ioc.initAndDestroy3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/ioc/initAndDestroy3/applicationContext.xml");
		System.out.println("----------------------------------------------------------------------------------------");
		
		//bean的初始化与销毁
		Cat cat = (Cat)context.getBean("cat");
		cat.behavior();
		((ClassPathXmlApplicationContext)context).close();//关闭spring
		System.out.println("----------------------------------------------------------------------------------------");
		
	}

}
