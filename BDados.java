package application;

import java.util.ArrayList;
import java.util.List;

public class BDados {

	private static List<Adm> adm = new ArrayList<>();

	private static List<Funcionario> funcionarios = new ArrayList<>();

	private static List<Atendente> atendentes = new ArrayList<>();

	private static List<Gerente> gerentes = new ArrayList<>();

	private static List<Vendedor> vendedores = new ArrayList<>();

	private static List<Cliente> possiveisClientes = new ArrayList<>();
	private static List<Cliente> clientesAtivos = new ArrayList<>();
	private static List<Cliente> clientesInativos = new ArrayList<>();

	private static List<Dependente> dependentes = new ArrayList<>();

	private static List<Credenciais> credenciais = new ArrayList<>();

	private static List<Plano> planos = new ArrayList<>();

	public static List<Adm> getAdm() {
		return adm;
	}

	public static List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public static List<Atendente> getAtendentes() {
		return atendentes;
	}

	public static List<Gerente> getGerentes() {
		return gerentes;
	}

	public static List<Vendedor> getVendedores() {
		return vendedores;
	}

	public static List<Cliente> getPossiveisClientes() {
		return possiveisClientes;
	}

	public static List<Cliente> getClientesAtivos() {
		return clientesAtivos;
	}

	public static List<Cliente> getClientesInativos() {
		return clientesInativos;
	}

	public static List<Dependente> getDependentes() {
		return dependentes;
	}

	public static List<Credenciais> getCredenciais() {
		return credenciais;
	}

	public static List<Plano> getPlanos() {
		return planos;
	}
}
