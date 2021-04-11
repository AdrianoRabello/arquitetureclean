package br.com.alura.cleanarcteture.dominio.aluno;

import lombok.Getter;

/**
 * @autor adriano rabello 11/04/2021 9:52 AM
 **/

@Getter
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero){

        if((ddd == null || ddd.length() <= 1) || (numero == null || numero.length() < 8) ){

            throw new IllegalArgumentException("O telfedone de possuir 99 99999999");
        }

        this.ddd = ddd;
        this.numero = numero;

    }
}
