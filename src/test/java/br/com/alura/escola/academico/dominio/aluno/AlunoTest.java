package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    private Aluno aluno;

    @BeforeEach
    void beforeEach(){
        this.aluno = new Aluno(
                new CPF("123.456.987-88"),
                "Fulano da Silva",
                new Email("fulano@mail.com"));
    }

    @Test
    void deveriaPermitirAdicionar1Telefone(){
        this.aluno.adicionarTelefone("11", "99988080");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaPermitirAdicionar2Telefone(){
        this.aluno.adicionarTelefone("11", "99988081");
        this.aluno.adicionarTelefone("12", "99988082");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaPermitirAdicionar3Telefone(){
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("11", "99988081");
            this.aluno.adicionarTelefone("12", "99988082");
            this.aluno.adicionarTelefone("14", "99988083");
        });
    }



}