package Extra_create_class;

import java.util.Scanner;

public class WeatherForecast {
    Scanner scanner = new Scanner(System.in);
    int temperature;
    boolean cold = false;
    String forecast;

    int getTemperature(){
        System.out.print("Сколько градусов на улице? ");
        temperature = scanner.next();
        return temperature;
    }

    void isCold(){
        if (temperature < 5 ){
            cold = true;
            System.out.print("Холодно");
        }
    }

    void printForecast(){
       if (temperature < -10){
           forecast = "Адский холод! Сидите дома."
       }
        if (temperature < 0 || temperature > -10){
           forecast = "Возможно будет снег!";
       }
    }
}
