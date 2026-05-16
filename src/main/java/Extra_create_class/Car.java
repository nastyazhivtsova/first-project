package Extra_create_class;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    String brand;
    int mileage;

//    Car (String someBrand, int someMileage){
//        this.brand = someBrand;
//        this.mileage = someMileage;
//    }

    String getBrand(){
        System.out.print("Введите марку машины:");
        brand = scanner.next();
        return brand;
    }

    int getMileage(){
        System.out.print("Введите ваш пробег: ");
        mileage = scanner.nextInt();
        return mileage;
    }


    int setMileage(){
        System.out.println("Насколько увеличить пробег? ");
        this.mileage = scanner.nextInt() + mileage;
        return mileage;
    }

    void drive(){
        setMileage();
        System.out.println("Новый пробег: " + mileage);
    }

    void printMileage(){
        System.out.println("Текущий пробег: " + mileage);
    }
}
