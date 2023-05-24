package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;


public class Menu {
    private Funcionario f;
    private Cliente c;
    private Dependente d;
    private Plano p;
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
        System.out.println("[8] cadastrar Especialidades dos planos;");
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
        } else{
            Funcionario f = new Funcionario(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao);
            return f;
        }
    }
    
    public Gerente gerente (){
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
        System.out.println("Comissão: ");
        double comissaoFixa = sc.nextDouble();
        Gerente g = new Gerente(nome, cpf, endereco, nTelefone, email, 
            nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
            ultimoContraCheque, bonificacao, comissaoFixa);
            return g;
    }
    
    public Dependente dependente(){
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
        Dependente d = new Dependente(nome, cpf, endereco, nTelefone, email);
        return d;
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
        LocalDateTime dataHoraAquisicaoPlano = LocalDateTime.now();
        Dependente dependente = dependente();
        Cliente c = new Cliente(nome, cpf, endereco, nTelefone, email, nSus, 
            nCartaoCredito, dataHoraAquisicaoPlano, dependente);
        return c;
    }
    
    public Plano plano (){
        System.out.println("Valor do plano: ");
        double valorPlano = sc.nextDouble();
        System.out.println("Beneficios do plano: ");
        String beneficiosPlano = sc.nextLine();
        Plano p = new Plano(valorPlano, beneficiosPlano);
        return p;
    }
    
    public void executaAcao(int opcao){
    switch (opcao){
            case 1:
                f = funcionario(opcao);
                f.cadastrarFuncionario(f); 
                break;
            case 2: 
                f = funcionario(opcao);
                f.cadastrarFuncionario(f); 
                break;
            case 3: 
                f = funcionario(opcao);
                f.cadastrarFuncionario(f); 
                break;
            case 4: 
                f = funcionario(opcao);
                f.cadastrarFuncionario(f); 
                break;
            case 5: 
                c = cliente();
                c.cadastrarCliente(c); 
                break;
            case 6: 
                d = dependente();
                d.cadastrarDependente(d); 
                break;
            case 7: 
                p = plano();
                p.cadastrarPlano(p);
                break;
            case 8: 
                break;
        }
    }
}
