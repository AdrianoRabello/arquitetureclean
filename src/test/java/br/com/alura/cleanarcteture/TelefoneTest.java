package br.com.alura.cleanarcteture;

import br.com.alura.cleanarcteture.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @autor adriano rabello 11/04/2021 10:06 AM
 **/

@SpringBootTest
public class TelefoneTest {


    @Test
    void deveriaCriarTelefone(){
        Telefone telefone = new Telefone("27", "992757824");
        assertEquals(telefone,telefone);
    }

    @Test
    void naoDeveriaCriarTelefone(){
        assertThrows(IllegalArgumentException.class,() ->new Telefone("27", "9927578"));
    }
}
