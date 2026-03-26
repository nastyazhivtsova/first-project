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

//        BankAccount bankAccount1 = new BankAccount("Anastasiia",3000); // как будто бы тут можно упростить, гуглить не стала решила оставить текущее решение
//        double deposit1 = bankAccount1.deposit();
//        bankAccount1.setBalance(bankAccount1.deposit());
//        double withdraw1 = bankAccount1.withdraw();
//        System.out.println("Сумма после внесения: " + deposit1 +" Сумма после снятия " +  withdraw1);

//        Point point1 = new Point(11,-20);
//        point1.setX(15);
//        point1.Print();

//        StudentGroup studentGroup1 = new StudentGroup("Happy people", 15);
//        studentGroup1.setStudentCount(21);
//        studentGroup1.printInfo();

//        Circle circle = new Circle(3);
//        circle.setRadius(5);
//        double square = circle.calculateArea();
//        System.out.println(square);
//        double length = circle.calculateCircumference();
//        System.out.println(length);

//        Teacher teacher1 = new Teacher("Оксана Павловна", "Математика"); //тут я наконец-то нашла применение геттерам
//        teacher1.setSubject("Mathematics");
//        teacher1.printInfo();

//        product1.applyDiscount(10);
//        Laptop laptop1 = new Laptop("Macbook", 120000);
//        laptop1.setPrice(180000);
//        laptop1.printInfo();

        Product product1 = new Product("Shoes",12000);
        product1.setPrice(10000);
        int sale = product1.applyDiscount(10);
        product1.setPrice(sale);
        product1.printInfo();
}







}
