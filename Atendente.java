package maisoumenossaude;

import cidades.Enum.Cidades;
import java.time.LocalDate;
import java.util.Scanner;

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

    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);
        boolean temAtributo = true;
        String cpf = "";
        String nTelefone = "";
        String email = "";

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        while (temAtributo == true) {
            int aux = 0;
            System.out.print("CPF: ");
            cpf = sc.nextLine();
            for (Cliente clientes : BDados.getPossiveisClientes()) {
                if (clientes.getCpf().equals(cpf)) {
                    System.out.println("ERROR! Ja tem um cliente cadastrado com esse CPF");
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
            for (Cliente clientes : BDados.getPossiveisClientes()) {
                if (clientes.getnTelefone().equals(nTelefone)) {
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
            for (Cliente clientes : BDados.getPossiveisClientes()) {
                if (clientes.getEmail().equals(email)) {
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
        Cliente cliente = new Cliente(nome, cpf, endereco, nTelefone, email);
        BDados.getPossiveisClientes().add(cliente);
    }

    public void exibirPossiveisClientes() {
        boolean temCliente = false;
        System.out.println("Lista de possiveis clientes: ");
        for (Cliente clientesPossiveis : BDados.getPossiveisClientes()) {
            System.out.println(clientesPossiveis);
            temCliente = true;
        }
        if (temCliente == false) {
            System.out.println("Não tem nenhum cliente cadastrado!!!");
        }
    }

    public void exibirClientesInativos() {
        boolean temCliente = false;
        System.out.println("Lista de clientes inativos: ");
        for (Cliente clientesInativos : BDados.getClientesInativos()) {
            System.out.println(clientesInativos);
            temCliente = true;
        }
        if (temCliente == false) {
            System.out.println("Não tem nenhum cliente inativo!!!");
        }
    }

    public void cancelaPlano() {
        Scanner sc = new Scanner(System.in);
        boolean temCliente = false;
        System.out.print("Informe o CPF do cliente para cancelar o plano:");
        String cpfCliente = sc.nextLine().toUpperCase();

        for (Cliente c : BDados.getClientesAtivos()) {
            if (cpfCliente.equals(c.getCpf().toUpperCase())) {
                c.setCpf(null);
                c.setEmail(null);
                c.setEndereco(null);
                c.setnTelefone(null);
                c.setDataHoraAquisicaoPlano(null);
                c.setDependente(null);
                c.setPlanoCliente(null);
                c.setnCartaoCredito(null);
                c.setnSus(null);
                BDados.getClientesInativos().add(c);
                BDados.getClientesAtivos().remove(c);
                this.totCancelamento++;
                System.out.println("O plano do cliente " + c.getNome() + " foi removido com sucesso!!!");
                temCliente = true;
                break;
            }
        }
        if (temCliente == false) {
            System.out.println("Não tem nenhum cliente com o CPF " + cpfCliente + " que tenha um plano na nossa empresa!");
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
