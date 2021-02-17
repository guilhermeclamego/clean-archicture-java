package br.com.alura.escola.dominio.aluno;

public interface CriptografadorDeSenha {
    String criptografaSenha(String senha);
    boolean validarSenhaCriptografada(String senhaCriptografada, String senha);
}
