package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
        MatricularAlunoDto dados = new MatricularAlunoDto("Guilherme Teste", "123.456.789-99", "teste@mail.com");
        useCase.executaMatricula(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-99"));
        assertEquals("Guilherme Teste", encontrado.getNome());
        assertEquals("123.456.789-99", encontrado.getCpf());
        assertEquals("teste@mail.com", encontrado.getEmail());
    }

}