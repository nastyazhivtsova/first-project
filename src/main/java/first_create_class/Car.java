package first_create_class;

public class Car {
    String brand;
    int year;

    //констурктор
    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }
    // геттер для марки
    String getBrand(){
        return this.brand;
    }

    // геттер для года выпуска
    int getYear(){
        return this.year;
    }

    // сеттер для марки
    void setBrand(String newBrand){
        this.brand = newBrand;
    }
// сеттер для года
    void setYear(int newYear){
        this.year = newYear;
    }

    void Print(){
        System.out.println("Марка машины: " + this.brand + " Год выпуска: " + this.year );
    }

}
