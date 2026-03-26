package first_create_class;

public class Teacher { // при написании этого класса уже получалось писать по памяти
    String name;
    String subject;

    Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    String getName(){
        return name;
    }

    String getSubject(){
        return subject;
    }

    void setName(String newName){
        this.name = newName;
    }

    void setSubject(String newSubject){
        this.subject = newSubject;
    }

    void printInfo(){
        System.out.println("Имя учителя: " + getName() + " Название предмета: " + getSubject()); // тут решила наконнц-то воспользоваться геттерами)
    }



}