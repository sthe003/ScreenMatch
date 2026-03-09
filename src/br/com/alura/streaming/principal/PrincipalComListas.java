package br.com.alura.streaming.principal;

import br.com.alura.streaming.modelos.Filme;
import br.com.alura.streaming.modelos.Serie;
import br.com.alura.streaming.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme( "O Poderoso Chefão", 1980);
        Filme segundoFilme = new Filme("Coraline", 2005);
        Filme terceiroFilme = new Filme("Avatar", 2026);
        Serie lost = new Serie(2000, "Lost");

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(segundoFilme);
        listaDeAssistidos.add(terceiroFilme);
        listaDeAssistidos.add(lost);

        for (Titulo item : listaDeAssistidos){
            System.out.println(item);
        }
    }


}
