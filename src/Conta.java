public abstract class Conta implements IConta {
    private static final int NUMERO_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected Banco banco = new Banco();
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {

        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= this.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Nome do banco: %s", this.banco.getNome()));
        System.out.println(String.format("Número da Agência: %d", this.banco.getNumero()));
        System.out.println(String.format("Numero da conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
