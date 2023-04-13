
package Guerreiro;

import java.util.Random;

public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia;

    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void incremento() {
        if (this.energia < 5) {
            this.energia++;
        }
    }

    public void decremento() {
        this.energia--;
        if (this.energia == 0) {
            System.out.println(this.nome + " está sem energia.");
        }
    }

    public void alimentar() {
        incremento();
        System.out.println(nome + " se alimentou e agora tem " + this.energia + " de energia.");
    }

    private int atacar() {
        Random random = new Random();
        return random.nextInt(2);
    }

    public void lutar(Guerreiro oponente) throws InterruptedException {
        System.out.println(this.nome + " está lutando contra " + oponente.nome + "!");
        while (true) {
            int sucessoAtaque = atacar();
            if (sucessoAtaque == 1) {
                System.out.println(this.nome + " atacou " + oponente.nome + "!");
                oponente.decremento();
                Thread.sleep(1000);
                System.out.println(this.nome + ": " + this.energia + " " + oponente.nome + ": " + oponente.energia);
                Thread.sleep(1000);
            } else {
                System.out.println(this.nome + " errou o ataque.");
                Thread.sleep(1000);
            }
            if (oponente.getEnergia() == 0) {
                System.out.println(oponente.nome + " perdeu a luta.");
                Thread.sleep(1000);
                System.out.println(this.nome + " venceu a luta!");
                Thread.sleep(1000);
                break;
            }

            sucessoAtaque = oponente.atacar();
            if (sucessoAtaque == 1) {
                System.out.println(oponente.nome + " atacou " + this.nome + "!");
                decremento();
                Thread.sleep(1000);
                System.out.println(this.nome + ": " + this.energia + " " + oponente.nome + ": " + oponente.energia);
                Thread.sleep(1000);
            } else {
                System.out.println(oponente.nome + " errou o ataque.");
                Thread.sleep(1000);
            }
            if (this.energia == 0) {
                System.out.println(this.nome + " perdeu a luta.");
                Thread.sleep(1000);
                System.out.println(oponente.nome + " venceu a luta");
                Thread.sleep(1000);
                break;
            }
        }
    }

    public String toString() {
        return "Guerreiro [codigo: " + this.codigo + ", nome: " + this.nome + ", energia: " + this.energia + "]";
    }
}