package ConcepOfThisKeyword;

class UsagesFirstofThis {
    String name;
    int roll;
    int age;
    //A construction having the similar parameter name as instance vairable.
    //this means it's create an ambiguity. 
    //to resolve this we take a use of This keyword
      UsagesFirstofThis(String name,int roll,int age) {
          this.name = name;
          this.roll = roll;
          this.age = age;
    }
    void PrintOutput() {
        System.err.println(name);
        System.err.println(roll);
        System.err.println(age);
    }
}

class SecondUsageofThiskeyword {
    // to invoke current class method we can also use the this.method_name().
   //if we are not use this keyword then compiler autometically added the this keyword with the current class method
   void m() {System.out.println("method is called by using this keyword");}
   void n() {
    System.out.println("Hello n");
    //m(); //same as this.m();
    this.m();
   }
}



public class main {
  public static void main(String[] args) {

//   UsagesFirstofThis st1 = new UsagesFirstofThis("jignesh",34,324);
//   st1.PrintOutput();

new SecondUsageofThiskeyword().n();
}    
}
