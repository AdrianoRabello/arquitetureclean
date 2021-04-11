package br.com.alura.cleanarcteture.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor adriano rabello 11/04/2021 9:25 AM
 **/

public class Aluno {


    private String nome;
    private Cpf cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

    public Aluno(String nome, Cpf cpf, Email email){

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }


    public String getNome(){
        return this.nome;
    }

    public String getCpf(){

        return cpf.getNumero();
    }

    public String getEmail(){

        return this.email.getEndereco();
    }


    public List<Telefone> getTelefones(){

        return this.telefones;
    }
}
