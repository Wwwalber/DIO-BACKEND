package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavraSet.isEmpty()) {
            System.out.println(palavraSet);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }
    /*
     * 
     * removerPalavra(String palavra)
     * verificarPalavra(String palavra)
     * exibirPalavrasUnicas()
     */

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavraSet=" + palavraSet + "]";
    }
    
}
