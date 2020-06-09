package com.company;

import com.company.objects.Animal;
import com.company.objects.Cat;
import com.company.objects.Dog;
import com.company.objects.Owner;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("");

        String message = "Hello World";
        System.out.println(message);

//      Animal animal = new Animal();
//      animal.speak();
        Owner jonOwner = new Owner("Jon");
        Owner lizaOwner = new Owner("Liza");

        List<Animal> animals = new ArrayList<>();

        Cat cat = new Cat(4);
        cat.speak();
        cat.mmmr();
        cat.setOwner(jonOwner);
        cat.whoIsOwner();
        cat.howOld();
        animals.add(cat);

        Dog dog = new Dog(5);
        dog.speak();
        dog.protect();
        dog.setOwner(lizaOwner);
        dog.whoIsOwner();
        dog.howOld();
        animals.add(dog);

        if(jonOwner.getName().equals(lizaOwner.getName())){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        for(int indx = 0; indx < animals.size(); indx ++){
            animals.get(indx).speak();
        }

        try {

            Cat homlessCat = new Cat(10);
            homlessCat.getOwner().getName();
            
        }catch (Exception e){
            e.printStackTrace();
        }

        for (Animal animal : animals){
            animal.speak();
        }

        System.out.println("");
        System.out.println("-----------------");
    }
}
