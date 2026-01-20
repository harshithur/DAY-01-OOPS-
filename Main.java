/* 1) OOPS is a programming approach in which a program is designed using classes and objects.
It focuses on representing real-world entities as objects to make programs simple, reusable, and easy to maintain.
Main Concepts of OOPS

1️⃣ Class

A class is a blueprint or template used to create objects.
It defines variables (data) and methods (functions).

Example:
Student class with name, roll number, and marks.

2️⃣ Object

An object is an instance of a class.
It represents a real-world entity and can access class members.

Example:
student1 is an object of Student class.

*/

// class Student {
//     int id;
//     String name;
//     void display(){
//         System.out.println(" Id : " + id + " Name : " + name);
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         Student st = new Student();
//         st.id = 11;
//         st.name = "Harshith";
//         st.display();

//         Student st1 = new Student();
//         st.id = 12;
//         st.name = "Harsh";
//         st.display();

//     }
// }

//-------------------------------------------- Encapsulation----------------------------------------------------------

// Encapsulation means wrapping data and methods together into a single unit (class) or Encapsulation = Data hiding + Controlled access.
//Keep data hidden and allow access only through methods.

/*class ATM {
    private int balance = 1000;
    
    // withdraw money or set Balance
    public void setBalacnce(int amount){
           balance = balance - amount;
    }

     // Return Balance or get balance
   public int getBalance(){
    return balance;
   }

}

public class Main{
    public static void main(String[] args) {
        ATM a = new ATM();
        
        a.setBalacnce(200);
        System.out.println(a.getBalance());

    }
}
*/


//-----------------------------------------Inheritence----------------------------------------------------------

// Inheritance means:

// One class uses properties of another class


// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();

//         d.eat();   // from Animal
//         d.bark();  // from Dog
//     }
// }


//------------------------Polymorphism means---------------------------

// One thing, many forms
//Polymorphism allows the same method to perform different actions.

// Simple Example (Method Overloading)


// class MathOperation {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MathOperation m = new MathOperation();

//         System.out.println(m.add(2, 3));
//         System.out.println(m.add(2, 3, 4));
//     }
// }


// 📌 Same method name add()
// 📌 Different parameters
// 👉 Polymorphism

// ✅ Another Example (Method Overriding)


// class Animal {
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         a.sound();   // Dog barks
//     }
// }

//  Types of Polymorphism in Java

// Compile-time	Method Overloading
// Run-time	Method Overriding


//-------------------------Abstraction means:

// Show what is needed, hide how it works


// In Java

// Abstraction is achieved using:

// Abstract class

// Interface

// ✅ Example 1: Abstract Class (Simple)
// abstract class Vehicle {
//     abstract void start();   // no body
// }

// class Bike extends Vehicle {
//     void start() {
//         System.out.println("Bike starts with key");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Vehicle v = new Bike();
//         v.start();
//     }
// }


// 📌 You know start() exists
// 📌 You don’t care how it starts

// ✅ Example 2: Interface (Very Simple)
// interface Bank {
//     void rateOfInterest();
// }

// class SBI implements Bank {
//     public void rateOfInterest() {
//         System.out.println("SBI interest is 7%");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Bank b = new SBI();
//         b.rateOfInterest();
//     }
// }

// 🧠 Difference: Abstract Class vs Interface
// Abstract Class	Interface
// Can have method body	No method body
// Can have variables	Only constants
// Uses extends	Uses implements