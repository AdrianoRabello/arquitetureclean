package br.com.alura.cleanarcteture;

import br.com.alura.cleanarcteture.dominio.aluno.Cpf;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @autor adriano rabello 11/04/2021 9:58 AM
 **/

@SpringBootTest
class CpfTest {


    @Test
    void deveriaCriarCpf(){

        assertThrows(IllegalArgumentException.class,()-> new Cpf("120.556.737-26"));
    }

    @Test
    void naoDeveriaCriarCpf(){

        assertThrows(IllegalArgumentException.class,()-> new Cpf("12055673726"));

    }
}