package br.com.alura.cleanarcteture.dominio.indicacao;

import br.com.alura.cleanarcteture.dominio.aluno.Aluno;

import java.time.LocalDate;

/**
 * @autor adriano rabello 11/04/2021 10:14 AM
 **/
public class Indicacao {


    private Aluno indicado;
    private Aluno indicante;
    private LocalDate dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante){

        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDate.now();
    }
}
