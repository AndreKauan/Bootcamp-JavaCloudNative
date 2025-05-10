public class App {
    public static void main(String[] args) throws Exception {
        Cliente andre = new Cliente();
		andre.setNome("Andre Antonelli ");
		
		Conta cc = new ContaCorrente(andre);
		Conta cp = new ContaPoupanca(andre);

		cc.depositar(100);
		cc.transferir(100, cp);
		
        cc.imprimirInfosComuns();
        cp.imprimirInfosComuns();
    }
}
