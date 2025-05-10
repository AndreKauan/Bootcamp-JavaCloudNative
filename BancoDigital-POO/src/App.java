public class App {
    public static void main(String[] args) throws Exception {
        Cliente andre = new Cliente();
		andre.setNome("Andre Antonelli ");

        Banco bradesco = new Banco();
        bradesco.setinstituicao("Bradesco");

        bradesco.listarContas();
		
		ContaCorrente cc = new ContaCorrente(andre, bradesco);
		Conta cp = new ContaPoupanca(andre, bradesco);

        bradesco.listarContas();

		cc.depositar(100);
		cc.transferenciaPix(10, cp);
        //cc.depositar(50);
        //cc.transferenciaPix(10, cp);
		
        cc.imprimirInfosComuns();
        cp.imprimirInfosComuns();
    }
}
