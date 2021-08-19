package br.com.dio.model;

public class Livro {
    private String nomeLivro;
    private int numPaginas;
    private String autor;

    public Livro(String nomeLivro, int numPaginas, String autor) {
        this.nomeLivro = nomeLivro;
        this.numPaginas = numPaginas;
        this.autor = autor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                '}';
    }
}
