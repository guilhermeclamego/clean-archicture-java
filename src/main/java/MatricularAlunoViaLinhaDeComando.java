import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import sun.rmi.runtime.Log;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Guilherme C. Lamego";
        String cpf = "123.456.789-00";
        String email = "guilherme@mail.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());
        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
        matricular.executaMatricula(new MatricularAlunoDto(nome, cpf, email));
    }
}
