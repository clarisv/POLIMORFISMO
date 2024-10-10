package com.mycompany.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {

    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<>();

       
        listaLivros.add(new Livro("Verity", "Colleen Hoover", 39.99));
        listaLivros.add(new Livro("1984", "George Orwell", 29.90));

        
        listaLivros.add(new Ebook("A Metamorfose", "Franz Kafka", 29.90));
        listaLivros.add(new Ebook("Harry Potter e a Prisioneiro de Azkaban", "J.K. Rowling", 49.99));

       
        for (Livro livro : listaLivros) {
            livro.exibirDetalhes();
            System.out.println(); 
        }
    }
}
