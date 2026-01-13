package br.com.alura.streaming.calculos;
import br.com.alura.streaming.modelos.Filme;
import br.com.alura.streaming.modelos.Serie;
import br.com.alura.streaming.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
