package OverRiding;


 class Animal {
    void pirntData() {
        System.out.println("this is the animal");
    }
}

class Cat extends Animal {
    @Override
    void pirntData() {
        System.out.println("this is the cat sound");
    }
}

public class Example {
    public static void main(String[] args) {
      Cat c1 = new Cat();
      c1.pirntData();
      Animal animal = new Animal();
      animal.pirntData();
    }
}
