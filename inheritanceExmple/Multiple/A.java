package inheritanceExmple.Multiple;

public class A {
    void SayA() {System.out.println("this is a ");}
}

class B {
    void SayB() {System.err.println("this is B");}
}
class C extends A,B{
    void SayC() {System.out.println("this is C");}
}


//suppose that if A and B contain the same method name then it's create an ambiguity when we create instance of thre class
// and calling to the method. 
// OR EXTENDS keyword can not use multiple class at a same to i.e A,B (thsi is wrong )
