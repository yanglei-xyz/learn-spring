package cn.yorick.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 验证用户名与密码是否正确（admin，123456）
 * 
 * @author yanglei
 *
 */
public class Auth {
	private String	username	= "ABC";
	private String	password	= "123456";

	public void isUserExist(ProceedingJoinPoint pp) throws Throwable {
		if("admin".equals(username) && "123456".equals(password)) {
			pp.proceed();//放行
		} else {
			System.out.println("亲，登陆错误");
		}
	}
}
