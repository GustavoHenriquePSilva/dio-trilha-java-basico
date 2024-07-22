public class SmartTv {
    boolean Ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual : " + canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual : " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual : " + canal);
    }

    public void aumentarVolume(){
        //volume = volume + 1; 
        volume ++;
        System.out.println("Aumentando o volume para : " + volume);
    }
    public void diminuirVolume(){
        //volume = volume - 1; 
        volume --;
        System.out.println("Diminuindo o volume para : " + volume);
    }
    public void ligar(){
        Ligada = true;
    }
    public void desligar(){
        Ligada = false;
    }

    
}