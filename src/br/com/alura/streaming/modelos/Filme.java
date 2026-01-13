package br.com.alura.streaming.modelos;

import br.com.alura.streaming.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
        private String diretor;

        public String getDiretor() {
                return diretor;
        }

        public void setDiretor(String diretor) {
                this.diretor = diretor;
        }

        @Override
        public int duracaoEmMinutos() {
                return 010;
        }

        @Override
        public int getClassificacao() {
                return (int)pegaMedia()/ 2;
        }
}
