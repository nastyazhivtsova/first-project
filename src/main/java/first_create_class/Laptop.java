package first_create_class;

public class Laptop {
    String brand;
    int price;

    Laptop (String someBrand, int somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    String getBrand(){
        return brand;
    }

    int getPrice(){
        return price;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setPrice(int newPrice){
        this.price = newPrice;
    }

    void printInfo(){
        System.out.println("Название компьютера: " + getBrand() + " Стоимость: " + getPrice() + " рублей");
    }


}
