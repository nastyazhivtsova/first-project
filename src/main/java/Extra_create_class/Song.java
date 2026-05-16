package Extra_create_class;

import java.util.Scanner;

public class Song { ;
    String title;
    int duration;

    public Song(String someTitle, int someDuration) {
        this.title = someTitle;
        this.duration =someDuration;
    }


    void play(){
        System.out.println("Сейчас играет: " + title + "(" + duration + " секунд)");
    }
}
