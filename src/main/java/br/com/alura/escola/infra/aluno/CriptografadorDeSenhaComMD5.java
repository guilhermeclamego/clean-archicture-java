package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.CriptografadorDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CriptografadorDeSenhaComMD5 implements CriptografadorDeSenha {
    @Override
    public String criptografaSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("erro ao gerar hash da senha");
        }
    }

    @Override
    public boolean validarSenhaCriptografada(String senhaCriptografada, String senha) {
        return senhaCriptografada.equals(criptografaSenha(senha));
    }
}
