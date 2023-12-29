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




public class main {
  public static void main(String[] args) {

  UsagesFirstofThis st1 = new UsagesFirstofThis("jignesh",34,324);
  st1.PrintOutput();

  
}    
}
