## what is class and object's in java 
```
  1. In java, a class is a blueprint or template for  creating   objects,
  2. And an object an instance of a class. 
  3. Any Entity that has state and behavior is know as object.
  4. For example: a chair, pen, table, keyboard, bike etc..
```

## piller of oops 

### 1. Inheritance=> 
   ```
    a. When an object acquires all the properties and ehavours of a parent object, it is known as inheritance.
    b. it provides code reusability.
    c.it is used to achive runtime polymorphism.

   ```
### 2. Polymorphism 
 ```
 a.If one task is perfomed in different ways, it is know as polymorphism. 
 b.In java, we used method overloading and method overriding to achieve polymorphism. 
 
 ```
### 3. Abstraction 
  ```
    a. Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing.
    b.In Java, we use abstract class and interface to achieve abstraction.
  ```
### 4. Encapsulation 
 ```
   a. Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.
   b.A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.
 ```

 # Characteristics of Object

 <b>A.State =</b> Represent the data of an object <br>
 <b>B.Behavior =</b> Represents the behavior of an object such as deposit, withdraw,etc.<br>
 <b>C.Identity =</b> It is used internally by the JVM to identify each object uniquely.<br>

# Syntax to declare a class:

<code> 
 classs Class_Name { <br>
    field; <br>
    method;<br>
    constructor;<br>
    blocks<br>
    nested classes or interface<br> 

 }
</code>

# Instance variable in Java
```
1. A variable which is created inside the class but outside the method is known as an instance variable.
2. Instance variable doesn't get memory at compile time.
3. It gets memory at runtime when an object or instance is created.

```

# new keyword

```
  1  The new keyword is used to allocate memory at runtime. 
  2. All objects get memory in Heap memory area.
```