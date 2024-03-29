package com.ripjava.io.stream;

import java.io.*;

public class Member2 implements Serializable {
    private String number;
    private String name;
    private  transient int age;

    public Member2(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", number, name, age);
    }
    
    public void save() {
        try(ObjectOutputStream output = 
                new ObjectOutputStream(new FileOutputStream(number))) {
            output.writeObject(this);
        } catch(IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static Member2 load(String number) {
        Member2 member = null;
        try(ObjectInputStream input = 
                new ObjectInputStream(new FileInputStream(number))) {
            member = (Member2) input.readObject(); 
        } catch(IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return member;
    }
}
