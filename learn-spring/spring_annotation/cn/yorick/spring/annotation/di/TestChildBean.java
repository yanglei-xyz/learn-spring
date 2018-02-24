package cn.yorick.spring.annotation.di;

import org.springframework.stereotype.Component;

@Component
public class TestChildBean {
	private String	name		= "TestChildBean";
	private Integer	age		= 20;

	public TestChildBean() {
		System.out.println("TestChildBean无参数构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestChildBean [name=" + name + ", age=" + age + "]";
	}

}
