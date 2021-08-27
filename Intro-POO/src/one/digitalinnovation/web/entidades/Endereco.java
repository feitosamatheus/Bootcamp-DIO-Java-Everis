package one.digitalinnovation.web.entidades;

public class Endereco {
    public enum TipoEndereco {
        RESIDENCIAL,
        ENTREGA,
        TRABALHO
    }

    public String endereco;
    public String numero;
    public String complemento;
    public String cidade;
    public String bairro;
    public String estado;
    public String cep;
    public TipoEndereco tipo;


    @Override
    public String toString() {
        return "Endereco = " +
                "Rua = " + endereco +
                " | numero='" + numero + '\'' +
                " | complemento='" + complemento + '\'' +
                " | cidade='" + cidade + '\'' +
                " | bairro='" + bairro + '\'' +
                " | estado='" + estado + '\'' +
                " | cep='" + cep + '\'' +
                " |tipo=" + tipo +
                " |";
    }
}
