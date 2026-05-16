package Extra_create_class;

import java.util.Scanner;

public class ShopItem {
    Scanner scanner = new Scanner(System.in);
    double price;
    int discount;
    double getPrice(){
        System.out.print("Сколько стоит вещь? ");
        price = scanner.nextDouble();
        return price;
    }

    int setDiscount(){
        System.out.print("Какая скидка? ");
        this.discount = scanner.nextInt();
        return discount;
    }

    void getFinalPrice(){
        System.out.print("Финальная цена с учетом скидки: " +  price * (100 - discount) / 100.0);
    }


}
