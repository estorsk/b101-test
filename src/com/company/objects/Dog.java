package com.company.objects;

public class Dog extends HomeAnimal{

    public Dog(Integer age) {
        super(age);
    }

    @Override
    public String getName() {
        return "dog";
    }

    public void protect(){
        System.out.println("Wov!");
    }
}
