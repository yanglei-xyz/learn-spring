package cn.yorick.spring.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
	private String name = "testBean";
	
	// @Resource(name = "testChildBean") //可以用Resource手动写，也可以用Autowired自动关联
	@Autowired
	private TestChildBean child;

	public TestBean() {
		System.out.println("TestBean无参数构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestChildBean getChild() {
		return child;
	}

	public void setChild(TestChildBean child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "TestBean [name=" + name + ", child=" + child + "]";
	}

}
