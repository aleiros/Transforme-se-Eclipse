package posto.src.pessoas.copy.copy;

public class Funcionario {
	
	public String nome;
	public static String enderecoPosto = "Av. São Paulo";
	public String enderecoFuncionario;
	
	double saldoConta;
	
	void trabalhar(Bonus bonus) {
		saldoConta += bonus.valorDoTrabalho; 
	}
}
