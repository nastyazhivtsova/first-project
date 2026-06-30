package ExtraSolutions.SimpleTask;

import java.util.Scanner;

public class MathOperations {
    //  очень хотелось вынести из методов общую часть
    static Scanner scanner = new Scanner(System.in);
    static double a;
    static double b;
    static double n;
    static int exponent;

    public static double getA(){
        System.out.print("Введите первое число : ");
        a = scanner.nextDouble();
        return a;
    }

    public static double getB(){
        System.out.print("Введите второе число : ");
        b = scanner.nextDouble();
        return b;
    }

    public static double getN(){
        System.out.print("Введите  число : ");
        n = scanner.nextDouble();
        return n;
    }

    public static int getExponent(){
        System.out.print("Введите степень : ");
        exponent = scanner.nextInt();
        return exponent;
    }

    /**
     *  Сложение двух чисел
     *
     */

    public static double add(){
        return getA() + getB();
    }

    /**
     * Разность двух чисел
     */

    public static double subtract(){
        return getA() - getB();

    }

    /**
     * Произведение
     */

    public static double multiply(){
        return getA() * getB();
    }

    /**
     * Деление с остатком
     */
    public static double divide(){
        return getA() / getB();
    }

    /**
     * Проверка деления на ноль
     */

    public static void checkDivideOnZero(){ // сделала сама
        getA();
        if (getB() != 0){
            double res = a / b;
            System.out.println("Результат деления" + res);
        }
        else System.out.println("Ошибка деления на ноль");
    }

    /**
     * Определение максимума
     */
    public static void findMax(){
        System.out.println("Наибольшее число: " + Math.max(getA(), getB()));
    }

    /**
     * Определение минимума
     */

    public static void findMin(){
        System.out.println("Наименьшее число: " + Math.min(getA(), getB()));
    }

    /**
     * Определение остатка от деления
     */

    public static void modulus(){
        System.out.println("Остаток от деления: " + getA() % getB());
    }

    /**
     * Среднее значение двух чисел
     */
    public static void average(){
        System.out.println("Среднее значение: " + (getA() + getB()) / 2);
    }

    /**
     * Проверка чётности и нечетности
     */
    public static void isEven(){
        if (getN() % 2 == 0){
            System.out.println("Числое четное");
        }
        else System.out.println("Числое нечетное");
    }

    /**
     * Возведение в квадрат
     */

    public static void square(){
        System.out.println("Квадрат числа: " + getN() * n);
    }

    /**
     * Возведение в куб
     */
    public static void cube(){
        System.out.println("Число в кубе: " + getN() * n * n);
    }

    /**
     * Корень из числа
     */

    public static void squareRoot(){
        System.out.println("Корень из числа: " + Math.sqrt(getN()));
    }

    /**
     *Степень
     */

    public static void power(){
        System.out.println("Степень числа: " + Math.pow(getN(), getExponent()));
    }

    /**
     * Округление вверх
     */
    public static void roundUp(){
        System.out.println("Округление числа вверх : " + Math.ceil(getN()));
    }

    /**
     * Округление вниз
     */
    public static void roundDown(){
        System.out.println("Округление числа вниз : " + Math.floor(getN()));
    }

    /**
     *  Округление до ближайшего целого
     */
    public static void roundNearest(){
        System.out.println("Округление числа до ближайшего целого : " + Math.round(getN()));
    }

    /**
     * Абсолютное значение
     */
    public static void absolute(){
        System.out.println("Абсолютное значение: " + Math.abs(getN()));
    }

    /**
     * Обмен двух чисел
     * В методе swap(int a, int b) выведи сначала a, потом b, а затем
     * поменяй их местами и снова выведи
     */

    public static void swap(){ // сделала по своему
        getA();
        getB();
        System.out.println("Смена порядка: " + b + " " + a);
    }

    /**
     * Конвертация минут в часы
     */
    public static void minutesToHours(){
        System.out.println("Конвертация минут в часы");
        System.out.println( getN() / 60 + " ч");
    }

    /**
     * Конвертация секунд в минуты
     */
    public static void secondsToMinutes(){
        System.out.println("Конвертация секунд в минуты");
        System.out.println( getN() / 60 + " м");
    }

    /**
     * Перевод температуры из Цельсия в Фаренгейты
     */

    public static void celsiusToFahrenheit(){
        System.out.println("Перевод температуры из Цельсия в Фаренгейты");
        System.out.println("В фаренгейтах: " + getN() * 9/5 + 32);

    }

    /**
     * Перевод расстояния из километров в мили
     */
    public static void kmToMiles() {
        System.out.println("Перевод расстояния из километров в мили");
        System.out.println("В милях: " + getN() * 0.621371);
    }

    /**
     * Проверка, делится ли одно число на другое
     */

    public static void isDivisible() {
        getA();
        getB();
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        if (a % b == 0) {
            System.out.println("Разделить можно :)))");
        } else System.out.println("Разделить не получится:((( ");
        }
    }




