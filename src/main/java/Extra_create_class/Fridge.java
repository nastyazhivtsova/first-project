package Extra_create_class;

public class Fridge {
    int temperature;

    public Fridge(int someTemperature) {
        this.temperature = someTemperature;
    }

    int setTemperature(int t){
        this.temperature = t;
        return t;
    }

    void getStatus(){
        System.out.println("«Холодильник охлаждает при градусах»");
    }
}
