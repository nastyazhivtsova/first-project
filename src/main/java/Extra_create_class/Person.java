package Extra_create_class;

import java.util.Scanner;

// лучше через конструкторы реализовать или через статические методы?

public class Person {
     Scanner scanner = new Scanner(System.in);
     String firstName;
     String lastName;

     String getFirstName(){
         System.out.print("Введите ваше имя:");
         firstName = scanner.next();
         return firstName;
     }

     String getLastName(){
         System.out.print("Введите вашу фамилию");
         lastName = scanner.next();
         return lastName;
     }

     void getFullName(){
         System.out.println("Вас звоут: " + getFirstName() + " " + getLastName());
     }
}
