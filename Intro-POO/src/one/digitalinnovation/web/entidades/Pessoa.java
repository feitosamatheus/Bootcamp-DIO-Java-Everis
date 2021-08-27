package one.digitalinnovation.web.entidades;

public class Pessoa {
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {  // Polimorfismo
        if (documento == null || documento.isEmpty()) { //isEmpty verfica se o valor é vazio.
            throw new RuntimeException("Documento não pode ser null ou vazio. ");
        }
        if (documento.length() == TAMANHO_CPF) {
            setDocumento(documento, tipo = TipoPessoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");
        }

    }

    private void setDocumento(String documento, TipoPessoa tipo) { //Polimorfismo
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
}
