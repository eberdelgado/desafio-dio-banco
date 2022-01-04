



public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String cpf, Endereco endereco) {
        this.cpf = cpf;
        super.nome = nome;
        super.enderecos.add(endereco);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
