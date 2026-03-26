package first_create_class;

public class Circle {
    int radius;

    Circle(int someRadius){
        this.radius = someRadius;
    }

    int getRadius(){
        return this.radius;
    }

    void setRadius(int newRadius){
        this.radius = newRadius;
    }

    double calculateArea(){
        return  Math.PI * radius * radius;
    }

    double calculateCircumference(){
        return 2* Math.PI * radius;
    }

}
