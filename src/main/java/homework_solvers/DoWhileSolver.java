package homework_solvers;

import java.util.Scanner;

public class DoWhileSolver {
    static void main(String[] args) {
        //Запрос положительного числа
//        positiveNumber();

        //Проверка пароля
//        checkPassword();

        //Вывод чисел от 1 до 10 с использованием do-while
//        printNumbers1To10();

        //Завершение программы по команде "exit"
//        commandExit();

        //Подсчёт количества цифр в числе
        countDigitsInNumber();

    }

    /**
     * Запрос положительного числа
     * Напишите программу, которая запрашивает у пользователя число и продолжает спрашивать, пока оно не станет положительным.
     */
    public static void positiveNumber(){ //написала сама быстро
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0 );
        System.out.println("Число положительное");
    }



    /**
     * Проверка пароля
     * Реализуйте программу, которая запрашивает у пользователя пароль, пока он не введёт верный (пароль заранее задан в коде).
     */

    public static void checkPassword(){ // тоже достаточно быстро, но на проверке добавила ! в сравнении и метод в сканере, чтобы считывал строку
        Scanner scanner = new Scanner(System.in);
        String password = "password1234";
        String passwordByConsole;
        do {
            System.out.print("Введите пароль: ");
            passwordByConsole = scanner.next();
        } while (!passwordByConsole.equals(password));
        System.out.println("Пароль введен верно");
    }

    /**
     * Вывод чисел от 1 до 10 с использованием do-while
     * Создайте программу, которая выводит числа от 1 до 10, используя do-while.
     */

    public static void printNumbers1To10(){ // очень быстро справилась сама, даже в практику не заглядывала
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    /**
     * Завершение программы по команде "exit"
     * Напишите программу, которая будет ждать ввода команды "exit" от пользователя для завершения работы.
     */

    public static void commandExit(){ // быстро сама написала без подглядываний в практику
        Scanner scanner = new Scanner(System.in);
        String command = "exit";
        String userCommand;
        do{
            System.out.print("Введи команду для завершения работы: ");
            userCommand = scanner.next();
        } while (!userCommand.equals(command));
        System.out.println("Программа завершена");
    }

    /**
     * Подсчёт количества цифр в числе
     * Напишите программу, которая подсчитывает, сколько цифр в целом числе, введённом пользователем.
     */

    public static void countDigitsInNumber(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;
        System.out.print("Введите число: ");
        number = scanner.nextInt();
        do{
            number = number / 10;
            count ++;
        } while (number != 0); // пошла в ИИ, потому что неверно несколько раз писала условие, но сразу поняла проблему (остальное было написано верно
        System.out.println("Количетсво цифр в числе: " + count);
    }
}
