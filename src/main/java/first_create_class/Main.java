package first_create_class;

public class Main {
    static void main(String[] args){

//        Car mersedes = new Car("Mersedes", 1995);
//        mersedes.Print();
//        //вызов сеттера
//        mersedes.setYear(2026);
//        mersedes.Print();

//        Rectangle rectangle1 = new Rectangle(3, 5);
//        rectangle1.Print();
//        int square1 = rectangle1.calculateArea();
//        System.out.println("Площадь: " +  square1);
//        rectangle1.setWidth(6);
//        rectangle1.Print();
//        System.out.println("Площадь2:" + rectangle1.calculateArea()); //площадь с новой шириной, сделала сама, но пришлось думать

//        Book book1 = new Book("Книга Балтиморов", "Жоэль Диккер");
//        book1.printInfo();
//        book1.setAuthor("Загуглите сами");
//        book1.printInfo();

        BankAccount bankAccount1 = new BankAccount("Anastasiia",3000);
        double deposit1 = bankAccount1.deposit();
        bankAccount1.setBalance(deposit1);
        double withdraw1 = bankAccount1.withdraw();
        System.out.println("Сумма после внесения: " + deposit1 +" Сумма после снятия " +  withdraw1);



    }








}
