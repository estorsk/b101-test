package com.company.objects;

public class Cat extends HomeAnimal {

    public Cat(Integer age) {
        super(age);
    }

    @Override
    public String getName(){
        return "cat";
    }

    public void mmmr(){
        System.out.println("mmmr");
    }

}
