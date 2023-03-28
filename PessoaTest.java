package padroescriacaoteste_exercicios.prototype;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.prototype.Pessoa;
import padroescriacao_exercicios.prototype.Endereco;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Pessoa pessoa = new Pessoa(123, "Pessoa Original", new Endereco("Rua A", 1), "Analista de sistemas");

        Pessoa pessoaClone = pessoa.clone();
        pessoaClone.setCpf(456);
        pessoaClone.setNome("Pessoa Clonado");
        pessoaClone.getEndereco().setNumero(2);

        assertEquals("Pessoa{cpf=123, nome='Pessoa Original', endereco=Endereco{logradouro='Rua A', numero=1}, cargo='Analista de sistemas'}", pessoa.toString());
        assertEquals("Pessoa{cpf=456, nome='Pessoa Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, cargo='Analista de sistemas'}", pessoaClone.toString());
    }
}
