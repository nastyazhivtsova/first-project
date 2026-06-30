package practice_4.solvers;

public class ForTaskSolver {

    public static void main(String[] args){
        // проверка таблицы умножения
//        multyplyTable(5);
        // проверка суммы чисел
//        System.out.println(sumOfAllNumber(10));

        //проверка работы метода по определению простого числа
        System.out.println(checkNumberIsSimple(7));
        System.out.println(checkNumberIsSimple(6));



    }

    public static void multyplyTable(int number){
        for (int i =1; i <= 10; i++){
          System.out.println(
                  number + " x " + i + " = " + number * i);
        }
    }


    public static int sumOfAllNumber(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static boolean checkNumberIsSimple(int number){
        boolean isSimple = true;
        for (int i = 2; i < number - 1; i++){
            if(number % i == 0){
                isSimple = false;
                break;
            }

        }
        return isSimple;
    }



}
