/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulletinspace.bulletindao;

/**
 *
 * @author lyndenmarshall
 */
public class Grade {
    private String subject;
    private Character letter_grade;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Character getLetter_grade() {
        return letter_grade;
    }

    public void setLetter_grade(Character letter_grade) {
        this.letter_grade = letter_grade;
    }

    void setLetter_grade(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
