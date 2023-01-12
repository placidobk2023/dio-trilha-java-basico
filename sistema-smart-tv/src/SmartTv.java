public  class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume = 25;
    public void mudarcanal (int novoCanal){
         canal = novoCanal;

    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Almentar o volume atual para : " +volume);
    }

    public void diminuirVolume(){
       volume--; 
       System.out.println("Diminuir volume atual para : " +volume);

    }
    public void ligar(){
    }
    public void desligar(){
    }
    public void almentarCanal(){
        System.out.println("Aumentar canal atual para : " +canal);
        canal ++;

    }

        public void diminuirCanal(){
    System.out.println("Diminuir canal atual para : " +canal);
    canal --; }
        }