package static_final;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    static double calculateCircleArea(double r){//площадь круга

        return PI * r * r;
    }

    static double calculateCircumference(double r){ //длина окружности
        return 2 * PI * r;
    }

    static double calculateExponentialGrowth(double initialValue, double rate, double time){
        return initialValue * Math.pow(E,rate * time);

    }



}
