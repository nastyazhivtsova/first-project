package homework_solvers;

import java.util.Scanner;

public class BreakContinueSolver {
    static void main(String[] args) {
        //Сумма чисел до первого отрицательного (использовать break)
//        sumNumbersBeforeNegative();


        //Пропуск чисел, делящихся на 3 (использовать continue)
//        printNumbersFrom1To20Without3();

        //Вывод только положительных чисел (использовать continue)
//        printPositiveNumbers();

        //Ввод строк до команды "stop" (использовать break)
//        insertBeforeStop();

        //
        multyplyTable();


    }

    /**
     * Сумма чисел до первого отрицательного (использовать break)
     * Напишите программу, которая запрашивает у пользователя числа и выводит их сумму.
     * Программа завершает выполнение, если пользователь вводит отрицательное число.
     */

    public static void sumNumbersBeforeNegative(){ // написала сама, заглянув в ИИ как написать блок с break
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        while (true){
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < 0){
                break;
            }
            sum = sum + number;
        }
        System.out.println("Сумма чисел: " + sum);
    }

    /**
     * Пропуск чисел, делящихся на 3 (использовать continue)
     * Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3.
     */

    public static void printNumbersFrom1To20Without3(){ //помогла подсказка к дз
        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            }
            else System.out.println(i);
        }
    }

    /**
     * Вывод только положительных чисел (использовать continue)
     * Напишите программу, которая принимает ряд чисел от пользователя и выводит только положительные.
     * Отрицательные числа нужно пропускать.
     */
    public static void printPositiveNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true){ //cначала сделала через do-while и если пользователь вводит 5,то программа заканчивается, с while  показалось лучше
            System.out.print("Введи число: ");
            number = scanner.nextInt();
            if (number < 0 ){
                continue;
            }
            System.out.println(number);
        }
    }

    /**
     * Ввод строк до команды "stop" (использовать break)
     * Программа должна запрашивать строки у пользователя и завершаться только тогда, когда введена команда "stop".
     */
    public static void insertBeforeStop(){ //написала сама
        Scanner scanner = new Scanner(System.in);
        String string;
        while (true){
            System.out.print("Введи что-нибудь. Для выхода из программы введи 'stop': ");
            string = scanner.next();
            if(string.equals("stop")) {
                break;
            }
        }
    }

    // Хотела взять еще задачи из практики, попробовала думать сама,
// но потом потом использовала ИИ и поняла, что знаний пока не достаточно - успокоилась) Сделаю потом



