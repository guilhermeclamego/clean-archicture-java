package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.aplicacao.indicacao.EnviarEMailIndicacao;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEMailIndicacaoComJavaMail implements EnviarEMailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        //Lógica de envio de emails com a lib Java Mail
    }
}
