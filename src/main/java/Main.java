import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Endereco endereco= new Endereco("Parana","Ponta Fina", "Cascavel","Rua São Caetano",7070);
       Cliente lucas = new PessoaFisica("Lucas Santos","12345678906",endereco);

       Conta cc = new ContaCorrente(lucas);
       ContaCorrente cc2 = new ContaCorrente(lucas);
       ContaPoupanca poupanca = new ContaPoupanca(lucas);

       List<Conta> contas = new ArrayList<>();

       contas.add(cc);
       contas.add(cc2);
       contas.add(poupanca);

       Banco Nubank = new Banco();


       Nubank.addConta(cc);
       Nubank.addConta(cc2);
       Nubank.addConta(poupanca);

       Nubank.getContas().get(1).depositar(235);
       Nubank.getContas().get(0).depositar(122);
       Nubank.getContas().get(2).depositar(459);
       Nubank.imprimirContas();
       Nubank.getContas().get(2).transferir(Nubank.getContas().get(1), 35);

       Nubank.imprimirContas();
    }

}
