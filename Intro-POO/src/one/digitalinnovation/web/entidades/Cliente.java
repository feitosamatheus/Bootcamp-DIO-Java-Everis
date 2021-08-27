package one.digitalinnovation.web.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa { // Herança

    public String numCartao;
    private List<Endereco> enderecos; // Associação de classes

    public void adicionaEndereco(Endereco endereco) { // Validação
        if (endereco == null) {
            throw new NullPointerException("Endereço não pode ser null");
        }
        if (endereco.cep == null) {
            throw new NullPointerException("O CPF não pode ser null");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {  // encapsulamento
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    @Override
    public String toString() {
        return "Cliente = " + "numCartao= " + numCartao +
                " | codigo= " + codigo +
                " | nome= " + nome +
                " | tipo= " + tipo +
                " |";
    }
}

