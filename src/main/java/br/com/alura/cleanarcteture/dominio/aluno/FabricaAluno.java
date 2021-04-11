package br.com.alura.cleanarcteture.dominio.aluno;

/**
 * @autor adriano rabello 11/04/2021 10:17 AM
 **/
public class FabricaAluno {

    private Aluno aluno;


    public FabricaAluno comNomeCpfEmail(String nome, String cpf, String email){

        this. aluno = new Aluno(nome, new Cpf(cpf), new Email(email) );

        return this;
    }

    public FabricaAluno comTelefone(String ddd, String numero){

        this.aluno.adicionarTelefone(ddd, numero);

        return this;
    }

    public Aluno criar(){

        return this.aluno;
    }

}
