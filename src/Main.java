public class Main {
    public static void main(String[] args) {
        Cliente Alexsander = new Cliente();
        Alexsander.setNome("Alexsander");

        Conta cc = new ContaCorrente(Alexsander);
        Conta poupanca = new ContaPoupanca(Alexsander);

        cc.depositar(700);
        cc.imprimirExtrato();
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
