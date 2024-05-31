package list.somanumeros;

public class SomaNumerosMain {
    public static void main(String[] args) {
        SomaNumeros listadenunumeros = new SomaNumeros();
        listadenunumeros.adicionarNumero(8);
        listadenunumeros.adicionarNumero(10);
        listadenunumeros.adicionarNumero(50);
        listadenunumeros.adicionarNumero(12);

        // exibe os números adicionados
        listadenunumeros.exibirNumeros();
        System.out.println("Valor da soma: "+listadenunumeros.calcularSoma());
        
    }
}
