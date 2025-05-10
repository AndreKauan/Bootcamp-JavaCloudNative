public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirInfosComuns() {
		System.out.println("=== Infos Conta Corrente ===");
		super.imprimirInfosComuns();
	}

    public void transferenciaPix(double valor, Conta contaDestino) {
		transferir(valor, contaDestino);
	}
}
