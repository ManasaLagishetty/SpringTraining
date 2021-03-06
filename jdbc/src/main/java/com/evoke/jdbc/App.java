package com.evoke.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.evoke.jdbc.dao.PersonDao;
import com.evoke.jdbc.entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("com/evoke/jdbc/config.xml");
       
    /*   System.out.println("started");
       
       JdbcTemplate temp=context.getBean("jdbcTemp",JdbcTemplate.class);
       
       String query="insert into person(id,name,city) values(?,?,?)";
       
     int result=  temp.update(query,3,"Varam","jgl");
     
     System.out.println("inserted rows"+result);
     */
     PersonDao personDao =   context.getBean("personDao",PersonDao.class);
    
//     Person person=new Person();
//     person.setId(4);
//     person.setName("deepthi");
//     person.setCity("knr");
//     int r=personDao.save(person);
//     System.out.println("record inserted"+r);
//    
       
//    
//     Person person=new Person();
//    person.setId(4);
//     person.setName("Sunil");
//     person.setCity("adb");
//     int r=personDao.update(person);
//     System.out.println("record updated "+r);
//     
     
       
     
 //   int r=personDao.delete(4);
  // System.out.println("deleted" +r);
       
     
   // Person person= personDao.getPerson(1);
  //  System.out.println(person);
      
      
     
   List<Person> list= personDao.getAllRecords();
    
   for(Person p:list) {
    	System.out.println(p);
   }
   

    }
}
