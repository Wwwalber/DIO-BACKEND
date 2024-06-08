import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("banana", "gatos", "abacaxi", "cachorro", "computador", "floresta", "amarelo", "piano", "ventilador", "bicicleta", "chocolate", "oceano", "televisão", "espelho", "morango", "avião", "livro", "futebol", "lápis", "janela", "girafa", "viagem", "relógio", "sorvete", "papagaio", "montanha", "telefone", "piscina", "dinossauro", "sanduíche", "pôr do sol", "escola", "coelho", "violão", "fogo", "hamburguer", "estrela", "música", "pintura", "praia", "bola", "cama", "arco-íris", "borboleta", "chave", "sapato", "lua");
        
        Consumer<String> imprimeLista = palavra -> {
            System.out.println(palavra);            
        };
    
        palavras.stream().forEach(imprimeLista);

    
        System.out.println("\n***********\nMAIN 2\n");

        List<Double> medidas = Arrays.asList(0.123, 1.234, 2.345, 3.456, 4.567, 5.678, 6.789, 7.890, 8.901, 9.012, 10.123, 11.234, 12.345, 13.456, 14.567, 15.678, 16.789, 17.890, 18.901, 19.012, 20.123, 21.234, 22.345, 23.456, 24.567, 25.678, 26.789, 27.890, 28.901, 29.012, 30.123, 31.234, 32.345, 33.456, 34.567, 35.678, 36.789, 37.890, 38.901, 39.012, 40.123, 41.234, 42.345, 43.456, 44.567, 45.678, 46.789, 47.890, 48.901, 49.012);
        
        Consumer<Double> imprimeDoubles = numeros_doble-> {
            System.out.println(numeros_doble);
        };
        medidas.stream().forEach(imprimeDoubles);

    }

}
