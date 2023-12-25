public class StringCompare {

    public static void UsingEqualsMethod() {
        //this method return boolean value 
        //this compare the original string 
     String s1 = "jignesh";
     String s2 = "jignesh";
     String s3 = new String("jignesh");
     String s4 = "Sachin";

      System.out.println(s1.equals(s2)); //true
      System.out.println(s1.equals(s3)); //true
      System.out.println(s1.equals(s4)); //false
      System.out.println("output of the second type==>");
    }
    public static void UsingEqualsIgnoreMethod() {
   //this method also return the boolean value 
   //this method Ignore the cases like upper case and lowercase 
    String s1 = "jignesh";
    String s2 = "JIGNESH";
    System.out.println(s1.equals(s2));//false
    System.out.println(s1.equalsIgnoreCase(s2)); //true
    System.out.println("output of the third method==>");
    }
    public static void UsingDoubleEqualMethod() {
        //The == operator compares references not values.
        String s1  = "jignesh";
        
        String s2 = new String("sharma");
        String s3 = "jignesh";
        System.out.println(s1 == s2);// false; 
        System.out.println(s1 == s3);// true; 
    }
    public static void UsingCompareToMethod() {
        String s1="Sachin";  
        String s2="Sachin";  
        String s3="Ratan";  
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s1>s3)  
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
    }
    public static void main(String[] args) {
     UsingEqualsMethod();
     UsingEqualsIgnoreMethod();
     UsingDoubleEqualMethod();
     UsingCompareToMethod();
    }
}
