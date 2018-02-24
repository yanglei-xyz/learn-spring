package cn.yorick.spring.di.base1;

public class TestBean {
	private String	name;
	private Integer	age;
	private Float	weight;

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

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public TestBean(String name, Integer age, Float weight) {
		System.out.println("有参数构造方法");
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public TestBean() {
		System.out.println("无参数构造方法");
	}

	@Override
	public String toString() {
		return "TestBean [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
