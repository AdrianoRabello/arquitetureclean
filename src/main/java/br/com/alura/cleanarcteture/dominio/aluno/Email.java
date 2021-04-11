package br.com.alura.cleanarcteture.dominio.aluno;

import lombok.Getter;

/**
 * @autor adriano rabello 11/04/2021 9:27 AM
 **/

@Getter
public class Email {

    private String endereco;


    public Email(String endereco){
        if(endereco ==  null || !endereco.matches("^[A-Za-z0-9+_.-]+@(.+)") ){

             throw new IllegalArgumentException("O endereço de Email não é valido ");
        }

        this.endereco = endereco;
    }
}
