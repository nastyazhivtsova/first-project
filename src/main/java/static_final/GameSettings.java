package static_final;

public class GameSettings {
    static int maxPlayers;
    final String GAME_NAME = "Волейбол";
    int currentPlayers;

    GameSettings (int someCurrentPlayers){
        this.currentPlayers = someCurrentPlayers;
    }

    static int setMaxPlayers(int newMaxPlayers){
        return maxPlayers = newMaxPlayers;
    }

    int addPlayer(){
        return currentPlayers++;
    }

    void printGameStatus(){
        System.out.println("Название игры: " + GAME_NAME + " Текущее количество участников: " + currentPlayers + " Максимальное количество игроков: " + maxPlayers);
    }

}
