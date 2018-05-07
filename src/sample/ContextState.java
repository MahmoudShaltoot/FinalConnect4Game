package sample;

public class ContextState {
    private static GameState contextGameState = new RunningState();

    public static void setState(GameState gameState){
        contextGameState = gameState;
    }

    public static String getGameState(){
        return contextGameState.getState();
    }
}
