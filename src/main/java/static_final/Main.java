package static_final;

public class Main {
    static void main(String[] args){
//        Company anna = new Company(12,"Anna");
//        Company michael = new Company(13,"Michael");
//        Company masha = new Company(14,"Masha");
//        Company.companyName = "Google"; // до этого пустое значение было для всех
//        anna.printCompanyName();
//        michael.printCompanyName();
//        masha.printCompanyName();
        // anna.setEmployeeID(20); // невозможно изменить java: cannot assign a value to final variable employeeID

//        System.out.println(MathConstants.calculateCircleArea(4));
//        System.out.println(MathConstants.calculateCircumference(10));
//       // System.out.println(MathConstants.calculateExponentialGrowth); //нельзя вызвать так как это не статичный,но нсли сделать статичным, то будет работать
//        MathConstants a = new MathConstants();
//        System.out.println(a.calculateExponentialGrowth(4,2,3));


//        GameSettings game1 = new GameSettings(12);
//        GameSettings game2 = new GameSettings(14);
//        GameSettings.setMaxPlayers(14);
//        game1.addPlayer();
//        game1.printGameStatus();

//        Person anna = new Person("Anna","Fedorova", "125-013-452");
//        Person vladimir = new Person("Vladimir", "Rodin", "125-012-789");
//        Person petr = new Person("Petr","Zolotov","125-016-951");
//        anna.setFirstName("Anya");
//        anna.printPersonInfo();

        University masha = new University("Masha",548);
        University petya = new University("Petr", 743);
        University slava = new University("Slava",888);
        University.changeUniversityName("МГУ");
        masha.printStudentInfo();
        petya.printStudentInfo();
        slava.printStudentInfo();







    }





}
