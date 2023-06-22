package maisoumenossaude;

import cidades.Enum.Cidades;
import java.time.LocalDate;
import java.util.Scanner;
//import java.util.ArrayList;

public class Atendente extends Funcionario {

    private int totCancelamento;
    private Credenciais credenciaisAtendente;
    private Cidades cidade;

    public Atendente() {
    }

    public Atendente(String nome, String cpf, String endereco, String nTelefone,
            String email, String nCtps, double salario, LocalDate dataContratacao,
            double comissaoFixa, Credenciais credenciaisAtendente) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario,
                dataContratacao, comissaoFixa);
        this.credenciaisAtendente = credenciaisAtendente;
    }

    /*Recebe um Cliente como parametro e add em um ArrayList do tipo Cliente 
    chamado possiveisClientes que tem na classe BDados.
     */
    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Numero de telefone: ");
        String nTelefone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        Cliente cliente = new Cliente(nome, cpf, endereco, nTelefone, email);
        BDados.getPossiveisClientes().add(cliente);
    }

    public void exibirClientes() {
        System.out.println("Lista de clientes: ");
        for (Cliente clientesPossiveis : BDados.getPossiveisClientes()) {
            System.out.println(clientesPossiveis);
        }
    }

    public void cancelaPlano() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o CPF do cliente para cancelar o plano:");
        String cpfCliente = sc.nextLine().toUpperCase();

        for (Cliente c : BDados.getClientesAtivos()) {
            if (cpfCliente.equals(c.getCpf().toUpperCase())) {
                BDados.getClientesInativos().add(c);
                BDados.getClientesAtivos().remove(c);
                this.totCancelamento++;
            }
        }
    }

    public double calculaSalario() {
        return 0;
    }

    public int getTotCancelamento() {
        return totCancelamento;
    }

    public Credenciais getCredenciaisAtendente() {
        return credenciaisAtendente;
    }

    public void setCidade(Cidades cidade) {
        this.cidade = cidade;
    }

    public Cidades getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome()
                + " - CPF: " + this.getCpf()
                + " - Numero de telefone: " + this.getnTelefone()
                + " - Email: " + this.getEmail()
                + " - Endereço: " + this.getEndereco()
                + " - Numero da carteira de trabalho: " + this.getnCtps()
                + " - Salario: " + this.getSalario()
                + " - Data de contratação: (" + this.getDataContratacao() + ")"
                + " - Comissao Fixa: " + this.getComissaoFixa()
                + " - Esse atentende trabalha na cidade " + this.cidade;
    }
}
