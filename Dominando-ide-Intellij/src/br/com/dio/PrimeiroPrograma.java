package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Rajesh","Preto",4);
        Livro livro = new Livro("Vidas Secas",176,"Graciliano Ramos");

        System.out.println(gato);
        System.out.println(livro);
    }
}
