package Helicoptero;

public class Helicoptero{
    private boolean ligado;
    private int capacidade;
    private int altitude;
    private int pessoa;

    public Helicoptero(int capacidade){
        this.ligado = false;
        this.capacidade = capacidade;
        this.altitude = 0;
        this.pessoa = 0;
    }

    public boolean isligado(){
        return ligado;
    }

    public int getcapacidade(){
        return capacidade;
    }

    public int getaltitude(){
        return altitude;
    }

    public int getpessoa(){
        return pessoa;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    public void setpessoa(int pessoa){
        this.pessoa = pessoa;
    }

    public void setligado(boolean ligado){
        this.ligado = ligado;
    }

    public void entrar(){
        if(this.pessoa < this.capacidade){
            this.pessoa++;
            System.out.println("Uma pessoa entrou no Helicoptero \n");
        }else{
            System.out.println("Não tem mais espaço no helicoptero \n");
        }
    }

    public void sair(){
        if(this.pessoa > 0){
            this.pessoa --;
            System.out.println("Uma pessoa saiu do helicoptero \n");
        }else{
            System.out.println("Não tem ninguem no helicoptero \n");
        }
    }

    public void ligar(){
        if(!this.ligado){
            this.ligado = true;
            System.out.println("O helicoptero está ligado! \n");
        } else{
            System.out.println("O helicopte ja está ligado \n");
        }
    }

    public void decolar(int altitude){
        if(this.ligado == true && this.altitude == 0){
            this.altitude = altitude;
            System.out.println("O helicoptero decolou e está " + altitude + " Metros de altitude! \n");
        } else{
            System.out.println("O helicoptero não pode decolar! \n");
        }
    }

    public void aterrissar(){
        if(this.ligado == true && this.altitude > 0){
            this.altitude = 0;
            System.out.println("O helicoptero decolou! \n");
        }else{
            System.out.println("O helicoptero não pode aterrisar! \n");
        }
    }

    public void desligar(){
        if(this.ligado = true){
            this.ligado = false;
            System.out.println("O helicoptero está desligado! \n");
        }else{
            System.out.println("O Helicoptero já está desligado!");
        }
    }

    public String toString(){
        return("O helicoptero está com " + pessoa + " Passageiros, está com " + altitude + " e está " + ligado);
    }

}
