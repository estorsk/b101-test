package com.company.objects;

public abstract class Animal {

    protected Integer age;

    public Animal(Integer age) {
        this.age = age;
    }

    public abstract String getName();

    public void speak(){
        System.out.println("im " + this.getName());
    }

}
