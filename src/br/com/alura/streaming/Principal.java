package br.com.alura.streaming;
import br.com.alura.streaming.calculos.CalculadoraDeTempo;
import br.com.alura.streaming.calculos.FiltroRecomendacao;
import br.com.alura.streaming.modelos.Episodio;
import br.com.alura.streaming.modelos.Filme;
import br.com.alura.streaming.modelos.Serie;

import static java.lang.System.*;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(9);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(4);
        meuFilme.avalia(10);
        out.println(meuFilme.getTotalDeAvaliacoes());
        out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(5);
        lost.setMinutosPorEpisodio(50);
        out.println("Duração total: " + lost.getDuracaoEmMinutos());

        Filme segundoFilme = new Filme();
        segundoFilme.setNome("Coraline");
        segundoFilme.setAnoDeLancamento(2005);
        segundoFilme.setDuracaoEmMinutos(120);
        segundoFilme.avalia(10);

        Filme terceiroFilme = new Filme();
        terceiroFilme.setNome("Avatar");
        terceiroFilme.setAnoDeLancamento(2026);
        terceiroFilme.setDuracaoEmMinutos(180);
        terceiroFilme.avalia(8);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(segundoFilme);
        calculadora.inclui(lost);
        out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
