package homework_solvers;

import java.util.Scanner;

public class ForSolver {
    static void main(String[] args) {
        //Вывод чисел от 1 до 100, делящихся на 3
//        allNumbersDevide();

        //Сумма чисел от 1 до n
//        System.out.println("Cумма всех чисел: "  + sumOfAllNumber());

        // Таблица умножения для числа
//        multyplyTable();

        //Проверка на простое число
//        System.out.println(checkNumberIsSimple());

        //Вывод чисел от 1 до 10
        printNumberFrom1To10();


    }

    /**
     * Вывод чисел от 1 до 100, делящихся на 3
     * Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
     */

    public static void allNumbersDevide(){
        int num = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                num = i;
                System.out.println(num); // в режиме дебага нашла ошибку, что распечатку не добавила внутрь цикла
            }
        }
    }


    /**
     * Сумма чисел от 1 до n
     * Реализуйте программу, которая принимает с консоли число n и вычисляет сумму всех чисел от 1 до n
     */
    public static int sumOfAllNumber(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Введите число: ");
        n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++ ){
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Таблица умножения для числа
     * Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.
     */

    public static void multyplyTable(){ // взяла реализацию с практики и добавила сканнер
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите число, для которого вы хотите получить таблицу умножения: ");
        number = scanner.nextInt();
        for (int i =1; i <= number; i++){
            System.out.println(
                    number + " x " + i + " = " + number * i);
        }
    }

    /**
     * Проверка на простое число
     * Напишите программу, которая проверяет, является ли введённое число простым. Простое число делится только на 1 и на само себя.
     */

    public static boolean checkNumberIsSimple(){ //взяла и практики и добавила сканнер
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите число для проверки: ");
        number = scanner.nextInt();
        boolean isSimple = true;
        for (int i = 2; i <= number -1 ; i++){
            if(number % i == 0){
                isSimple = false;
                break;
            }

        }
        return isSimple;
    }

    /**
     * Вывод чисел от 1 до 10
     * Напишите программу, которая выводит числа от 1 до 10 на экран.
     */

    public static void printNumberFrom1To10(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }




}
