package Extra_create_class;

import java.util.Scanner;

public class Course {
    Scanner scanner = new Scanner(System.in);
    String name;
    int studentsEnrolled; // изначально добавила еще переменную count, но получалось, что  studentsEnrolled эта не использовалась


    String getName(){
        System.out.print("Введите название курса: ");
        name = scanner.next();
        return name;
    }

    int getStudentsEnrolled(){
        return studentsEnrolled;
    }

     int addStudent(){
        return studentsEnrolled++;
    }

    void printInfo(){
        System.out.println("Название курса: " + getName() + " Количество студентов: " + getStudentsEnrolled() );
    }
}
