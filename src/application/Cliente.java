package application;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Cliente extends Pessoa {

	private String nSus;
	private String nCartaoCredito;
	private LocalDateTime dataHoraAquisicaoPlano;
	private Dependente dependente;
	private Plano planoCliente;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String endereco, String nTelefone, String email) {
		super(nome, cpf, endereco, nTelefone, email);
		this.nSus = null;
		this.nCartaoCredito = null;
		this.dataHoraAquisicaoPlano = null;
		this.dependente = null;
	}

	public Cliente(String nome, String cpf, String endereco, String nTelefone, String email, String nSus,
			String nCartaoCredito, LocalDateTime dataHoraAquisicaoPlano) {
		super(nome, cpf, endereco, nTelefone, email);
		this.nSus = nSus;
		this.nCartaoCredito = nCartaoCredito;
		this.dataHoraAquisicaoPlano = dataHoraAquisicaoPlano;
		this.dependente = null;
	}

	public void comprarPlano(Plano p) {
		Scanner sc = new Scanner(System.in);
		boolean temAtributo = true;
		String cpfD = "";
		String nTelefoneD = "";
		String emailD = "";

		System.out.println("Pronto, para podermos continuar com a compra, vamos pedir alguns dados:");
		System.out.print("Informe o seu Numero do SUS: ");
		// String nSUS = sc.nextLine();
		System.out.print("Informe o seu Numero do cartão: ");
		this.nCartaoCredito = sc.nextLine();
		System.out.println("O nosso Plano aceita você incluir dependente(s) que tenha menos de 18 anos: ");
		System.out.print("Você tem algum Dependente para incluir? [S/N]");
		char respDependente = sc.next().toUpperCase().charAt(0);
		if (respDependente == 'S') {
			System.out.println("Otimo! Vamos cadastrar os dados do seu dependente: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			while (temAtributo == true) {
				int aux = 0;
				System.out.print("CPF: ");
				cpfD = sc.nextLine();
				for (Dependente dependentes : BDados.getDependentes()) {
					if (dependentes.getCpf().equals(cpfD)) {
						System.out.println("ERROR! Ja tem um dependente cadastrado com esse CPF");
						System.out.println("Tente novamente!!!");
						aux++;
						break;
					} else {
						temAtributo = false;
					}
					aux++;
				}
				if (aux == 0) {
					temAtributo = false;
				}
			}

			temAtributo = true;
			System.out.print("Endereço: ");
			String endereco = sc.nextLine();

			while (temAtributo == true) {
				int aux = 0;
				System.out.print("Numero de telefone: ");
				nTelefoneD = sc.nextLine();
				for (Dependente dependentes : BDados.getDependentes()) {
					if (dependentes.getnTelefone().equals(nTelefoneD)) {
						System.out.println("ERROR! Ja tem um dependente cadastrado com esse Nº de telefone");
						System.out.println("Tente novamente!!!");
						aux++;
						break;
					} else {
						temAtributo = false;
					}
					aux++;
				}
				if (aux == 0) {
					temAtributo = false;
				}
			}

			temAtributo = true;
			while (temAtributo == true) {
				int aux = 0;
				System.out.print("Email: ");
				emailD = sc.nextLine();
				for (Dependente dependentes : BDados.getDependentes()) {
					if (dependentes.getEmail().equals(emailD)) {
						System.out.println("ERROR! Ja tem um dependente cadastrado com esse email");
						System.out.println("Tente novamente!!!");
						aux++;
						break;
					} else {
						temAtributo = false;
					}
					aux++;
				}
				if (aux == 0) {
					temAtributo = false;
				}
			}
			this.dependente = new Dependente(nome, cpfD, endereco, nTelefoneD, emailD);
			BDados.getDependentes().add(dependente);
		}
		this.dataHoraAquisicaoPlano = LocalDateTime.now();
		this.planoCliente = p;
		System.out.println("Plano adquirido com sucesso!!!");
		sc.close();
	}

	public void cancelaPlano() {

	}

	public void exibePlano() {

	}

	public void marcarConsulta() {

	}

	public void setnSus(String nSus) {
		this.nSus = nSus;
	}

	public void setnCartaoCredito(String nCartaoCredito) {
		this.nCartaoCredito = nCartaoCredito;
	}

	public void setDataHoraAquisicaoPlano(LocalDateTime dataHoraAquisicaoPlano) {
		this.dataHoraAquisicaoPlano = dataHoraAquisicaoPlano;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	public void setPlanoCliente(Plano planoCliente) {
		this.planoCliente = planoCliente;
	}

	public String getnSus() {
		return nSus;
	}

	public String getnCartaoCredito() {
		return nCartaoCredito;
	}

	public LocalDateTime getDataHoraAquisicaoPlano() {
		return dataHoraAquisicaoPlano;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public Plano getPlanoCliente() {
		return planoCliente;
	}

	@Override
	public String toString() {
		if (nSus != null && nCartaoCredito != null && dataHoraAquisicaoPlano != null) {
			return "Nome: " + this.getNome() + " - CPF: " + this.getCpf() + " - Endereço: " + this.getEndereco()
					+ " - Numero de telefone: " + this.getnTelefone() + " - Email: " + this.getEmail()
					+ " - Numero do SUS: " + this.nSus + " - Data e hora de aquisicao do Plano: "
					+ this.dataHoraAquisicaoPlano + " - Plano do cliente: " + this.planoCliente;
		} else {
			return "Nome: " + this.getNome() + " - CPF: " + this.getCpf() + " - Endereço: " + this.getEndereco()
					+ " - Numero de telefone: " + this.getnTelefone() + " - Email: " + this.getEmail();
		}
	}
}
