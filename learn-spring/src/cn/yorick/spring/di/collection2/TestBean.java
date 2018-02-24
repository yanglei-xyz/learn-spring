package cn.yorick.spring.di.collection2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean {
	private String			name;
	@SuppressWarnings("rawtypes")
	private List			list;
	@SuppressWarnings("rawtypes")
	private Set				set;
	@SuppressWarnings("rawtypes")
	private Map				map;
	private Properties		prop;
	private TestChildBean	child;

	public TestBean() {
		System.out.println("TestBean无参数构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	@SuppressWarnings("rawtypes")
	public void setList(List list) {
		this.list = list;
	}

	@SuppressWarnings("rawtypes")
	public Set getSet() {
		return set;
	}

	@SuppressWarnings("rawtypes")
	public void setSet(Set set) {
		this.set = set;
	}

	@SuppressWarnings("rawtypes")
	public Map getMap() {
		return map;
	}

	@SuppressWarnings("rawtypes")
	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public TestChildBean getChild() {
		return child;
	}

	public void setChild(TestChildBean child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "TestBean [name=" + name + ", list=" + list + ", set=" + set + ", map=" + map + ", prop=" + prop
				+ ", child=" + child + "]";
	}

}
