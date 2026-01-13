package br.com.alura.streaming.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos dos assinantes!");
        } else if (classificavel.getClassificacao() > 2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Assista mais tarde!");
        }
    }
}
