package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaDeLivros;

    public CatalogoLivros() {
        this.listaDeLivros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaDeLivros.add((new Livro(titulo, autor, anoPublicacao)));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro livro : listaDeLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(livro);
                }
            }
        }    
        return listaPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaPorIntervaloDeAnos = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro livro : listaDeLivros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao()<= anoFinal){
                    listaPorIntervaloDeAnos.add(livro);
                }
            }
        }
        return listaPorIntervaloDeAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        // não precisa retornar uma lista, mas somente um
        Livro livroPorTitulo = null; 
        if (!listaDeLivros.isEmpty()) {
            for (Livro livro : listaDeLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;// se já encontrou o livro, então para o laço
                }
            }
        }
        return livroPorTitulo;
    }
}
