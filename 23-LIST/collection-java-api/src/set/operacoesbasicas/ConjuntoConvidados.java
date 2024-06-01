package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set <Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    private void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    private void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
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
    }

    // contarConvidados()

    // exibirConvidados()
}
