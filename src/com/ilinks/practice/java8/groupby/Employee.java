package com.ilinks.practice.java8.groupby;

public class Employee {
    
    private String name;
    private int id;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Employee(String name, int id, int age) {
        super();
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    
}
