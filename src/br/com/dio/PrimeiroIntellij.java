package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroIntellij {
    public static void main(String [] args){
        System.out.println("Rodando Papai!");
        Gato gato = new Gato("gagau","black",9);
        Livro livro = new Livro("O comendador", 200);

        System.out.println(gato);
        System.out.println(livro);
    }
}
