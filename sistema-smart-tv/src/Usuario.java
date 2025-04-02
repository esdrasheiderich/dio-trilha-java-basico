public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        // smartTv.aumentarVolume();
        // smartTv.aumentarVolume();
        // System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        // smartTv.diminuirVolume();
        // System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo canal: " + smartTv.canal);
        
        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);
    
    }

}
