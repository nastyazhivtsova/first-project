package static_final;

public class GameSettings {
    static int maxPlayers;
    static final String GAME_NAME = "Волейбол";
    static int currentPlayers = 10;

//    GameSettings (int someCurrentPlayers){
//        currentPlayers = someCurrentPlayers;
//    }

    static void setMaxPlayers(int newMaxPlayers){
         maxPlayers = newMaxPlayers;
    }

    static void addPlayer(){
         currentPlayers++;
    }

    static void printGameStatus(){
        System.out.println("Название игры: " + GAME_NAME + " Текущее количество участников: " + currentPlayers + " Максимальное количество игроков: " + maxPlayers);
    }

}
