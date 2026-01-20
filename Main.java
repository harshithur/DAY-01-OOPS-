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

class ATM {
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

