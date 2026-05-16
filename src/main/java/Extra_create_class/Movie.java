package Extra_create_class;

import java.util.Scanner;

public class Movie { // на этом классе хотелось еще раз потренироваться с вводом данных с консоли
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static int year;


//    Movie (String someName, int someYear){
//        this.name = someName;
//        this.year = someYear;
//    }

    static String getName(){
        System.out.print("Введите название фильма : ");
        name = scanner.next();
        return name;
    }

    static int getYear(){
        System.out.print("Введите год : ");
        year = scanner.nextInt();
        return year;
    }

    static void describe(){
        System.out.println(getName() + " " + getYear());
    }
}
