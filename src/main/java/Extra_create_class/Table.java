package Extra_create_class;

public class Table {
    int width;
    int height;
    String material;

    public Table(String someMaterial, int someWidth, int someHeight) {
        this.material = someMaterial;
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth(){
        return width;
    }

    int getHeight(){
        return height;
    }

    String getMaterial(){
        return material;
    }

    void describe (){
        System.out.println("Стол из " + getMaterial() + ", размер "+ getHeight() + " x " + getWidth());
    }
}
