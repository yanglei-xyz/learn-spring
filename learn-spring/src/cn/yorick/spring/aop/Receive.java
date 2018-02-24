package cn.yorick.spring.aop;

/**
 * 用来接收目标方法返回值的切面
 * @author yanglei
 *
 */
public class Receive {
	public void printMoney(Integer money) {
		System.out.println("Receive。。。。。printMoney。。。。。。返回余额为："+money);
	}
}
