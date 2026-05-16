package Extra_create_class;

public class Pen {
    String color;

    public Pen(String someColor) {
        this.color = someColor;
    }

    String getColor(){
        return color;
    }

    void write(String text){
        System.out.println(getColor() + " ручка пишет " + text);
    }
}
