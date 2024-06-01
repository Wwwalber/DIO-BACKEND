package list.ordenacao.numeros;

public class OrdenacaoMain {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        System.out.println("Exibindo a lista de números adicionados: ");
        System.out.println(numeros.getNumerosOrdenados()); 
        
        System.out.println("Ordenando e exibindo em ordem ascendente: ");
        numeros.ordenarAscendente();
        // Exibindo a lista
        System.out.println(numeros.getNumerosOrdenados()); 
    
        System.out.println("Ordenando e exibindo em ordem descendente: ");
        numeros.ordenarDescendente();
        // Exibindo a lista
        System.out.println(numeros.getNumerosOrdenados()); 

        System.out.println("Exibindo pelo método getNumerosOrdenados");  
        System.out.println(numeros.getNumerosOrdenados()); 
      }
}
