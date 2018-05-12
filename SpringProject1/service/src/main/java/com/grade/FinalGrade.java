/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grade;

import org.springframework.stereotype.Component;

/**
 *
 * @author w209116758
 */
@Component
public class FinalGrade {
    
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
