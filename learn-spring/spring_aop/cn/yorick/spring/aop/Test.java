package cn.yorick.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 启动框架
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/yorick/spring/aop/aop.xml");
		System.out.println("----------------------------------------------------------------------------------------");

		BankServiceImpl bean = (BankServiceImpl) context.getBean("bankServiceImpl");
		bean.getMoney();
		System.out.println("----------------------------------------------------------------------------------------");
		bean.zhuanMoney();
		System.out.println("----------------------------------------------------------------------------------------");
		bean.invest();
		System.out.println("----------------------------------------------------------------------------------------");

	}

}
