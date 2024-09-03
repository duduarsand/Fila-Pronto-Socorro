
public class Paciente implements Comparable<Paciente> {
	private String nome;
	private int idade, prioridade;

	public Paciente(String nome, int prioridade, int idade) {
		this.nome = nome;
		this.prioridade = prioridade;
		this.idade = idade;
	}

	public Paciente() {
	}

	public int compareTo(Paciente p) {
		return p.prioridade > this.prioridade ? 1 : -1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		if (this.prioridade == 3) {
			return "Paciente [nome=" + nome + ", prioridade= Vermelho" + prioridade + ", idade=" + idade + "]";
		}
		if (this.prioridade == 2) {
			return "Paciente [nome=" + nome + ", prioridade= Amarelo" + prioridade + ", idade=" + idade + "]";
		}
		if (this.prioridade == 1) {
			return "Paciente [nome=" + nome + ", prioridade= Verde" + prioridade + ", idade=" + idade + "]";
		}
		return "Paciente [nome=" + nome + ", prioridade=" + prioridade + ", idade=" + idade + "]";
	}

}
