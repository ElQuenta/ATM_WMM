package videoConsole;

public class GameRunner {
    GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("runing Game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

    public void changeGame(GameConsole game) {
        this.game = game;
    }
}
