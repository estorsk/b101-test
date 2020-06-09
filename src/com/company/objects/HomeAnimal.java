package com.company.objects;

public abstract class HomeAnimal extends Animal {
    protected Owner owner;

    public HomeAnimal(Integer age) {
        super(age);
    }

    public void whoIsOwner(){
        if(owner == null){
            System.out.println("Animal has owner!");
        }else {
                System.out.println(owner.getName() + " is " + this.getName() +" owner!");
        }
    }

    public void howOld(){
        System.out.println(this.age);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
