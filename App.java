package Guerreiro;
public class App {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro(1, "Guerreiro1");
        Guerreiro g2 = new Guerreiro(2, "Guerreiro2");
        
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        
        try {
            g1.lutar(g2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}