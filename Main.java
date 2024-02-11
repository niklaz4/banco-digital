public class Main {
    
    public static void main(String[] args){
        Cliente nicollas = new Cliente();
        nicollas.setNome("Nicollas");

        Conta cc = new ContaCorrente(nicollas);
        Conta poupanca = new ContaPoupanca(nicollas);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

