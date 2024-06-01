package list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros; // Atributo para armazenar a lista de números inteiros

    // Construtor sem parâmetros
    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    // Método para adicionar um número à lista
    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    // Método para ordenar os números em ordem ascendente
    public void ordenarAscendente() {
        Collections.sort(this.numeros);
    }

    // Método para ordenar os números em ordem descendente
    public void ordenarDescendente() {
        
        // Criando um Comparator personalizado para ordenação decrescente
        Comparator<Integer> comparatorDescendente = new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2.compareTo(n1); // Retorna a diferença entre n2 e n1 para ordenação decrescente
            }
        };
        Collections.sort(this.numeros, comparatorDescendente);
    }

    // Método para obter a lista de números ordenada
    public List<Integer> getNumerosOrdenados() {
        if (!numeros.isEmpty()) {
            return this.numeros;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
          System.out.println(this.numeros);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
}

