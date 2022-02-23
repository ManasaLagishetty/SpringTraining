package com.evoke.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        
    ApplicationContext context   = new ClassPathXmlApplicationContext("config.xml");
    
    Empployee emp=(Empployee) context.getBean("employee");
    System.out.println(emp);
    
    }
}
