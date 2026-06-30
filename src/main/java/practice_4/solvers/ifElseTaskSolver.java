package practice_4.solvers;

public class ifElseTaskSolver {

    public static void main(String[] args){


//         проверка метода четности
        System.out.println(checkParity(4)); //так как перенсли можно поменять на this, но так как поставили статик, то можно напрямую
        System.out.println(checkParity(7));

//         проверка метода определения возраста
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(71));

//         проверка метода нахождения максимального числа среди 3х чисел
        System.out.println(checkMax(12,100,5));
    }
    /**
     * Метод для проверки четности числа number
     * @param number
     * @return
     */
    public static String checkParity(int number){ // но так как из статического метода можно вызвать только статический (из-за переноса мейн сюда) добавляес сюда статик
       // if else
        // четность :2
        //  в методе должен быть только 1 return
//       if  (number % 2 == 0){
//           return "Четное";
//       } else (number % 2 == 1){
//           return "Нечетное";
//       }
        String parity = "Нечетное";
        if  (number % 2 == 0){
           parity = "Четное";
       }
        return parity;
    }

    /**
     * Метод на определении возраста
     * @param age
     * @return
     */
    public static String checkAge(int age){
        String ageDescreptiom = "";
        if (age < 18){
            ageDescreptiom = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60){
            ageDescreptiom = "Взрослый";
        }
        if (age > 60){
            ageDescreptiom = "Пожилой";
        }
        return ageDescreptiom;
    }

    /**
     * Метод на определение наибольшего числа
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int checkMax(int a, int b, int c){
        int maxAB = b;
        if (a > b){
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB){
            maxAB = c;
        }
        return max; // так как макс это инт, то меняем воид на инт
    }





}
