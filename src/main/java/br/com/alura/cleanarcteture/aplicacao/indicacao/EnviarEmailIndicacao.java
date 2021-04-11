package br.com.alura.cleanarcteture.aplicacao.indicacao;

import br.com.alura.cleanarcteture.dominio.aluno.Aluno;

/**
 * @autor adriano rabello 11/04/2021 12:13 PM
 **/
public interface EnviarEmailIndicacao {

    void enviarEmaiParaAlunoIndicado(Aluno aluno);
}
