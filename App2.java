package Helicoptero;

import java.util.Scanner;

public class App2 {
   public static void main(String[] args){
        Helicoptero helicoptero = new Helicoptero(4);
        try(Scanner scanner = new Scanner(System.in)) {
          System.out.println(" Se Desejar entrar no helicoptero digite 1! \n Se deseja sair do helicoptero digite 2! \n se deseja ligar o helicoptero digite 3! \n se deseja desligar o helicoptero digite 4! \n se deseja decolar digite 5! \n se deseja aterrisar digite 6! \n ");
          int escolha = scanner.nextInt();
          while(escolha <=6){
            if(escolha == 1){
              helicoptero.entrar();
              escolha = scanner.nextInt();
            }
            if(escolha == 2){
              helicoptero.sair();
              escolha = scanner.nextInt();

            }
            if(escolha == 3){
              helicoptero.ligar();
              escolha = scanner.nextInt();
            }
            if(escolha == 4){
              helicoptero.desligar();
              escolha = scanner.nextInt();
            }
            if(escolha == 5){
              helicoptero.decolar(escolha);
              escolha = scanner.nextInt();
            }
            if(escolha == 6){
              helicoptero.aterrissar();
              escolha = scanner.nextInt();
            }
           }
        }
    }
}