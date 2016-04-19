package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta
 */
@XmlRootElement
public class Person {
    private String name;

    private String mail;

    private Sring prenom;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

     public Person(String name,String prenom) {
        this.name = name;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return name;
    }
}