package application;

public class MenuAcao {

	public int executarAcaoAdm(Adm adm, int opcaoAdm) {
		int resp = -1;
		switch (opcaoAdm) {
		case 1:
			resp = adm.trocarAdm();
			break;
		case 2:
			adm.cadastrarGerente();
			break;
		case 3:
			adm.demitirGerente();
			break;
		case 4:
			adm.exibirGerentes();
			break;
		case 5:
			adm.cadastrarPlano();
			break;
		case 6:
			adm.deletarPlano();
			break;
		case 7:
			adm.exibirPlanos();
			break;
		case 0:
			resp = 0;
			break;
		}
		return resp;
	}

	public void executarAcaoGerente(Gerente gerente, int opcaoGerente) {
		switch (opcaoGerente) {
		case 1:
			gerente.cadastrarAtendente(gerente.getCidade());
			break;
		case 2:
			gerente.demitirAtendente(gerente.getCidade());
			break;
		case 3:
			gerente.exibirAtendente(gerente.getCidade());
			break;
		case 4:
			gerente.cadastrarVendedor(gerente.getCidade());
			break;
		case 5:
			gerente.demitirVendedor(gerente.getCidade());
			break;
		case 6:
			gerente.exibirVendedor(gerente.getCidade());
			break;
		case 7:
			for (Vendedor v : BDados.getVendedores()) {
				if (v.getCidade().equals(gerente.getCidade())) {
					gerente.atribuirPlanoVendedor(v);
				}
			}
			break;
		case 8:
			for (Atendente a : BDados.getAtendentes()) {
				if (a.getCidade().equals(gerente.getCidade())) {
					gerente.pagarAtendente(a);
				}
			}
			break;
		case 9:
			for (Vendedor v : BDados.getVendedores()) {
				if (v.getCidade().equals(gerente.getCidade())) {
					gerente.pagarVendedor(v);
				}
			}
			break;
		case 0:
			break;
		}
	}

	public void executarAcaoVendedor(Vendedor vendedor, int opcaoVendedor) {
		switch (opcaoVendedor) {
		case 1:
			vendedor.venderPlano();
			break;
		case 2:
			vendedor.exibirListaDeClientesAtivos();
			break;
		}
	}

	public void executarAcaoAtendente(Atendente atendente, int opcaoAtendente) {
		switch (opcaoAtendente) {
		case 1:
			atendente.cadastrarCliente();
			break;
		case 2:
			atendente.exibirPossiveisClientes();
			break;
		case 3:
			atendente.cancelaPlano();
			break;
		case 4:
			atendente.exibirClientesInativos();
			break;
		}
	}
}
