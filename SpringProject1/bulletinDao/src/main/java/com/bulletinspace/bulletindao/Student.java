/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulletinspace.bulletindao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String first_name;
    private String last_name;
    private long dob;

    @Autowired
    private Address address;

    @Autowired
    private Grade grade;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public long getDob() {
        return dob;
    }

    public void setDob(long dob) {
        this.dob = dob;
    }

    /**
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void display() {
        System.out.println("First Name:" + first_name);
        System.out.println("LastName: " + last_name);
        System.out.println("Date of Birth:" + dob);
        System.out.println(address.getStreet());
        System.out.println(address.getCity());
        System.out.println(address.getZip());
        System.out.println(grade.getLetter_grade());
        System.out.println(grade.getSubject());
    }

    public void addAddress() {
        address.setStreet("Cavaloo");
        address.setCity("Houston");
        address.setZip(77098);

    }

    public void addGrade() {
        grade.setLetter_grade("B");
        grade.setSubject("Math");

    }

}
