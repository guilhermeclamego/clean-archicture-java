package br.com.alura.escola.academico.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {
    @Test
    void naoDeveriaCriarTelefoneInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1588", "12345678987898745"));
    }
}