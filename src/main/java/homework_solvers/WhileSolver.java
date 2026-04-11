package homework_solvers;

import java.util.Scanner;

public class WhileSolver {
    static void main(String[] args) {
        //Вычисление факториала с помощью while
//        System.out.println("Факториал числа: " + factorial());

        //Вывод всех чётных чисел до заданного
//        allEvenNumbers();

        //Обратный отсчёт от введённого числа до 1:
        returnCountto1();






    }

    /**
     * Вычисление факториала с помощью while
     * Напишите программу, которая принимает с консоли число и выводит его факториал
     * (произведение всех чисел от 1 до n), используя цикл while.
     */

    public static int factorial(){
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Введите число для вычисления факториала: ");
        a = scanner.nextInt();
        int i = 1;
        int result = 1;
        while ( i <= a){
            result = result * i;
            i++;
        }
    return result;
    }

    /**
     * Вывод всех чётных чисел до заданного
     * Реализуйте программу, которая выводит все чётные числа от 1 до числа, введённого пользователем.
     */

    public static void allEvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введи число для проверки: ");
        number = scanner.nextInt();
        int i = 1; // в процессе отладки изменила значение на 1, тк выводил еще ноль
        while (i <= number){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     * Обратный отсчёт от введённого числа до 1:
     * Создайте программу, которая принимает с консоли положительное число и выводит обратный отсчёт от него до 1.
     */

    public static void returnCountto1(){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите положительное число: ");
        number = scanner.nextInt();
        while (number >= 1){ //так как у нас ограничение до 1
            System.out.println(number);
            number --; // number = number - 1
        }

    }
}
