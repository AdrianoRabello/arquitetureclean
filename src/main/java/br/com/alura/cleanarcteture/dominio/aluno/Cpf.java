package br.com.alura.cleanarcteture.dominio.aluno;

import lombok.Getter;

/**
 * @autor adriano rabello 11/04/2021 9:32 AM
 **/

@Getter
public class Cpf {

    private String numero;


    public Cpf(String numero){

        if(numero == null || !numero.matches("/(^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$)|(^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$)/")){

            throw new IllegalArgumentException("CPF inválido ");
        }

        this.numero = numero;

    }
}
