package br.com.alura.escola.academico.infra.indicacao;

import br.com.alura.escola.academico.aplicacao.indicacao.EnviarEMailIndicacao;
import br.com.alura.escola.academico.dominio.aluno.Aluno;

public class EnviarEMailIndicacaoComJavaMail implements EnviarEMailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        //Lógica de envio de emails com a lib Java Mail
    }
}
