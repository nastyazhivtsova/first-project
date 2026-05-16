package Extra_create_class;

import java.util.Scanner;

public class Thermometer {
    Scanner scanner = new Scanner(System.in);
    double currentTemp;
    boolean fever = false;

    double getCurrentTemp(){
        System.out.print("Введите количество градусов: ");
        currentTemp = scanner.nextDouble();
        return currentTemp;
    }

    void display(){
        System.out.println("Температура: " + getCurrentTemp() + "°C");
    }

    void isFever(){
        if ( currentTemp >= 37.5) {
            fever = true;
            System.out.println("Лихорадка! Звони врачу!");
        } else System.out.println("Лихорадки нет");

    }
}
