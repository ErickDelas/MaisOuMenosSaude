/*
Temos a nossa classe menu que é meio onde inicializamos todos os atributos dos 
objetos que queremos cadastrar.
 */
package maisoumenossaude;

public class Menu {

    public static void exibeMenuInicial() {
        System.out.println("\nSeja Bem-Vindo ao Mais Ou Menos Saúde.");
        System.out.println("[1] Fazer Login; ");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
    }

    public static void msgFinal() {
        System.out.println("--------------------------------------");
        System.out.println("Sua sessão foi finalizada!!! Até mais.");
        System.out.println("--------------------------------------");
    }

    public static void acoesAdm(Adm adm) {
        System.out.println("\nO que deseja fazer " + adm.getNomeAdm() + " : ");
        System.out.println("[1] Trocar usuario e senha do Administrador;");
        System.out.println("[2] Cadastrar Gerente;");
        System.out.println("[3] Demitir Gerente;");
        System.out.println("[4] Exibir lista de gerentes;");
        System.out.println("[5] Cadastrar Planos;");
        System.out.println("[6] Deletar Plano de Saúde;");
        System.out.println("[7] Exibir lista de Planos;");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
        //System.out.println("[11] Alterar Valores que os Funcionários recebem;");
    }

    public static void acoesGerente(Gerente gerente) {
        System.out.println("\nO que deseja fazer " + gerente.getNome() + " : ");
        System.out.println("[1] Contratar Atendente;");
        System.out.println("[2] Demitir Atendente;");
        System.out.println("[3] Exibir lista de Atendentes;");
        System.out.println("[4] Contratar Vendedor;");
        System.out.println("[5] Demitir Vendedor;");
        System.out.println("[6] Exibir lista de Vendedores;");
        System.out.println("[7] Atribuir um plano para um vendedor;");
        System.out.println("[8] Pagar Atendente;");
        System.out.println("[9] Pagar Vendedor");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");

    }

    public static void acoesVendedor(Vendedor vendedor) {
        System.out.println("\nO que deseja fazer " + vendedor.getNome() + " : ");
        System.out.println("[1] Vender plano;");
        System.out.println("[2] Exibir lista de Clientes Ativos");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
    }

    public static void acoesAtendente(Atendente atendente) {
        System.out.println("\nO que deseja fazer " + atendente.getNome() + " : ");
        System.out.println("[1] Cadastrar Possiveis Clientes;");
        System.out.println("[2] Exibir lista de Possiveis Clientes;");
        System.out.println("[3] Cancelar um plano de um cliente;");
        System.out.println("[4] Exibir lista de Clientes inativos");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
    }
}
