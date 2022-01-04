import java.util.ArrayList;
import java.util.List;

public class Cliente {
    protected String nome;
    protected List<Endereco> enderecos= new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco endereco) {
        this.enderecos.add(endereco);
    }
}
