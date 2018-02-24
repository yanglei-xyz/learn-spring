package cn.yorick.spring.aop;

/**
 * 异常捕获切面
 * 
 * @author yanglei
 *
 */
public class GlobalExpt {
	public void handExpt(Throwable ex) {
		System.out.println("Some Exception,log it.... "+ex);
	}
}
