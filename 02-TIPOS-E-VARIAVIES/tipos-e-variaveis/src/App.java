public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double salarioMinimo = 2500; // dois mil e quinhentos
        double salarioMinimo2 = 2.500; // dois e meio (2,5)
        double salarioMinimo3 = 2500.80; // dois mil quinhentos e oitenta
        double salarioMinimo4 = 2,500.80; // dois mil quinhentos e oitenta

        short numeroCurto = 1;
        int numeroDecimal = numeroCurto; // ok, short com certeza caberá em um int
        short numeroCurto2 = numeroDecimal; /*  apesar de sabermos que nesse caso
                                na nossa aplicação mas caso em algum momento venha
                                um valor muito grande com certeza daria erro. Por
                                isso o Java nem permite esse atribuição. A não
                                ser que se faça um cast, como abaixo (é uma
                                adaptação, estando consciente de que não é
                                consistente já que pode ocorre um erro)
                                */
        short numeroCurto3 = (short) numeroDecimal;                                
    }
}
