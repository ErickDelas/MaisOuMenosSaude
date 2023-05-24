package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;


public class Menu {
    Scanner sc = new Scanner (System.in);
    public static void exibeMenu(){
        System.out.println("Olá, sejá bem-vindo ao Mais ou menos saúde.");
        System.out.println("O que você deseja fazer?");
        System.out.println("[1] cadastrar Funcionario;");
        System.out.println("[2] cadastrar Vendedor;");
        System.out.println("[3] cadastrar AtendenteSAC;");
        System.out.println("[4] cadastrar Gerente;");
        System.out.println("[5] cadastrar Cliente;");
        System.out.println("[6] cadastrar Dependente;");
        System.out.println("[7] cadastrar Plano;");
        System.out.println("[0] Sair");
    }
    
    public Funcionario funcionario(int opcao){
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Endereço: ");
        String endereco = sc.nextLine();
        System.out.println("Numero de telefone: ");
        String nTelefone = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Numero da carteira de trabalho: ");
        String nCtps = sc.nextLine();
        System.out.println("Salario: ");
        double salario = sc.nextDouble();
        System.out.println("Ultimo contra-cheque: ");
        double ultimoContraCheque = sc.nextDouble();
        System.out.println("Bonificação: ");
        double bonificacao = sc.nextDouble();
        LocalDate dataContratacao = LocalDate.now();
        LocalTime inicioExpediente = LocalTime.of(07, 0, 0);
        LocalTime fimExpediente = LocalTime.of(17, 0, 0);
        if(opcao==2){
            System.out.println("Comissão: ");
            double comissaoFixa = sc.nextDouble();
            Vendedor v = new Vendedor(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao, comissaoFixa);
            return v;
        } else if (opcao==3){
            System.out.println("Comissão: ");
            double comissaoFixa = sc.nextDouble();
            Atentende a = new Atentende(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao, comissaoFixa);
            return a;
        } else if (opcao==4){
            System.out.println("Comissão: ");
            double comissaoFixa = sc.nextDouble();
            Gerente g = new Gerente(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao, comissaoFixa);
            return g;
        } else{
            Funcionario f = new Funcionario(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao);
            return f;
        }
    }
    
    public Cliente cliente(){
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Endereço: ");
        String endereco = sc.nextLine();
        System.out.println("Numero de telefone: ");
        String nTelefone = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();            
        System.out.println("Numero do SUS: ");
        String nSus = sc.nextLine();
        System.out.println("Numero do cartão (Credito/Debito): ");
        String nCartaoCredito = sc.nextLine();
        LocalDateTime dataHoraAquisicaoPlano;
        Dependente dependente;
        Cliente c = new Cliente();
    }
    
    public void executaAcao(int opcao){
        int op = opcao;
        Funcionario f = funcionario(op);
        switch (opcao){
            case 1, 2, 3, 4: f.cadastrarFuncionario(f);
            case 2: Cliente.cadastrarCliente(); break;
            case 3: Cliente.cadastrarDependente(); break;
            case 4: Gerente.cadastrarPlano(); break;
        }       
    }
}
