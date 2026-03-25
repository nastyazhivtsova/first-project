public class MathOperations {
    public static void main(String[] args) {

        int sum1 = add(7, 4);
        System.out.println("Результат сложение:" + sum1);
        int mult1 = multiply(7, 5);
        System.out.println("Результат умножения:" + mult1);
        int subtr1 = subtract(8, 2);
        System.out.println("Результат вычитания:" + subtr1);
        double div1 = divide(6, 4);
        System.out.println("Результат деления:" + div1);
        int findMax1 = findMax(344,500);
        System.out.println("Наибольшее число:" + findMax1);
        int diff1 = difference(344,500);
        System.out.println("Разница между числами:" + diff1);
        int squareArea1 = squareArea(5);
        System.out.println("Площадь квадрата:" + squareArea1);
        int perimeter1 = squarePerimeter(3);
        System.out.println("Периметр квадрата:" + perimeter1);
        double convert1 = convertSecondsToMinutes(152000);
        System.out.println("Перевод секунд в минуты:" + convert1);
        double avgSpeed = averageSpeed(5,2);
        System.out.println("Средняя скорость" + avgSpeed);
        double hypotenuse = findHypotenuse(4,6);
        System.out.println("Гипотенуза:" + hypotenuse);
        double okr = circleCircumference(5);
        System.out.println("Окружность:" + okr);
        double percent = calculatePercentage(25,100);
        System.out.println("Процент:" + percent);
        double ctf = celsiusToFahrenheit(15);
        System.out.println("Перевод в Фаренгейты:" + ctf);
        double ftc = fahrenheitToCelsius(59);
        System.out.println("Перевод в Цельсия:" + ftc);

    }


    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {//
        return x * y;
    }

    public static int subtract(int x, int y) {// аргументы метода
        return x - y;
    }

    public static double divide(int x, int y) {// аргументы метода
        // тело метода
        return (double) x / y;
    }


public static int findMax(int a, int b) {  // Наибольшее число
    return Math.max(a,b);
}

public static int difference(int x, int y) {
        return Math.abs(x-y); // возвращает положительную разницу между числами
    }

public static int squareArea(int side){ // возвращает площадь квадрата
     return side * side;
}

public static int squarePerimeter( int side){// периметр квадрата
       return  4 * side;
}

public static double convertSecondsToMinutes(int seconds){ // перевод секунд в минуты
      return (double) seconds / 60;
}

public static double averageSpeed(double distance, double time){ //возвращает среднюю скорость
    if (time == 0) {
        throw new IllegalArgumentException("Время не может быть нулем"); // воспользоалась ИИ
    }
    return distance / time;
}
public static double findHypotenuse(double a, double b){ // поиск гипотенузы
    if (a <= 0 || b <= 0) {
        return Double.NaN;
    }
    return Math.sqrt(a * a + b * b); // воспользоалась ИИ
}

public static double circleCircumference (double radius){// окружность
        return 2* Math.PI * radius;
}

public static double calculatePercentage(double part, double total){ //вычисление процентов
    if (total <= 0) {
        return Double.NaN;
    }
        return (part / total) * 100; // сделала по аналоги
}


public static double celsiusToFahrenheit (double c){ // перевод в Фарнегейты
        return c * 9 / 5 +32;
}

public static double fahrenheitToCelsius(double f){ // перевод в цельсии
        return (f - 32) * 5 / 9;
}

}
