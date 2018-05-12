/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.bulletinspace.service.Course;
import com.bulletinspace.service.Grade;
import com.bulletinspace.bulletindao.Student;
import com.grade.FinalGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author dawit.gebremichael
 */
@Component
public class HelloWorld {
    
//    @Autowired
//    private Course course;
    
    private String name;
    
    private int grade;
    
//    @Autowired
//    private FinalGrade finalgrade;
    
//    @Autowired
//    private Student student;
    
    
   
    
    public String getName() {
        return name;
        
        
    }
    
    
    public void addStudent()
    {
        
    }
    
//    public void addCourse(){
//        course.setGrade(77);
//        course.setName("Bob");
//        System.out.println(" "+course.getName()+" "+course.getGrade());
//        Course c = new Course();
//        c.setGrade(22);
//        c.setName("Bob");
//    }

    public void setName(String name) {
        this.name = name;
    }
    
    public  void display() {
        System.out.println("Hello world "+name);
        System.out.println("Hello world "+grade);
    }
    
//    public void addGrade() {
//        finalgrade.setGrade(80);
//        System.out.println(finalgrade.getGrade());
//    }
    
    public static void main(String[] args) {
        
      
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        Student student = (Student)context.getBean("student");
//        helloWorld.addCourse();
//        helloWorld.addGrade();
        
    }
    
    
}
