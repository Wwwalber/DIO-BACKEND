package list.somanumeros;

public class SomaNumerosMain {
    public static void main(String[] args) {
        SomaNumeros listadenunumeros = new SomaNumeros();
        listadenunumeros.adicionarNumero(8);
        listadenunumeros.adicionarNumero(10);
        listadenunumeros.adicionarNumero(50);
        listadenunumeros.adicionarNumero(12);
        listadenunumeros.adicionarNumero(35);
        listadenunumeros.adicionarNumero(65);

        // exibe os números adicionados
        listadenunumeros.exibirNumeros();
        System.out.println("Valor da soma: "+listadenunumeros.calcularSoma());
        System.out.println("O maior número da lista é: "+listadenunumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: "+listadenunumeros.encontrarMenorNumero());

    }
}
