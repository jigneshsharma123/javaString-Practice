class ImmuatableString {

    public static void main(String[] args) {

       String s  = "jignesh"; 
       s.concat(" Sharma");
       String k = s;
      k =  k.concat(" sharma");
       System.out.println(s);
       System.out.println(k);
    
    }
}
/*
 * Why String objects are immutable in Java?
As Java uses the concept of String literal. Suppose there are 5
 reference variables, all refer to one object "Sachin". 
 If one reference variable changes the value of the object,
  it will be affected by all the reference variables. 
  That is why String objects are immutable in Java.
 *    
 */