package JavaOOPSTask2;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class Animals_Task_7 {
    public static void main(String[] args) {
        Animal a;                     // Animal is a base class, it can be used to refer to objects of its sub-classe

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound(); 

        a = new Cow();
        a.sound();
    }
}
