package br.com.alura.cleanarcteture;

import br.com.alura.cleanarcteture.dominio.aluno.Email;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @autor adriano rabello 11/04/2021 9:39 AM
 **/

@SpringBootTest
class EmailTest {

    @Test
    void naoDeveriaCriarEmailInvalido(){

        assertThrows(IllegalArgumentException.class, () -> new Email("adriano"));

        assertThrows(IllegalArgumentException.class, () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new Email(""));
    }

    @Test
    void deveCriarUmEmail(){

        String email = "adrianor.rabello@hotmail.com";

        assertEquals(email, new Email(email).getEndereco());
    }
}