package com.evoke.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
    	Person person=context.getBean("person",Person.class);
    	
    	System.out.println(person.toString());
    	
    }
}
