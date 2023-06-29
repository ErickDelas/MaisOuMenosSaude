package application;

public class Especialidades {

	private String nome;
	private Double porcentagemDesconto;

	public Especialidades() {
	}

	public Especialidades(String nome, Double porcentagemDesconto) {
		this.nome = nome;
		this.porcentagemDesconto = porcentagemDesconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

	public void setPorcentagemDesconto(Double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}

	@Override
	public String toString() {
		return " nome: " + nome + " - porcentagem de Desconto: " + porcentagemDesconto;
	}
}
