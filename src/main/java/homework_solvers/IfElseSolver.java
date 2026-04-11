package homework_solvers;

import java.util.Scanner;

public class IfElseSolver {
    static void main(String[] args) {
        // проверка числа
//        System.out.println(checkNumber());

        // поиск наибольшего числа из введенных
//        checkMaxNumber();

        // Вывод оценки по шкале 1–5
//        System.out.print(printEvaluation());

        // проверка на четность
//        System.out.println(checkParity());

        // проверка метода на определение скидки
//        System.out.println(checkDiscount());

        //проверка результата теста
//        System.out.println(checkResult());



    }

    /**
     * Метод проверки числа на положительность
     * @return
     */

    public static String checkNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите число: ");
        number = scanner.nextInt();
        String numberDescription = "";
        if (number > 0) {
            numberDescription = "Число положительное";
        }

        if (number < 0){
            numberDescription = "Число отрицательное";
        }

        if (number == 0){
            numberDescription = "Число равно 0";
        }
        return numberDescription;
    }


    /**
     * Метод определяющий наибольшее число
     */

    public static void checkMaxNumber(){
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        int b;
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();

        if (a > b){
            System.out.println("Наибольшее число: " + a);
        }

        if (a < b){
            System.out.println("Наибольшее число: " + b);
        }
    }

    /**
     * Вывод оценки по шкале 1–5
     */
    public static String printEvaluation(){
        Scanner scanner = new Scanner(System.in);
        int evaluation;
        System.out.print("Введите оценку: ");
        evaluation = scanner.nextInt();
        String evaluationDescription = "Введите оценку от 1 до 5";
        if (evaluation == 5){
            evaluationDescription = "Отлично";
        }
        if (evaluation == 4){
            evaluationDescription = "Хорошо";
        }
        if (evaluation == 3){
            evaluationDescription = "Удовлетворительно";
        }
        if (evaluation == 1 || evaluation == 2 ){
            evaluationDescription = "Неудовлетворительно";
        }
        return evaluationDescription;
    }



    /**
     * Проверка на чётность
     * @return
     */
    public static String checkParity(){ //взяла из практики и добавила сканнер
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите число: ");
        number = scanner.nextInt();
        String parity = "Нечетное или равно нулю";
        if  (number % 2 == 0 && number != 0 ){ // добавила еще про ноль
            parity = "Четное";
        }
        return parity;
    }

    /**
     * Метод на определение размера скидки по возрасту
     */

    public static String checkDiscount(){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
        String discount = "Для вас не действует скидка";

        if (age <= 18){
            discount = "Размер вашей скидки 25%";
        }

        else if (age > 65){
            discount = "Размер вашей скидки 30%";
        }
        return  discount;

    }

    /**
     * Оценка результата теста по баллам
     */

    public static String checkResult(){
        Scanner scanner = new Scanner(System.in);
        int points;
        System.out.print("Введите количество баллов от 0 до 100: ");
        points = scanner.nextInt();
        String result = "Пожалуйста, введите количество баллов от 0 до 100";
        if (points >= 90 && points <=100){
            result = "Отлично";
        }
        if (points >= 75 && points <=89){
            result = "Хорошо";
        }
        if (points >= 60 && points <=74){
            result = "Удовлетворительно";
        }
        if (points <60){
            result = "Неудовлетворительно";
        }
        return result;


    }

}
