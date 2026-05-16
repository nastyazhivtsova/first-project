package Extra_create_class;

import java.util.Scanner;

public class User {
    static Scanner scanner = new Scanner(System.in);
    static String username;
    static int age;

     static String getUsername(){
         System.out.print("Введите свое имя : ");
         username = scanner.next();
         return username;
     }

     static int getAge(){
         System.out.print("Сколько вам лет? ");
         age = scanner.nextInt();
         return age;
     }

     static void introduce(){
         System.out.println("Привет! Меня зовут " + getUsername() + " Мне " + getAge() + " лет.");
     }
}
