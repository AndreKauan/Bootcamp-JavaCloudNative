public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

    
	public void imprimirInfosComuns() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}
