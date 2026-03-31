package first_create_class;

public class Rectangle {
    int width;
    int height;

    //конструктор
    Rectangle(int someWidth, int someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }

    //геттеры для широты и высоты
    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    // сеттер для ширины
    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    int calculateArea() {
        return width * height ;
    }

    void print() {
        System.out.println("Высота: " + this.height + " Ширина: " + this.width);

    }

}
