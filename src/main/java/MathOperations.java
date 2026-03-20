public class MathOperations {
    public static void main(String[] args) {

        int sum1 = add(7, 4);
        System.out.println("Результат сложение:" + sum1);
        int mult1 = multiply(7, 5);
        System.out.println("Результат умножения:" + mult1);
        int substr1 = substract(8, 2);
        System.out.println("Результат вычитания:" + substr1);
        double div1 = divide(6, 4);
        System.out.println("Результат деленеия:" + div1);
        int findMax1 = findMax(344,500);
        System.out.println("Наибольшее число:" + findMax1);
        int diff1 = difference(344,500);
        System.out.println("Разница между числами:" + diff1);
        int squareArea1 = squareArea(5);
        System.out.println("Площадь квадрата:" + squareArea1);
        int perimetr1 = squarePerimetr(3);
        System.out.println("Периметр квадрата:" + perimetr1);
        double convert1 = convertSecondsToMinutes(152000);
        System.out.println("Перевод секунд в минуты:" + convert1);
        double avgSpeed = averageSpeed(5,2);
        System.out.println("Средняя скорость" + avgSpeed);
        double hypotenus = findHypotenus(4,6);
        System.out.println("Гипотенуза:" + hypotenus);
        double okr = circleCirumference(5);
        System.out.println("Окружность:" + okr);
        double percent = calculatePercentage(25,100);
        System.out.println("Процент:" + percent);
        double ctf = celsiusToFahrenheit(15);
        System.out.println("Перевод в Фаренгейты:" + ctf);
        double ftc = fahrenheitToCelsius(59);
        System.out.println("Перевод в Цельсии:" + ftc);

    }


    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {//
        int mult = x * y;
        return mult;
    }

    public static int substract(int x, int y) {// аргументы метода
        int substr = x - y;
        return substr;
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

public static int squarePerimetr( int side){// периметр квадрата
       int perimetr = 4 * side;
        return perimetr;
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
public static double findHypotenus(double a, double b){ // поиск гипотенузы
    if (a <= 0 || b <= 0) {
        return Double.NaN;
    }
    return Math.sqrt(a * a + b * b); // воспользоалась ИИ
}

public static double circleCirumference (double radius){// окружность
        return 2* Math.PI + radius;
}

public static double calculatePercentage(double total, double part){ //вычисление процентов
    if (part <= 0) {
        return Double.NaN;
    }
        return (total / part) * 100; // сделала по аналоги
}


public static double celsiusToFahrenheit (double c){ // перевод в Фарнегейты
        return c * 9 / 5 +32;
}

public static double fahrenheitToCelsius(double f){ // перевод в цельсии
        return (f - 32) * 5 / 9;
}

}
