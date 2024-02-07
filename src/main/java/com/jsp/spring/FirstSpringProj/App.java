package com.jsp.spring.FirstSpringProj;

import java.io.ObjectInputFilter.Config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	//Old School
//        BeanFactory bf=new XmlBeanFactory(new FileSystemResource("Spring2.xml"));
//        Student student = (Student) bf.getBean("student1");
//        System.out.println(student); 
//        Faculty faculty=bf.getBean(Faculty.class);
//        faculty.findGuy();
        
        //Present Usage
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
//    	Faculty f=ac.getBean(Faculty.class);
//        f.findGuy();
    	Student s = ac.getBean(Student.class);
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction t = session.beginTransaction();
    	
    	session.save(s);
    	
    	t.commit();
    	session.close();
    }
}
