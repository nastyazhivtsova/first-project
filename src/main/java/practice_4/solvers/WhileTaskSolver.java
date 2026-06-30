package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args){
       // проверка метода по распечатке всех чисел от 1 до 10
//        printAllNumbersBefore10();
        // проверка программы по считыванию команд пока не введут exit
//        commandReader();
        // проверка суммы цифр числа
        System.out.println(sumOfDigits(123));


    }


    public static void printAllNumbersBefore10(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }


    public static void commandReader(){
        Scanner scanner = new Scanner (System.in);

        String command = "";

        while (!command.equals("exit")){ //для непримитивных типов данных всегда используется equals  и если мы хотим сказать"Неравно" то пишем !
            System.out.print("Введите команду:");
            command = scanner.nextLine(); // считывает след строчку
        }
        System.out.println("Программа завершена.");
    }

    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

}
