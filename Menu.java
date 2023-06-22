/*
Temos a nossa classe menu que é meio onde inicializamos todos os atributos dos 
objetos que queremos cadastrar.
 */
package maisoumenossaude;

public class Menu {

    public static void exibeMenuInicial() {
        System.out.println("\nSeja Bem-Vindo ao Mais Ou Menos Saúde.");
        System.out.println("[1] Fazer Login; ");
        System.out.println("[2] Mostrar Lista de Funcionarios na empresa; ");
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
        System.out.println("[3] Exibir lista de gerentes;");
        System.out.println("[4] Cadastrar Planos;");
        System.out.println("[5] Exibir lista de Planos;");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
    }

    public static void acoesGerente(Gerente gerente) {
        System.out.println("\nO que deseja fazer " + gerente.getNome() + " : ");
        System.out.println("[1] Cadastrar Atendente;");
        System.out.println("[2] Exibir lista de Atendentes;");
        System.out.println("[3] Cadastrar Vendedor;");
        System.out.println("[4] Exibir lista de Vendedores;");
        System.out.println("[5] Atribuir um plano para um vendedor;");
        System.out.println("[6] Pagar Atendente;");
        System.out.println("[7] Pagar Vendedor");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
    }

    public static void acoesVendedor(Vendedor vendedor) {
        System.out.println("\nO que deseja fazer " + vendedor.getNome() + " : ");
        System.out.println("[1] Vender plano;");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
    }

    public static void acoesAtendente(Atendente atendente) {
        System.out.println("\nO que deseja fazer " + atendente.getNome() + " : ");
        System.out.println("[1] Cadastrar Clientes;");
        System.out.println("[2] Exibir lista de Clientes;");
        System.out.println("[3] Cancelar um plano de um cliente;");
        System.out.println("[0] Sair;");
        System.out.print("Resposta: ");
    }

}
