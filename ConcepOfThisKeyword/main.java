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

class ThirdUsageofThisKeyword {
    // to invoke current class constructor we can use the this keyword 
    //  it is used for constructor chaining OR it is used to resuse the constructor 
    //e.g Calling default constructor from parameterized constructor:
    
    ThirdUsageofThisKeyword() {System.out.println("Hello ThirdUsageofThisKeyword");} //this is the default constructor or non-parametrazie constructor
    ThirdUsageofThisKeyword(int x) {
        this();
        System.out.println(x);
    }

}


public class main {
  public static void main(String[] args) {

//   UsagesFirstofThis st1 = new UsagesFirstofThis("jignesh",34,324);
//   st1.PrintOutput();

// new SecondUsageofThiskeyword().n();


new ThirdUsageofThisKeyword(5);


}    
}
