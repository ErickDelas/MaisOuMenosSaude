package application;

import cidades.Cidades;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor extends Funcionario {

	private int totVendasMes;
	private Credenciais credenciaisVendedor;
	private Cidades cidade;
	private List<Plano> listaPlanoVendedorTem = new ArrayList<>();

	public Vendedor() {

	}

	public Vendedor(String nome, String cpf, String endereco, String nTelefone, String email, String nCtps,
			double salario, LocalDate dataContratacao, double comissaoFixa, Credenciais credenciaisVendedor) {
		super(nome, cpf, endereco, nTelefone, email, nCtps, salario, dataContratacao, comissaoFixa);
		this.totVendasMes = 0;
		this.credenciaisVendedor = credenciaisVendedor;
		this.listaPlanoVendedorTem.add(0, null);
	}

	public void venderPlano() {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		if (listaPlanoVendedorTem.get(0) != null) {

			System.out.println("Escolha um cliente abaixo para vender um plano para ele:");
			for (Cliente c : BDados.getPossiveisClientes()) {
				System.out.print(" - " + c.getNome() + " - ");
			}

			String nomeCliente = sc.nextLine().toUpperCase();

			for (Cliente c : BDados.getPossiveisClientes()) {
				if (c.getNome().toUpperCase().equals(nomeCliente)) {
					cliente = c;
				}
			}

			System.out.println("Escolha um plano para vender ao cliente " + cliente.getNome());
			for (Plano p : this.listaPlanoVendedorTem) {
				System.out.print(" - " + p.getNomePlano() + " - ");
			}

			String nomePlano = sc.nextLine();

			for (Plano p : this.listaPlanoVendedorTem) {
				if (p.getNomePlano().equals(nomePlano)) {
					System.out.print(
							"Foi vendido o plano " + p.getNomePlano() + " para o cliente " + cliente.getNome() + "?");
					String resp = sc.next().toUpperCase();
					if (resp.equals("SIM")) {
						cliente.comprarPlano(p);
						BDados.getClientesAtivos().add(cliente);
						BDados.getPossiveisClientes().remove(cliente);
						this.totVendasMes++;
					}
				}
			}
		} else {
			System.out.println("Você não tem nenhum Plano para vender!");
		}
		sc.close();
	}

	public void exibirListaDeClientesAtivos() {

		boolean temCliente = false;
		System.out.println("Lista de clientes ativos: ");
		for (Cliente c : BDados.getClientesAtivos()) {
			System.out.println(c);
			temCliente = true;
		}

		if (temCliente == false) {
			System.out.println("Não tem nenhum cliente ativo!!!");
		}
	}

	public void setListaPlanoVendedorTem(List<Plano> listaPlanoVendedorTem) {
		this.listaPlanoVendedorTem = listaPlanoVendedorTem;
	}

	public int getTotVendasMes() {
		return totVendasMes;
	}

	public List<Plano> getListaPlanoVendedorTem() {
		return listaPlanoVendedorTem;
	}

	public Credenciais getCredenciaisVendedor() {
		return credenciaisVendedor;
	}

	public void setCidade(Cidades cidade) {
		this.cidade = cidade;
	}

	public Cidades getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " - CPF: " + this.getCpf() + " - Numero de telefone: " + this.getnTelefone()
				+ " - Email: " + this.getEmail() + " - Endereço: " + this.getEndereco()
				+ " - Numero da carteira de trabalho: " + this.getnCtps() + " - Salario: " + this.getSalario()
				+ " - Data de contratação: (" + this.getDataContratacao() + ")" + " - Comissao Fixa: "
				+ this.getComissaoFixa() + " - Esse vendedor trabalha na cidade " + this.cidade;
	}
}
