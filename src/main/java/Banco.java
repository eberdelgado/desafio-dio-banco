import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas=new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void imprimirContas(){
        Conta auxConta;
        System.out.println("=====================================");
        for(int i=0; i < contas.size();i++) {
            auxConta = contas.get(i);
            auxConta.Extrato();
        }
        System.out.println("=====================================");
    }
}
