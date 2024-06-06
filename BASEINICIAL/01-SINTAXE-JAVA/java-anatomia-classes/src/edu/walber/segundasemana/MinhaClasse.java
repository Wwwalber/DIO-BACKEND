package edu.walber.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá Java");
    
        // anatomia de classes 3
            //variáveis
        String menNome =  "Walber";
        int anoFabricacao = 2022;
        boolean verdadeiro = true;
        anoFabricacao = 2018;

        String primeiroNome = "Walber";
        String segundoNome = "Costa";

                // variável     parâmetro
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    // métodos
    public static String formatarCep(String cep){
        return cep;
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "resultado: "+primeiroNome.concat(" ").concat(segundoNome);
    }
}
