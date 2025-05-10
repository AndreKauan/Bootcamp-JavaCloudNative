import java.util.List;

public class Banco {

    private String instituicao;
	private List<Conta> contas;

	public String getInstituicao() {
		return instituicao;
	}

	public void setNome(String instituicao) {
		this.instituicao = instituicao;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
