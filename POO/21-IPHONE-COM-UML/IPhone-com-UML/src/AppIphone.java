import dispositivos.Iphone;

public class AppIphone {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando, iPhome!");

        Iphone iphone = new Iphone();
        iphone.ligar("9558554");
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.exibirPagina("www.dio.me");
    }
}
