package maisoumenossaude;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Cliente extends Pessoa {

    private String nSus;
    private String nCartaoCredito;
    private LocalDateTime dataHoraAquisicaoPlano;
    private Dependente dependente;
    private Plano planoCliente;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String endereco,
            String nTelefone, String email) {
        super(nome, cpf, endereco, nTelefone, email);
        this.nSus = null;
        this.nCartaoCredito = null;
        this.dataHoraAquisicaoPlano = null;
        this.dependente = null;
    }

    public Cliente(String nome, String cpf, String endereco, String nTelefone,
            String email, String nSus, String nCartaoCredito,
            LocalDateTime dataHoraAquisicaoPlano) {
        super(nome, cpf, endereco, nTelefone, email);
        this.nSus = nSus;
        this.nCartaoCredito = nCartaoCredito;
        this.dataHoraAquisicaoPlano = dataHoraAquisicaoPlano;
        this.dependente = null;
    }

    public void comprarPlano(Plano p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pronto, para podermos continuar com a compra, vamos pedir alguns dados:");
        System.out.println("Informe o seu Numero do SUS: ");
        this.nSus = sc.nextLine();
        System.out.println("Informe o seu Numero do cartão: ");
        this.nCartaoCredito = sc.nextLine();
        System.out.println("O nosso Plano aceita você incluir dependente(s) que tenha menos de 18 anos: ");
        System.out.println("Você tem algum Dependente para incluir? [S/N]");
        char respDependente = sc.next().charAt(0);
        if (respDependente == 'S') {
            System.out.println("Otimo! Vamos cadastrar os dados do seu dependente: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("CPF: ");
            String cpf = sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Numero de telefone: ");
            String nTelefone = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            this.dependente = new Dependente(nome, cpf, endereco, nTelefone, email);
        }
        this.dataHoraAquisicaoPlano = LocalDateTime.now();
        this.planoCliente = p;
        System.out.println("Plano adquirido com sucesso!!!");
    }

    public void cancelaPlano() {

    }

    public void exibePlano() {

    }

    public void marcarConsulta() {

    }

    @Override
    public String toString() {
        if (nSus != null && nCartaoCredito != null && dataHoraAquisicaoPlano != null) {
            return "Nome: " + this.getNome()
                    + " - CPF: " + this.getCpf()
                    + " - Endereço: " + this.getEndereco()
                    + " - Numero de telefone: " + this.getnTelefone()
                    + " - Email: " + this.getEmail()
                    + " - Numero do SUS: " + this.nSus
                    + " - Data e hora de aquisicao do Plano: " + this.dataHoraAquisicaoPlano
                    + " - Plano do cliente: " + this.planoCliente;

        } else {
            return "Nome: " + this.getNome()
                    + " - CPF: " + this.getCpf()
                    + " - Endereço: " + this.getEndereco()
                    + " - Numero de telefone: " + this.getnTelefone()
                    + " - Email: " + this.getEmail();
        }
    }
}
