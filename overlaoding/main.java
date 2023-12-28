package overlaoding;

class Example { 
    void add(int x , int y) {
        System.out.println(x+y);
    }
    // overloading with varying the number of parameter
    void add(int x, int y, int z) {
        System.out.println(x+y+z);
    }
    // overloading by changing the type of the parameters 
    void add(double x, double y) {
        System.out.println(x+y);
    }

    //we can to overload the method by chaning the return types of 
    //the method as it create an ambiguity. 

}

public class main {
   public static void main(String[] args) {
      new Example().add(2,3);
      new Example().add(2,3,4);
      new Example().add(0.2,0.5);
   }    
}
