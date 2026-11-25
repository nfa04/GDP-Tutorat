package informationhiding.p2;

public class Main {

    public static void playGame() {
        for (int i = 0; i < GameSettings.maxAttempts; i++) {
            System.out.println("Playing...");
        }
    }

    public static void main(String[] args) {
        GameSettings.display();
        playGame();
    }
}
