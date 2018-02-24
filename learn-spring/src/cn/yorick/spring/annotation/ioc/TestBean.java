package cn.yorick.spring.annotation.ioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("testBean")默认id为类名首字母小写
@Component
@Scope("singleton")
public class TestBean {
	public TestBean() {
		System.out.println("TestBean Create....");
	}

	public void behavior() {
		System.out.println("TestBean behavior!");
	}
}
