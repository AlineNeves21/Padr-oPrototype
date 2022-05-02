import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GatoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Gato gato = new Gato(123, "Baldur", new Dono("Aline Neves", new Endereco("Juiz de fora", "Rua A", 1)), "sem raça definida", "preto e branco");

        Gato gatoClone = gato.clone();
        gatoClone.setCod(456);
        gatoClone.setNome("Osíris");
        gatoClone.setCor("laranja");
        gatoClone.getDono().getEndereco().setNumero(2);

        assertEquals("Gato{código=123, nome='Baldur', dono=Dono{nome='Aline Neves', endereço=Endereco{cidade='Juiz de fora', logradouro='Rua A', número=1}}, raça='sem raça definida', cor='preto e branco'}", gato.toString());
        assertEquals("Gato{código=456, nome='Osíris', dono=Dono{nome='Aline Neves', endereço=Endereco{cidade='Juiz de fora', logradouro='Rua A', número=2}}, raça='sem raça definida', cor='laranja'}", gatoClone.toString());
    }
}
