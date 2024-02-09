package videoConsole;

public class MarioGame implements GameConsole{
    public void up(){
        System.out.println("Salta\uD83E\uDD98!!");
    }
    public void down(){
        System.out.println("Entra en el tubo \uD83D\uDD73\uFE0F!!");
    }
    public void left(){
        System.out.println("Ir atras \uD83D\uDEB6\uD83C\uDFFD");
    }
    public void right(){
        System.out.println("Corre\uD83C\uDFC3\uD83C\uDFFD");
    }
}
