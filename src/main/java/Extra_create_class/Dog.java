package Extra_create_class;

public class Dog {
    String name;
    String breed;

    Dog (String someName, String someBreed){
        this.name = someName;
        this.breed = someBreed;
    }

     void bark(){
        System.out.println("Собака " + name + " породы " + breed + " лает:\n" +
                "Гав-гав!");
    }
}
