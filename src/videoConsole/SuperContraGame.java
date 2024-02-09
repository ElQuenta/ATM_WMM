package videoConsole;

public class SuperContraGame implements GameConsole{
    public void up(){
        System.out.println("Salta\uD83E\uDD98\uD83D\uDD2B!!");
    }
    public void down(){
        System.out.println("Entra en el tubo \uD83D\uDD73\uFE0F\uD83D\uDD2B!!");
    }
    public void left(){
        System.out.println("Ir atras \uD83D\uDEB6\uD83C\uDFFD\uD83D\uDD2B");
    }
    public void right(){
        System.out.println("Corre\uD83C\uDFC3\uD83C\uDFFD\uD83D\uDD2B");
    }
}
