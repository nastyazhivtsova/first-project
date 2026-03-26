package first_create_class;

public class Point {
    int x;
    int y;

    Point(int someX, int someY){
        this.x = someX;
        this.y = someY;
    }

int getX(){
        return x;
}

int getY(){
        return y;
}

void setX(int newX){
        this.x = newX;
}

void setY(int newY){
        this.y = newY;
}

void Print(){
        System.out.println("Координаты: " + x + " ; " + y); //если мы в декартовой системе и берем целые числа для удобства
}


}
