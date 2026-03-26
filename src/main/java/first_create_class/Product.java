package first_create_class;

public class Product {
    String name;
    int price;

    Product(String someName,int somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return name;
    }

    int getPrice(){
        return price;
    }

    void setName(String newName){
        this.name = newName;
    }

    void setPrice(int newPrice){
        this.price = newPrice;
    }

    int applyDiscount(int discount){
        return price - (price * discount / 100);
    }

    void printInfo(){
        System.out.println("Цена с учетом скидки: " + getPrice());
    }


}
