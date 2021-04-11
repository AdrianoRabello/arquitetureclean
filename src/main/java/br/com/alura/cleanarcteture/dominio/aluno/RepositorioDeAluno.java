package br.com.alura.cleanarcteture.dominio.aluno;

import java.sql.SQLException;
import java.util.List;

/**
 * @autor adriano rabello 11/04/2021 10:39 AM
 **/
public interface RepositorioDeAluno {

    void matricular(Aluno aluno);

    Aluno buscarPorCpf(String cpf) throws SQLException;

    List<Aluno> listarTodosAlunosMatriculados();
}
