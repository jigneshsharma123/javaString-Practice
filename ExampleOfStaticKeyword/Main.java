package ExampleOfStaticKeyword;

 //this part of the code for demostrating the problem when static keyword 
 //is not use with the counter variable.
 //whenever an instance of class is creaed it's bascially get the new memory 

class Counter {
    int count =0;
    void count() {
        count++;
        System.out.println(count);
    }
}
class CounterWithStatic {
   static  int count = 0; 
    void count() {
        count++;
     System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) {
     new Counter().count();//1
     new Counter().count(); //1
     new Counter().count();//1
     //counter value after using static keyword during the declearation of the count variable;
     System.out.println("output of the counter with static keyword:");
     new CounterWithStatic().count(); //2
     new CounterWithStatic().count();//3
    }
}
//static keyword is usally used for memory managemnet(it's saves the memoery );