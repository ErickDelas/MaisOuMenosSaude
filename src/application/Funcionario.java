package application;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

	private String nCtps;
	private double salario;
	private LocalDate dataContratacao;
	private double ultimoContraCheque;
	private double comissaoFixa;

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, String endereco, String nTelefone, String email, String nCtps,
			double salario, LocalDate dataContratacao, double comissaoFixa) {
		super(nome, cpf, endereco, nTelefone, email);
		this.nCtps = nCtps;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
		this.comissaoFixa = comissaoFixa;
		this.ultimoContraCheque = 0;
	}

	public double calculaBonificacao() {
		return 0;
	}

	public void recebeBonificacao() {

	}

	public String getnCtps() {
		return nCtps;
	}

	public void setnCtps(String nCtps) {
		this.nCtps = nCtps;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getUltimoContraCheque() {
		return ultimoContraCheque;
	}

	public void setUltimoContraCheque(double ultimoContraCheque) {
		this.ultimoContraCheque = ultimoContraCheque;
	}

	public double getComissaoFixa() {
		return comissaoFixa;
	}

	public void setComissaoFixa(double comissaoFixa) {
		this.comissaoFixa = comissaoFixa;
	}

	@Override
	public String toString() {
		super.toString();
		return "Salario: " + this.salario + "\nnCTPS: " + this.nCtps + "\nData de contratação: (" + this.dataContratacao
				+ ")" + "\nComissão Fixa: " + this.comissaoFixa;
	}
}
