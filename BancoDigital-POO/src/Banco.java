import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String instituicao;
	private List<Conta> contas = new ArrayList<>();

	public String getInstituicao() {
		return instituicao;
	}

	public void setinstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setConta(Conta conta) {
		contas.add(conta);
	}

    public void listarContas(){
        if (contas == null || contas.isEmpty()){
            System.out.println("Não há contas!");
        }else {
            System.out.println("=== Lista de Contas ===");
            for (Conta c : contas){
                c.imprimirInfosComuns();
                System.out.println("-------------------------");
            }
        }
    }

}
