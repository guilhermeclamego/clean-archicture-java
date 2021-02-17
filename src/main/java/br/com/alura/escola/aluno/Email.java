package br.com.alura.escola.aluno;

public class Email {

    //Value Object poder ter o mesmo valor para os objetos
    private String endereco;

    public Email(String endereco) {
        if(endereco == null || !endereco.matches("^[\\\\w\\\\.-]+@([\\\\w\\\\-]+\\\\.)+[A-Z]{2,4}$\"")){
            throw new IllegalArgumentException("Endereço de e-mail inválido!");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
