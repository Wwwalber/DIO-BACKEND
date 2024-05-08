public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada ? : "+smartTV.ligada);
        System.out.println("Canal atual ? : "+smartTV.canal);
        System.out.println("Volume atual ? : "+smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada ? : "+smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV ligada ? : "+smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumetarVolume();

        System.out.println("Canal atual: "+smartTV.canal);
        smartTV.mudarCanal(13);
    }
}
