package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);
        MatricularAlunoDto dados = new MatricularAlunoDto("Guilherme Teste", "123.456.789-99", "teste@mail.com");
        useCase.executaMatricula(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-99"));
        assertEquals("Guilherme Teste", encontrado.getNome());
        assertEquals("123.456.789-99", encontrado.getCpf());
        assertEquals("teste@mail.com", encontrado.getEmail());
    }

}