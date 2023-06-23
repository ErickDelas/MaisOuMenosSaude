package maisoumenossaude;

import cidades.Enum.Cidades;
import java.time.LocalDate;
import java.util.Scanner;

public class Gerente extends Funcionario {

    private Cidades cidade;
    private Credenciais credenciaisGerente;

    public Gerente() {

    }

    public Gerente(String nome, String cpf, String endereco, String nTelefone,
            String email, String nCtps, double salario, LocalDate dataContratacao,
            double comissaoFixa, Credenciais credenciaisGerente) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario,
                dataContratacao, comissaoFixa);
        this.credenciaisGerente = credenciaisGerente;
    }

    public void cadastrarVendedor(Cidades cidade) {
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
        System.out.print("Numero da carteira de trabalho: ");
        String nCtps = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        System.out.print("Comissao Fixa: ");
        double comissaoF = sc.nextDouble();
        System.out.println("Agora, informe um usuario e senha para acessar o sistema.");
        System.out.print("Usuario: ");
        sc.nextLine();
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        Vendedor vendedor = new Vendedor(nome, cpf, endereco, nTelefone, email,
                nCtps, salario, LocalDate.now(), comissaoF,
                new Credenciais(usuario, senha));
        vendedor.setCidade(cidade);
        BDados.getVendedores().add(vendedor);
    }

    public void cadastrarAtendente(Cidades cidade) {
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
        System.out.print("Numero da carteira de trabalho: ");
        String nCtps = sc.nextLine();
        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        System.out.print("Comissao Fixa: ");
        double comissaoF = sc.nextDouble();
        System.out.println("Agora, informe um usuario e senha para acessar o sistema.");
        System.out.print("Usuario: ");
        sc.nextLine();
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        Atendente atendente = new Atendente(nome, cpf, endereco, nTelefone, email,
                nCtps, salario, LocalDate.now(), comissaoF,
                new Credenciais(usuario, senha));
        atendente.setCidade(cidade);
        BDados.getAtendentes().add(atendente);
    }

    public void demitirAtendente(Cidades cidade) {
        Scanner sc = new Scanner(System.in);
        boolean temAtendente = true;
        System.out.print("Informe o nome do atendente que você quer demitir: ");
        String nomeA = sc.nextLine().toUpperCase();

        for (Atendente atendentes : BDados.getAtendentes()) {
            if (nomeA.equals(atendentes.getNome().toUpperCase()) && cidade.equals(atendentes.getCidade())) {
                BDados.getAtendentes().remove(atendentes);
                System.out.println("O atendente " + atendentes.getNome() + " foi removido com sucesso!!!");
                temAtendente = true;
                break;
            } else{
                temAtendente = false;
            }
        }
        if(temAtendente == false){
            System.out.println("Não tem nenhum atendente com esse nome na região de " + cidade);
        }
    }

    public void demitirVendedor(Cidades cidade) {
        Scanner sc = new Scanner(System.in);
        boolean temVendedor = true;
        System.out.print("Informe o nome do vendedor que você quer demitir: ");
        String nomeV = sc.nextLine().toUpperCase();

        for (Vendedor vendedores: BDados.getVendedores()) {
            if (nomeV.equals(vendedores.getNome().toUpperCase()) && cidade.equals(vendedores.getCidade())) {
                BDados.getVendedores().remove(vendedores);
                System.out.println("O vendedor " + vendedores.getNome() + " foi removido com sucesso!!!");
                temVendedor = true;
                break;
            } else {
                temVendedor = false;
            }
        }
        if(temVendedor == false){
            System.out.println("Não tem nenhum vendedor com esse nome na região de " + cidade);
        }
    }

    public void exibirAtendente() {
        System.out.println("Lista de atendentes: ");
        for (Atendente atendentes : BDados.getAtendentes()) {
            System.out.println(atendentes);
        }
    }

    public void exibirVendedor() {
        System.out.println("Lista de vendedores: ");
        for (Vendedor vendedores : BDados.getVendedores()) {
            System.out.println(vendedores);
        }
    }

    public void pagarVendedor(Vendedor v) {
        Double bonificacao = calculaBonificacaoVendedor(v);
        v.setUltimoContraCheque(bonificacao + v.getSalario());
    }

    public double calculaBonificacaoVendedor(Vendedor v) {
        return v.getComissaoFixa() * v.getTotVendasMes();
    }

    public void pagarAtendente(Atendente a) {
        Double bonificacao = calculaBonificacaoAtendente(a);
        a.setUltimoContraCheque(bonificacao + a.getSalario());
    }

    public Double calculaBonificacaoAtendente(Atendente a) {
        if (a.getComissaoFixa() >= 100) {
            return a.getComissaoFixa() - (a.getTotCancelamento() * 5);
        } else {
            return a.getComissaoFixa() - (a.getTotCancelamento() * 2);
        }
    }

    public void atribuirPlanoVendedor(Vendedor v) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o nome do plano irá ser atribuido ao vendedor " + v.getNome() + " ?");
        String nomePlano = sc.nextLine().toUpperCase();
        for (Plano p : BDados.getPlanos()) {
            if (nomePlano.equals(p.getNomePlano().toUpperCase())) {
                v.getListaPlanoVendedorTem().add(p);
            }
        }
    }

    public Credenciais getCredenciaisGerente() {
        return credenciaisGerente;
    }

    public Cidades getCidade() {
        return cidade;
    }

    public void setCidade(Cidades cidade) {
        this.cidade = cidade;
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
                + " - Esse vendedor trabalha na cidade " + this.cidade;
    }
}
