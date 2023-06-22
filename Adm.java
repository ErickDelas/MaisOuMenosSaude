package maisoumenossaude;

import cidades.Enum.Cidades;
import java.time.LocalDate;
import java.util.Scanner;

public class Adm {

    private String nomeAdm = "Antonio";
    private Credenciais credenciaisAdm;
    private String segurançaLogin = "o palmeiras nao tem mundial";

    public Adm() {
        this.credenciaisAdm = new Credenciais();
    }

    public Adm(Credenciais credenciaisAdm) {
        this.credenciaisAdm = credenciaisAdm;
    }

    public void cadastrarGerente() {
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
        Gerente gerente = new Gerente(nome, cpf, endereco, nTelefone, email, nCtps,
                salario, LocalDate.now(), comissaoF, new Credenciais(usuario, senha));
        System.out.print("Agora, Informe qual cidade esse gerente irá trabalhar: ");
        String nomeCidade = sc.nextLine().toUpperCase();
        gerente.setCidade(Cidades.valueOf(nomeCidade));
        BDados.getGerentes().add(gerente);
    }

    public void cadastrarPlano() {
        Scanner sc = new Scanner(System.in);
        char resp = 'S';
        System.out.print("Nome do plano: ");
        String nomePlano = sc.nextLine();
        System.out.print("Valor do plano: ");
        Double valorPlano = sc.nextDouble();
        Plano plano = new Plano(nomePlano, valorPlano);
        System.out.println("Vamos cadastrar uma(s) especialidade(s) para esse plano: ");
        do {
            System.out.print("Nome da especialidade: ");
            sc.nextLine();
            String nomeEP = sc.nextLine();
            System.out.print("Quantos (%) de desconto: ");
            Double porcentagem = sc.nextDouble();
            plano.getEspecialidadesPlanos().add(new EspecialidadesP(nomeEP, porcentagem));
            System.out.print("Tem mais especialidades para esse plano? [S/N]");
            resp = sc.next().charAt(0);
        } while (resp == 'S');
        System.out.println("\nVamos cadastrar clinica(s) que aceita esse plano:");
        do {
            int i = 0;
            i++;
            System.out.print("Informe a " + i + "º clinica: ");
            sc.nextLine();
            String nomeClinica = sc.nextLine();
            plano.getNomesClinicas().add(new NomesClinicas(nomeClinica));
            System.out.print("Tem mais Clinicas para esse plano? [S/N]");
            resp = sc.next().charAt(0);
        } while (resp == 'S');
        BDados.getPlanos().add(plano);
    }

    public void exibirGerentes() {
        System.out.println("Lista de Gerentes: ");
        for (Gerente gerente : BDados.getGerentes()) {
            System.out.println(gerente);
        }
    }

    public void exibirPlanos() {
        System.out.println("\nLista de planos: ");
        for (Plano planos : BDados.getPlanos()) {
            System.out.println(planos);
        }
    }

    public int trocarAdm() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a frase de segurança: ");
        String resp = sc.nextLine();
        if (resp.equals(this.segurançaLogin)) {
            System.out.println("Otimo! Você pode trocar os dados de login.");
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();
            this.getCredenciaisAdm().setUsuario(usuario);
            this.getCredenciaisAdm().setSenha(senha);
            return 0;
        } else {
            System.out.println("Você não pode trocar a senha!!!");
            return -1;
        }
    }

    public Credenciais getCredenciaisAdm() {
        return credenciaisAdm;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    @Override
    public String toString() {
        return "Dados do Adm: \n"
                + "\nNome de Adm: " + this.nomeAdm
                + "\nUsuario: " + this.credenciaisAdm.getUsuario()
                + "\nSenha: " + this.credenciaisAdm.getSenha();
    }
}
