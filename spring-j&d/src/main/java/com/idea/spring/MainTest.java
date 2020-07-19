package com.idea.spring;

import com.idea.spring.author.JustryDeng;
import com.idea.spring.config.MyConfig;
import com.idea.spring.model.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * (non-javadoc)
 *
 * @author {@link JustryDeng}
 * @since 2020/7/18 14:28:20
 */
public class MainTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(MyConfig.class);
		A a = (A)annotationConfigApplicationContext.getBean("a");
		System.err.println(a);
	}

}
