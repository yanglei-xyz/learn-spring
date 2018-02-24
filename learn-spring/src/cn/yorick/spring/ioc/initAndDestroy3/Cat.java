package cn.yorick.spring.ioc.initAndDestroy3;

public class Cat {
	public Cat() {
		System.out.println("Cat Create....");
	}

	public void init() {
		System.out.println("Cat init!");
	}

	public void destroy() {
		System.out.println("Cat destroy....");
	}

	public void behavior() {
		System.out.println("Cat behavior!");
	}
}
