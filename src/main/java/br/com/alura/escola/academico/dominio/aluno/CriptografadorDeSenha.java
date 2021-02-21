package br.com.alura.escola.academico.dominio.aluno;

public interface CriptografadorDeSenha {
    String criptografaSenha(String senha);
    boolean validarSenhaCriptografada(String senhaCriptografada, String senha);
}
