import java.util.List;

public class Banco {

    private String instituicao;
	private List<Conta> contas;

	public String getInstituicao() {
		return instituicao;
	}

	public void setinstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public void listarContas(){
        if (!contas.isEmpty()){
            for (Conta c : contas){
                System.out.println("=== Lista de Contas ===");
                c.imprimirInfosComuns();
            }
        }else {
            System.out.println("Não há contas!");
        }
    }

}
