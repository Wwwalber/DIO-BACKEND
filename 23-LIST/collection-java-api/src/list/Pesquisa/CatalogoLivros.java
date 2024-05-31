package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaDeLivros;

    public CatalogoLivros() {
        this.listaDeLivros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaDeLivros.add((new Livro(titulo, autor, autor)));
    }
    public void pesquisarPorAutor(String autor){
        return List;
    }
    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        return List;
    }
    public void pesquisarPorTitulo(String titulo){
        return Livro;
    }
}
