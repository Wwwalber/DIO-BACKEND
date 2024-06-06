package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set <Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado convidado : convidadoSet) {
                if (convidado.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = convidado;
                    //acho o convidado então encerra o laço
                    break;
                }else{
                    System.out.println("Não existe candidato com o código  "+convidadoParaRemover.getCodigoConvite());
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }    
            
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }
}
