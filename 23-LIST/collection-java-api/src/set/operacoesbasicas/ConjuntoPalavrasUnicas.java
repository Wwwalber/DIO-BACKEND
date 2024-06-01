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

    public void removerPalavra(String palavra){
        palavraSet.remove(palavra);
    }
    
    public void verificarPalavra(String palavra){
        boolean encontrada = false;
        for (String p : palavraSet) {
            if (p.equals(palavra)) {
                System.out.println("Palavra '"+palavra+"' encontrada");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Não existe a palavra procurada");
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavraSet=" + palavraSet + "]";
    }
    
}
