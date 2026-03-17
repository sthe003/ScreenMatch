package br.com.alura.streaming.principal;

import br.com.alura.streaming.modelos.Filme;
import br.com.alura.streaming.modelos.Serie;
import br.com.alura.streaming.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1980);
        meuFilme.avalia(8);
        Filme segundoFilme = new Filme("Coraline", 2005);
        segundoFilme.avalia(10);
        Filme terceiroFilme = new Filme("Avatar", 2026);
        terceiroFilme.avalia(7);
        Serie lost = new Serie(2000, "Lost");

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(segundoFilme);
        listaDeAssistidos.add(terceiroFilme);
        listaDeAssistidos.add(lost);

        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Slander");
        buscaPorArtista.add("Johnny Depp");
        buscaPorArtista.add("Michael B. Jordan");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Ordem alfabetica: ");
        System.out.println(buscaPorArtista);

    }

}
