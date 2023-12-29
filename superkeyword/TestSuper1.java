  package superkeyword;
//super is used to refer immediate parent class instance variable
 class Animal 
 {
    String color = "blue";

 }

 class Dog extends Animal {
    String color = "black";
    void printColor() {
        System.out.println(color); //black;
        System.out.println(super.color); //blue
    }
 }


 
 public class TestSuper1 {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.printColor();
  }
    
 }