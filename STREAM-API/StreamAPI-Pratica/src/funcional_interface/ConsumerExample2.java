import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("manga", "gatos", "abacaxi", "cachorro", "computador", "floresta",
                "amarelo", "piano", "ventilador", "bicicleta", "chocolate", "oceano", "televisão", "espelho", "morango",
                "avião", "livro", "futebol", "lápis", "janela", "girafa", "viagem", "relógio", "sorvete", "papagaio",
                "montanha", "telefone", "piscina", "dinossauro", "sanduíche", "pôr do sol", "escola", "coelho",
                "violão", "fogo", "hamburguer", "estrela", "música", "pintura", "praia", "bola", "cama", "arco-íris",
                "boi", "faca", "pipoca", "cadeira");

        palavras.stream().forEach(pal -> {
                System.out.println(pal);
            }    
        );

    }
}
