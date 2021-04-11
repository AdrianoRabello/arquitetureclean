package br.com.alura.cleanarcteture.infra;

import br.com.alura.cleanarcteture.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.cleanarcteture.dominio.aluno.Aluno;

/**
 * @autor adriano rabello 11/04/2021 12:14 PM
 **/
public class EnviardorEmailJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarEmaiParaAlunoIndicado(Aluno aluno) {

        /** aqui entra a lógica para enviar o email */
    }
}
