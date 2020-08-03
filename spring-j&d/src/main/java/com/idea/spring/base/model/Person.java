package com.idea.spring.base.model;

import com.idea.spring.base.author.JustryDeng;

/**
 * (non-javadoc)
 *
 * @author {@link JustryDeng}
 * @since 2020/7/18 14:24:13
 */
public class Person {
	
	private String name;
	private Integer age;
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
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
