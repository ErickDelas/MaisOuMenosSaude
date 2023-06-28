package application;

import cidades.Cidades;
import java.time.LocalDate;
import java.util.Scanner;

public class Adm {
	private String nomeAdm = "Antonio";
	private Credenciais credenciaisAdm;
	private String segurançaLogin = "opalmeirasnaotemmundial";

	public Adm() {
		this.credenciaisAdm = new Credenciais();
	}

	public Adm(Credenciais credenciaisAdm) {
		this.credenciaisAdm = credenciaisAdm;
	}

	public void cadastrarGerente() {
		Scanner sc = new Scanner(System.in);
		boolean temAtributo = true;
		String cpf = "";
		String usuario = "";
		String senha = "";
		String nTelefone = "";
		String email = "";
		String nCtps = "";

		System.out.print("Nome: ");
		String nome = sc.nextLine();
		while (temAtributo == true) {
			int aux = 0;
			System.out.print("CPF: ");
			cpf = sc.nextLine();
			for (Gerente gerentes : BDados.getGerentes()) {
				if (gerentes.getCpf().equals(cpf)) {
					System.out.println("ERROR! Ja tem um gerente cadastrado com esse CPF");
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
			nTelefone = sc.nextLine();
			for (Gerente gerentes : BDados.getGerentes()) {
				if (gerentes.getnTelefone().equals(nTelefone)) {
					System.out.println("ERROR! Ja tem um gerente cadastrado com esse Numero de telefone");
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
			email = sc.nextLine();
			for (Gerente gerentes : BDados.getGerentes()) {
				if (gerentes.getEmail().equals(email)) {
					System.out.println("ERROR! Ja tem um gerente cadastrado com esse email");
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
			System.out.print("Numero da carteira de trabalho: ");
			nCtps = sc.nextLine();
			for (Gerente gerentes : BDados.getGerentes()) {
				if (gerentes.getnCtps().equals(nCtps)) {
					System.out.println("ERROR! Ja tem um gerente cadastrado com esse Nº de carteira de trabalho");
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
		System.out.print("Salario: ");
		double salario = sc.nextDouble();
		System.out.print("Comissao Fixa: ");
		double comissaoF = sc.nextDouble();
		sc.nextLine();
		System.out.println("Agora, informe um usuario e senha para acessar o sistema.");
		while (temAtributo == true) {
			int aux = 0;
			System.out.print("Usuario: ");
			usuario = sc.nextLine();
			System.out.print("Senha: ");
			senha = sc.nextLine();
			for (Gerente gerentes : BDados.getGerentes()) {
				if (gerentes.getCredenciaisGerente().getUsuario().equals(usuario)) {
					System.out.println("ERROR! Ja tem um gerente cadastrado com esse Usuario");
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
		Gerente gerente = new Gerente(nome, cpf, endereco, nTelefone, email, nCtps, salario, LocalDate.now(), comissaoF,
				new Credenciais(usuario, senha));
		System.out.print("Agora, Informe qual cidade esse gerente irá trabalhar: ");
		String nomeCidade = sc.nextLine().toUpperCase();
		gerente.setCidade(Cidades.valueOf(nomeCidade));
		BDados.getGerentes().add(gerente);
		sc.close();
	}

	public void cadastrarPlano() {
		Scanner sc = new Scanner(System.in);
		boolean temAtributo = true;
		String nomePlano = "";
		char resp = 'S';

		while (temAtributo == true) {
			int aux = 0;
			System.out.print("Nome do plano: ");
			nomePlano = sc.nextLine();
			for (Plano p : BDados.getPlanos()) {
				if (nomePlano.equals(p.getNomePlano())) {
					System.out.println("ERROR!!! Já tem um plano com esse nome");
					System.out.println("Tente Novamente!!!");
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

		System.out.print("Valor do plano: ");
		Double valorPlano = sc.nextDouble();
		Plano plano = new Plano(nomePlano, valorPlano);
		System.out.println("Vamos cadastrar uma(s) especialidade(s) para esse plano: ");
		do {
			System.out.print("Nome da especialidade: ");
			sc.nextLine();
			String nomeEP = sc.nextLine();
			System.out.print("Quantos (%) de desconto: ");
			Double porcentagem = sc.nextDouble();
			plano.getEspecialidadesPlanos().add(new Especialidades(nomeEP, porcentagem));
			System.out.print("Tem mais especialidades para esse plano? [S/N]");
			resp = sc.next().charAt(0);
		} while (resp == 'S');
		System.out.println("\nVamos cadastrar clinica(s) que aceita esse plano:");
		do {
			int i = 0;
			i++;
			System.out.print("Informe a " + i + "º clinica: ");
			sc.nextLine();
			String nomeClinica = sc.nextLine();
			plano.getNomesClinicas().add(new NomesClinicas(nomeClinica));
			System.out.print("Tem mais Clinicas para esse plano? [S/N]");
			resp = sc.next().charAt(0);
		} while (resp == 'S');
		BDados.getPlanos().add(plano);
		sc.close();
	}

	public void demitirGerente() {
		Scanner sc = new Scanner(System.in);
		boolean temGerente = false;
		System.out.print("Informe o CPF do gerente que você quer demitir: ");
		String cpfD = sc.next().toUpperCase();

		for (Gerente gerentes : BDados.getGerentes()) {
			if (cpfD.equals(gerentes.getCpf().toUpperCase())) {
				System.out.println("O gerente " + gerentes.getNome() + " foi removido com sucesso!!!");
				BDados.getGerentes().remove(gerentes);
				temGerente = true;
				break;
			}
		}
		if (temGerente == false) {
			System.out.println("Não tem nenhum gerente com o CPF " + cpfD + " na nossa empresa!");
		}
		sc.close();
	}

	public void deletarPlano() {
		Scanner sc = new Scanner(System.in);
		boolean temPlanoNome = false;
		System.out.print("Informe o nome do plano que você quer deletar: ");
		String nomeP = sc.nextLine().toUpperCase();

		for (Plano planos : BDados.getPlanos()) {
			if (nomeP.equals(planos.getNomePlano().toUpperCase())) {
				BDados.getPlanos().remove(planos);
				System.out.println("O plano " + planos.getNomePlano() + " foi deletado com sucesso!!!");
				temPlanoNome = true;
				break;
			}
		}

		if (temPlanoNome == false) {
			System.out.println("Não tem nenhum plano com o nome " + nomeP + " na nossa empresa!");
		}
		sc.close();
	}

	public void exibirGerentes() {
		boolean temGerente = false;
		System.out.println("\nLista de Gerentes: ");
		for (Gerente gerente : BDados.getGerentes()) {
			System.out.println(gerente);
			temGerente = true;
		}

		if (temGerente == false) {
			System.out.println("Não tem nenhum gerente cadastrado!!!");
		}
	}

	public void exibirPlanos() {
		boolean temPlano = false;
		System.out.println("\nLista de planos: ");
		for (Plano planos : BDados.getPlanos()) {
			System.out.println(planos);
			temPlano = true;
		}

		if (temPlano == false) {
			System.out.println("Não tem nenhum plano cadastrado!!!");
		}
	}

	public int trocarAdm() { // Feito
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a frase de segurança: (opal*****************ial) ");
		String resp = sc.nextLine();
		if (resp.equals(this.segurançaLogin)) {
			System.out.println("Otimo! Você pode trocar os dados de login.");
			System.out.print("Usuario: ");
			String usuario = sc.nextLine();
			System.out.print("Senha: ");
			String senha = sc.nextLine();
			this.getCredenciaisAdm().setUsuario(usuario);
			this.getCredenciaisAdm().setSenha(senha);
			return 0;
		} else {
			return -1;
		}
	}

	public Credenciais getCredenciaisAdm() {
		return credenciaisAdm;
	}

	public String getNomeAdm() {
		return nomeAdm;
	}

	@Override
	public String toString() {
		return "Dados do Adm: \n" + "\nNome de Adm: " + this.nomeAdm + "\nUsuario: " + this.credenciaisAdm.getUsuario()
				+ "\nSenha: " + this.credenciaisAdm.getSenha();
	}
}
