package informationhiding.p2;

public class Villain {

    public static void sabotage() {
        GameSettings.maxAttempts = 10;
        System.out.println("I want to play longer!");
    }

    public static void main(String[] args) {
        GameSettings.display();
        sabotage();
        GameSettings.display();

        Main.playGame();
    }
}
