package com.idea.spring.config;

import com.idea.spring.author.JustryDeng;
import com.idea.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * (non-javadoc)
 *
 * @author {@link JustryDeng}
 * @since 2020/7/18 14:28:47
 */
@Configuration
@ComponentScan(value = "com.idea.spring")
public class MyConfig {
	
	@Bean
	public Person person() {
		Person p = new Person();
		p.setAge(26);
		p.setName("邓沙利文");
		return p;
	}
}
