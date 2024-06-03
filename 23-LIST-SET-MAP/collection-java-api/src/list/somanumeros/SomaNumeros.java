package list.somanumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numerosDaLista;

    public SomaNumeros(){
        this.numerosDaLista = new ArrayList<>();
    }

    public void adicionarNumero(int numeroParaAdiciionar){
        Numero numero = new Numero(numeroParaAdiciionar);
        numerosDaLista.add(numero);
    }

    public int calcularSoma(){
        int valorSoma = 0 ;
        if (!numerosDaLista.isEmpty()) {
            for (Numero numeros : numerosDaLista) {
                valorSoma = valorSoma + numeros.getNumero();
            }
        } else {
            System.out.println("A lista não contém números!");
        }
        return valorSoma;
    }

    public int encontrarMaiorNumero(){
        List<Integer> listadeinteiros = new ArrayList<>();
        if (!numerosDaLista.isEmpty()) {
            for (Numero numero : numerosDaLista) {
                listadeinteiros.add(numero.getNumero());
            }
        } 
        return Collections.max(listadeinteiros);
    }
    
    public int encontrarMenorNumero(){
        List<Integer> listadeinteiros = new ArrayList<>();
        if (!numerosDaLista.isEmpty()) {
            for (Numero numero : numerosDaLista) {
                listadeinteiros.add(numero.getNumero());
            }
        } 
        return Collections.min(listadeinteiros);
    }

    public void exibirNumeros(){
        if (!numerosDaLista.isEmpty()) {
            System.out.println(numerosDaLista);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "SomaNumeros [numerosDaLista=" + numerosDaLista + "]";
    }
    
}
