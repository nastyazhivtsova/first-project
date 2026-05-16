package Extra_create_class;

import java.util.Scanner;

public class Phone {
    static Scanner scanner = new Scanner(System.in); // сделала ввод номера телефона статичным, чтобы он не зависел от созданного объекта класса
    String model;
    int batteryLevel;
    static String number;

    Phone (String someModel, int someBatteryLevel){
        this.model = someModel;
        this.batteryLevel = someBatteryLevel;
    }

    int getBatteryLevel(){
        return batteryLevel;
    }

    static String getNumber(){
        System.out.print("Введите номер телефона : ");
        number = scanner.next();
        return number;
    }

    void call(){
        System.out.println("Звоню на номер: " + number+ " с телефона " + model);
    }

    void checkBatteryLevel(){ // добавила еще метод на определение уровня заряда
        if (batteryLevel <= 20){
            System.out.println("Ваш заряд: " + getBatteryLevel() + " Включен режим энергосбережения.Требуется зарядка");
        }

        if (batteryLevel > 20 && batteryLevel < 50){
            System.out.println("Ваш заряд: " + getBatteryLevel() + " Заряд меньше половины. Скоро может потребоваться зарядка");
        }

        if (batteryLevel >= 50 && batteryLevel < 100){
            System.out.println("Ваш заряд: " + getBatteryLevel() + " Телефон заряжен больше половины.");
        }

        if (batteryLevel ==  100){
            System.out.println("Ваш заряд: " + getBatteryLevel() + " Телефон заряжен на 100% ");
        }
    }
}
