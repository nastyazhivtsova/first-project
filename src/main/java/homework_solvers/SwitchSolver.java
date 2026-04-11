package homework_solvers;

import java.util.Scanner;

public class SwitchSolver {
    static void main(String[] args) {
        //  Вывод дня недели по номеру
//        System.out.print(dayOfWeek());

        //Стоимость билета по дню недели
//        SwitchSolver.checkTicketPrice();

        //Перевод числовых оценок в буквенные (A–F)
//        System.out.print(checkEvalution());

        //Обработка текстовых команд
//        System.out.print(checkCommand());

        //Простой калькулятор с использованием switch
        System.out.print(calculyator());



    }

    /**  Вывод дня недели по номеру
     * взяла из практики доработала ввод с консоли
     */
    public static String dayOfWeek(){
        Scanner scanner = new Scanner(System.in);
        int day;
        System.out.print("Введите число от 1 до 7: ");
        day = scanner.nextInt();
        String dayOfWeek = "";
        switch (day){
            case 1:
                dayOfWeek = "ПН";
                break;
            case 2:
                dayOfWeek = "ВТ";
                break;
            case 3:
                dayOfWeek = "СР";
                break;
            case 4:
                dayOfWeek = "ЧТ";
                break;
            case 5:
                dayOfWeek = "ПТ";
                break;
            case 6:
                dayOfWeek = "СБ";
                break;
            case 7:
                dayOfWeek = "ВС";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }

        return dayOfWeek;

    }

    /** Стоимость билета по дню недели
     *
     */
    public static void checkTicketPrice(){ // здесь задумалась о том, что как-то наверно можно было бы переиспользовать метод выше
        Scanner scanner = new Scanner(System.in);
        int day;
        System.out.print("Введите число от 1 до 7, где 1 - это ПН, а 7 - это ВС: ");
        day = scanner.nextInt();

        switch (day){ // здесь загуглила как оптимизировать запись
            case 1, 2, 3, 4, 5 -> System.out.print("Стоимость билета 300 рублей");
            case 6, 7 -> System.out.print("Стоимость билета 450 рублей");
            default -> System.out.print("Несуществующий день недели");
        }
    }

    /**
     * Перевод числовых оценок в буквенные (A–F)
     * чуть-чуть пришлось подумать над методом, закиныла в ИИ (варианты мне не понравилисись и они были не рабочими) подумала и сделала сама
     * кажется что не совсем красиво, но работает)
     * подумала что можно было бы ввод количества балло зациклить,если введено неверно :)
     */

    public static String checkEvalution(){
        Scanner scanner = new Scanner(System.in);
        int points;
        System.out.print("Введите количество баллов от 0 до 100: ");
        points = scanner.nextInt();
        int determinant = 0;
        String evalutuion = "Введено неверное количество баллов ";

        if (points >= 0 && points < 60){
            determinant = 1;
      }
        if (points >= 60 && points <= 69){
            determinant = 2;
        }
        if (points >= 70 && points <= 79){
            determinant = 3;
        }
        if (points >= 80 && points <= 89){
            determinant = 4;
        }
        if (points >= 90 && points <= 100){
            determinant = 5;
        }

        switch (determinant){
            case 1:
                evalutuion = "Ваша оценка F";
                break;
            case 2:
                evalutuion = "Ваша оценка D";
                break;
            case 3:
                evalutuion = "Ваша оценка C";
                break;
            case 4:
                evalutuion = "Ваша оценка B";
                break;
            case 5:
                evalutuion = "Ваша оценка A";
                break;
        }
        return evalutuion;

    }

    /**
     * Обработка текстовых команд
     */
    public static String checkCommand(){
        Scanner scanner = new Scanner(System.in);
        int command;
        System.out.print("Введите команду от 1 до 4, где   \"1 - start\", \"2 - stop\", \"3 - restart\" или \"4 - status\": ");
        command = scanner.nextInt();
        String commandForPrint = "";

        switch (command){ // тут я подумала а что если в кейсе передавать стрингу тоже можно (это не сработало)
            case 1:
                commandForPrint = "Система запущена";
                break;
            case 2:
                commandForPrint = "Система остановлена";
                break;
            case 3:
                commandForPrint = "Система перезапущена";
                break;
            case 4:
                commandForPrint = "Система активна";
                break;
            default:
                commandForPrint = "Неверная команда";

        }
        return commandForPrint;

    }

    /**
     * Простой калькулятор с использованием switch
     */
    public static int calculyator(){
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Введите число a: ");
        a = scanner.nextInt();
        int b;
        System.out.print("Введите число b: ");
        b = scanner.nextInt();
        int result = 0;
        int operation;
        System.out.print("Введите операцию от 1 до 4, где 1 -сложить, 2 - вычесть, 3 - умножить, 4 - разделить: ");
        operation = scanner.nextInt();

        switch (operation){
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b == 0) { // этот момент загуглила, логику поняла
                    System.out.println("⛔ Ошибка: деление на ноль невозможно!");
                    return 0; // или Integer.MIN_VALUE, чтобы отличить от реального 0
                }
                result = a / b;
                break;
            default:
                System.out.println("⛔ Неверный номер операции. Выберите от 1 до 4.");
                return 0;
        }
        return result;


    }



}
