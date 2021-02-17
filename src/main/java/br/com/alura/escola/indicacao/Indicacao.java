package br.com.alura.escola.indicacao;

import br.com.alura.escola.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {
    private Aluno indicado;
    private Aluno quemIndicou;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno quemIndicou) {
        this.indicado = indicado;
        this.quemIndicou = quemIndicou;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getQuemIndicou() {
        return quemIndicou;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }
}
