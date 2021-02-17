package br.com.alura.escola.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd == null || numero == null){
            throw new IllegalArgumentException("DDD e Número são obrigatórios!");
        }
        if(!ddd.matches("^\\([1-9]{2}\\)")){
            throw new IllegalArgumentException("DDD Inválido");
        }
        if(!numero.matches("\\d{8}|\\d{9}")){
            throw new IllegalArgumentException("Número inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
