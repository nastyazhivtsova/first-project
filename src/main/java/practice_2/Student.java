package practice_2;

public class Student {
    int age;
    String name;

    //конструктор
Student(int someAge, String someName){
    this.age = someAge;
    this.name = someName;

}
//геттер для возраста
int getAge(){

    return this.age;
}
    //геттер для имени
String getName(){

    return this.name;
    }

    // сеттеры для возраста
void setAge(int newAge){

    this.age = newAge;
}
    // сеттеры для имени
void setName(String newName){

    this.name = newName;
    }

    void Print(){
    System.out.println("Возраст: " + this.age + " Имя: " + this.name); // был вопрос как это сразу сюда положить?

    }

}
