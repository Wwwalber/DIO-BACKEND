public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para: "+canal);
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal++;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumetarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+ volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+ volume);
    }
}
