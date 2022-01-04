import java.util.ArrayList;

public class PessoaJuritica extends Cliente{
    private String cnpj;

    public PessoaJuritica(String nome, String cnpj, Endereco endereco) {
        this.cnpj = cnpj;
        super.nome = nome;
        super.enderecos.add(endereco);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
