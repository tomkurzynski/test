/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_banking.Model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ryan
 */

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enda
 */
@XmlRootElement
public class User {
    
    private long id;
    private String name;
    private String hairColour;
    private int age;
    private CCard [] ccards;

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(long id, String name, String hairColour, int age) {
        this.id = id;
        this.name = name;
        this.hairColour = hairColour;
        this.age = age;
        this.ccards = new CCard[0];
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CCard[] getCcards() {
        return ccards;
    }

    public void setCcards(CCard[] ccards) {
        this.ccards = ccards;
    }
    

}

    
