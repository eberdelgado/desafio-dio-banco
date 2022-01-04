


public class ContaCorrente extends Conta{

    protected static final int AGENCIA_PADRAO = 1;


    public ContaCorrente(Cliente cliente){
        super.agencia = AGENCIA_PADRAO;
        super.numero = super.SEQUNCIAL++;
        super.cliente = cliente;
    }

    public void Extrato(){
        System.out.println("======= EXTRATO CONTA CORRENTE=======");
        atributosPrint();
    }
}
