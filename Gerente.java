package maisoumenossaude;

import cidades.Enum.Cidades;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
            for (Vendedor vendedores : BDados.getVendedores()) {
                if (vendedores.getCpf().equals(cpf)) {
                    System.out.println("ERROR! Ja tem um vendedor cadastrado com esse CPF");
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
            for (Vendedor vendedores : BDados.getVendedores()) {
                if (vendedores.getnTelefone().equals(nTelefone)) {
                    System.out.println("ERROR! Ja tem um vendedor cadastrado com esse Numero de telefone");
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
            for (Vendedor vendedores : BDados.getVendedores()) {
                if (vendedores.getEmail().equals(email)) {
                    System.out.println("ERROR! Ja tem um vendedor cadastrado com esse email");
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
            for (Vendedor vendedores : BDados.getVendedores()) {
                if (vendedores.getnCtps().equals(nCtps)) {
                    System.out.println("ERROR! Ja tem um vendedor cadastrado com esse Nº de carteira de trabalho");
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
        System.out.println("Agora, informe um usuario e senha para acessar o sistema.");
        sc.nextLine();
        while (temAtributo == true) {
            int aux = 0;
            System.out.print("Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Senha: ");
            senha = sc.nextLine();
            for (Vendedor vendedores : BDados.getVendedores()) {
                if (vendedores.getCredenciaisVendedor().getUsuario().equals(usuario)) {
                    System.out.println("ERROR! Ja tem um vendedor cadastrado com esse Usuario");
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

        Vendedor vendedor = new Vendedor(nome, cpf, endereco, nTelefone, email,
                nCtps, salario, LocalDate.now(), comissaoF,
                new Credenciais(usuario, senha));
        vendedor.setCidade(cidade);
        BDados.getVendedores().add(vendedor);
    }

    public void cadastrarAtendente(Cidades cidade) {
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
            for (Atendente atendentes : BDados.getAtendentes()) {
                if (atendentes.getCpf().equals(cpf)) {
                    System.out.println("ERROR! Ja tem um atendente cadastrado com esse CPF");
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
            for (Atendente atendentes : BDados.getAtendentes()) {
                if (atendentes.getnTelefone().equals(nTelefone)) {
                    System.out.println("ERROR! Ja tem um atendente cadastrado com esse Numero de telefone");
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
            for (Atendente atendentes : BDados.getAtendentes()) {
                if (atendentes.getEmail().equals(email)) {
                    System.out.println("ERROR! Ja tem um atendente cadastrado com esse email");
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
            for (Atendente atendentes : BDados.getAtendentes()) {
                if (atendentes.getnCtps().equals(nCtps)) {
                    System.out.println("ERROR! Ja tem um gerente atendente com esse Nº de carteira de trabalho");
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
        System.out.println("Agora, informe um usuario e senha para acessar o sistema.");
        sc.nextLine();
        while (temAtributo == true) {
            int aux = 0;
            System.out.print("Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Senha: ");
            senha = sc.nextLine();
            for (Atendente atendentes : BDados.getAtendentes()) {
                if (atendentes.getCredenciaisAtendente().getUsuario().equals(usuario)) {
                    System.out.println("ERROR! Ja tem um atendente cadastrado com esse Usuario");
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
        Atendente atendente = new Atendente(nome, cpf, endereco, nTelefone, email,
                nCtps, salario, LocalDate.now(), comissaoF,
                new Credenciais(usuario, senha));
        atendente.setCidade(cidade);
        BDados.getAtendentes().add(atendente);
    }

    public void demitirAtendente(Cidades cidade) {
        Scanner sc = new Scanner(System.in);
        boolean temAtendente = false;
        System.out.print("Informe o CPF do atendente que você quer demitir: ");
        String cpfA = sc.nextLine().toUpperCase();

        for (Atendente atendentes : BDados.getAtendentes()) {
            if (cpfA.equals(atendentes.getCpf().toUpperCase()) && cidade.equals(atendentes.getCidade())) {
                System.out.println("O atendente " + atendentes.getNome() + " foi removido com sucesso!!!");
                BDados.getAtendentes().remove(atendentes);
                temAtendente = true;
                break;
            }
        }
        if (temAtendente == false) {
            System.out.println("Não tem nenhum atendente com o CPF " + cpfA + " na região de " + cidade + "!");
        }
    }

    public void demitirVendedor(Cidades cidade) {
        Scanner sc = new Scanner(System.in);
        boolean temVendedor = false;
        System.out.print("Informe o CPF do vendedor que você quer demitir: ");
        String cpfV = sc.nextLine().toUpperCase();

        for (Vendedor vendedores : BDados.getVendedores()) {
            if (cpfV.equals(vendedores.getCpf().toUpperCase()) && cidade.equals(vendedores.getCidade())) {
                System.out.println("O vendedor " + vendedores.getNome() + " foi removido com sucesso!!!");
                BDados.getVendedores().remove(vendedores);
                temVendedor = true;
                break;
            }
        }
        if (temVendedor == false) {
            System.out.println("Não tem nenhum vendedor com o CPF " + cpfV + " na região de " + cidade + "!");
        }
    }

    public void exibirAtendente(Cidades cidade) {
        boolean temAtendente = false;
        System.out.println("Lista de atendentes em " + cidade + ": ");
        for (Atendente atendentes : BDados.getAtendentes()) {
            if (atendentes.getCidade().equals(cidade)) {
                System.out.println(atendentes);
                temAtendente = true;
            }
        }
        if (temAtendente == false) {
            System.out.println("Não tem nenhum gerente cadastrado na unidade de " + cidade + "!!!");
        }
    }

    public void exibirVendedor(Cidades cidade) {
        boolean temVendedor = false;
        System.out.println("Lista de vendedores em " + cidade + ": ");
        for (Vendedor vendedores : BDados.getVendedores()) {
            if (vendedores.getCidade().equals(cidade)) {
                System.out.println(vendedores);
                temVendedor = true;
            }
        }
        if (temVendedor == false) {
            System.out.println("Não tem nenhum gerente cadastrado na unidade de " + cidade + "!!!");
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
                if (v.getListaPlanoVendedorTem().get(0) == null) {
                    v.getListaPlanoVendedorTem().remove(0);
                    v.getListaPlanoVendedorTem().add(p);
                } else {
                    v.getListaPlanoVendedorTem().add(p);
                }
            }
        }
        for (Plano p : v.getListaPlanoVendedorTem()) {
            System.out.println(p);
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
