package videoConsole;

import java.util.Random;

public class MineCraftGame implements GameConsole {

    private String[] messagesLR = {"Running from an enemy \uD83C\uDFC3\uD83E\uDDDF", "Going home \uD83D\uDEAA\uD83D\uDECF\uFE0F", "Exited to craft  something \uD83E\uDE91"};
    private Random rnd = new Random();

    @Override
    public void up() {
        System.out.println("Mining to left the cave ⛏\uFE0F\uD83D\uDD73\uFE0F");
    }

    @Override
    public void down() {
        System.out.println("Mining to find diamonds ⛏\uFE0F\uD83D\uDC8E");
    }

    @Override
    public void left() {
        System.out.println(messagesLR[rnd.nextInt(messagesLR.length)]);
    }

    @Override
    public void right() {
        System.out.println(messagesLR[rnd.nextInt(messagesLR.length)]);
    }
}
