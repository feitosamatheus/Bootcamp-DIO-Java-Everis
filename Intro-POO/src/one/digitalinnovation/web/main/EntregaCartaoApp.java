package one.digitalinnovation.web.main;

import one.digitalinnovation.web.entidades.Cliente;
import one.digitalinnovation.web.entidades.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(); // Instanciando classe
        endereco.estado = "Pernambuco";
        endereco.cidade = "Recife";
        endereco.bairro = "Boa viagem";
        endereco.endereco = "Rua Dom pedro";
        endereco.numero = "123";
        endereco.cep = "000000000";
        endereco.complemento = "Casa";
        endereco.tipo = Endereco.TipoEndereco.valueOf("RESIDENCIAL");

        Cliente cliente = new Cliente(); // Instanciando classe
        cliente.nome = "Matheus";
        cliente.codigo = 123456;
        cliente.numCartao = "1234-5678-9101-1121";
        cliente.setDocumento("12345678910");


        try {  // Tratamento de exerção
            cliente.adicionaEndereco(endereco);
            System.out.println(endereco);
            System.out.println("Endereco cadastrado com sucesso!!\n");
        } catch (Exception e) {
            System.out.println("Houve um [ERRO] a adicionar o endereço: " + e.getMessage());
        }

        try {  // Tratamento de exerção
            System.out.println(cliente);
            System.out.println("Cliente cadastrado com sucesso!!");
        } catch (Exception e) {
            System.out.println("Houve um [ERRO] a adicionar o cliente: " + e.getMessage());
        }


    }
}
