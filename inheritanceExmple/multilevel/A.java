package inheritanceExmple.multilevel;

 class A {
    void say(){System.out.println("this is A");}
}

class B extends A {
    void SayToB() {System.out.println("this is B");}
}
class C extends B {
    void SayToC() {System.out.println("This is C");}
}

