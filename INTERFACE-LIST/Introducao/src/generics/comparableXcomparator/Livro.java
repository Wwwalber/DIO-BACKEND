package generics.comparableXcomparator;

import java.util.Comparator;

// implementando Comparable
class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int ano;
    
	// Construtor
	public Livro(String ti, String au, int an) {
		this.titulo = ti;
		this.autor = au;
		this.ano = an;
	}

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    // Usado para ordenar livros por ano
    @Override
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    }

}

// classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}

// Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }  
}

 // classe para comparar ano e autor
 class CompararAnoAutorTitulo implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0) {
            return ano;
        }
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0) {
            return autor;
        }
        return l1.getTitulo().compareTo(l2.getTitulo());
    }   
 }