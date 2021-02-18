package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;
import org.w3c.dom.events.Event;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return momento;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }


}
