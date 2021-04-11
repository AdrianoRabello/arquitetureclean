package br.com.alura.cleanarcteture.dominio.aluno;

/**
 * @autor adriano rabello 11/04/2021 11:46 AM
 **/
public class AlunoNaoEncontratoException extends  RuntimeException{


    public AlunoNaoEncontratoException(String cpf){
        super("Aluno com o cpf "+ cpf + "não encontrado");
    }
}
