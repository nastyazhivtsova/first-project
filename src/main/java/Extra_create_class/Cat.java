package Extra_create_class;

public class Cat {
    String name;
    int age;

    Cat (String someName, int someAge){ //констурктор
        this.name = someName;
        this.age = someAge;
    }

    String getName(){
        return name;
    }

    void meow(){
        System.out.println("Кошка " + getName() +  " мяукает");
    }

    void sleep() {
        System.out.println("Кошка " + getName() + " спит");
    }

}
