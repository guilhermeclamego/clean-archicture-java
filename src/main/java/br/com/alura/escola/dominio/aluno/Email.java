package br.com.alura.escola.dominio.aluno;

public class Email {

    //Value Object poder ter o mesmo valor para os objetos
    private String endereco;

    public Email(String endereco) {
        if (endereco == null ||
                !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail invalido!");
        }

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
