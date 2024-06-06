public class SistemaIbge {
    public static void main(String[] args) {
        // imprimindo os estados existentes
        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
        System.out.println(uf.getSigla()+" - "+uf.getNomeMaiusculo()+" - "+uf.getIbge());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());

    }
}
