


public abstract class Conta implements IConta{

    protected static int SEQUNCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }



    @Override
    public void sacar(double valor) {
        this.saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.saldo-=valor;
        contaDestino.depositar(valor);
    }

    protected void atributosPrint(){
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Cliente: " + cliente.getNome());
    }
}
