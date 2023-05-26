/*
Temos a nossa classe menu que é meio onde inicializamos todos os atributos dos 
objetos que queremos cadastrar.
*/

package maisoumenossaude;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu {
    private SrAntonioAdm srA = new SrAntonioAdm();
    private Funcionario f;
    private Gerente g = new Gerente();
    private Atendente a = new Atendente();
    private Cliente c = new Cliente();
    private Dependente d;
    private Plano p;
    //private EspecialidadesP ep;
    private nomesClinicas nc;
    Scanner sc = new Scanner (System.in);
    
    public static void exibeMenu(){
        System.out.println("\n--------------------------------------------");
        System.out.println("Olá, sejá bem-vindo ao Mais ou menos saúde.");
        System.out.println("O que você deseja fazer?");
        System.out.println("[1] cadastrar Vendedor;");
        System.out.println("[2] cadastrar AtendenteSAC;");
        System.out.println("[3] cadastrar Gerente;");
        System.out.println("[4] cadastrar Cliente;");
        System.out.println("[5] cadastrar Dependente;");
        System.out.println("[6] cadastrar Plano;");
        //System.out.println("[7] cadastrar Especialidades dos planos;");
        System.out.println("[0] Sair");
        System.out.print("Resposta: ");
    }
    
    /*
    Esse metodo vai inicializar os atributos de Vendedor, Atendente e gerente e 
    retorna o mesmo para poder usa-lo.
    */
    public Funcionario funcionario(int opcao){
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
        System.out.print("Ultimo contra-cheque: ");
        double ultimoContraCheque = sc.nextDouble();
        System.out.print("Bonificação: ");
        double bonificacao = sc.nextDouble();
        LocalDate dataContratacao = LocalDate.now();
        LocalTime inicioExpediente = LocalTime.of(07, 0, 0);
        LocalTime fimExpediente = LocalTime.of(17, 0, 0);
        if(opcao==2){
            System.out.print("Comissão: ");
            double comissaoFixa = sc.nextDouble();
            Atendente a = new Atendente(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao, comissaoFixa);
            return a;
        } else if (opcao==3){
            System.out.print("Comissão: ");
            double comissaoFixa = sc.nextDouble();
            Gerente g = new Gerente(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao, comissaoFixa);
            return g;            
        } else{
            System.out.print("Comissão: ");
            double comissaoFixa = sc.nextDouble();
            Vendedor v = new Vendedor(nome, cpf, endereco, nTelefone, email, 
                nCtps, salario, dataContratacao, inicioExpediente, fimExpediente, 
                ultimoContraCheque, bonificacao, comissaoFixa);
            return v;
        }
    }
    
    /*
    Esse metodo vai inicializar os atributos de um dependente e 
    retorna o mesmo para poder usa-lo.
    */
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
    
    /*
    Esse metodo vai inicializar os atributos de um cliente e 
    retorna o mesmo para poder usa-lo.
    */    
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
    
    /*
    Esse metodo vai inicializar os atributos de Plano e retorna o mesmo para 
    poder usa-lo.
    */
    public Plano plano (){
        System.out.println("Valor do plano: ");
        double valorPlano = sc.nextDouble();
        System.out.println("Informe a 1º especialidade: ");
        String ep1 = sc.nextLine();
        System.out.println("Informe a 2º especialidade: ");
        String ep2 = sc.nextLine();
        System.out.println("Informe a 3º especialidade: ");
        String ep3 = sc.nextLine();
        Plano p = new Plano(valorPlano, ep1, ep2, ep3);
        return p;
    }
    
    /*public EspecialidadesP especialidadesP(){
        System.out.println("Informe a 1º especialidade: ");
        String ep1 = sc.nextLine();
        System.out.println("Informe a 2º especialidade: ");
        String ep2 = sc.nextLine();
        System.out.println("Informe a 3º especialidade: ");
        String ep3 = sc.nextLine();
        EspecialidadesP ep = new EspecialidadesP(ep1, ep2, ep3);
        return ep;
    }*/
    
    /*
    Esse metodo vai chamar metodos de outras classes para poder cadastrar o que
    queremos em um Array do mesmo tipo. É aqui que eu uso o retorno das metodos
    acima.
    */
    public void executaAcao(int opcao){
    switch (opcao){
            /* Caso 1: Vai atribuir o retorno do meu metodo funcionario na 
            variavel f. Essa variavel f vai ser passada como parametro para o 
            meu metodo cadastrarFuncionario na classe gerente.*/
            case 1:
                f = funcionario(opcao);
                g.cadastrarFuncionario(f);
                /*
                for (Funcionario f: f.getFuncionario()) {
                    System.out.println(f);
                }
                
                f.getFuncionario().forEach(f-> {
                    System.out.println(f);
                });
                
                for (int i = 0; i <f.getFuncionario().size() ; i++) {
                        System.out.println(f.getFuncionario().get(i));    
                }*/
                break;
                
            /* Caso 2: Vai atribuir o retorno do meu metodo funcionario na 
            variavel f. Essa variavel f vai ser passada como parametro para o 
            meu metodo cadastrarFuncionario na classe gerente.*/
            case 2: 
                f = funcionario(opcao);
                g.cadastrarFuncionario(f);                
                break;
            
            /* Caso 3: Vai atribuir o retorno do meu metodo funcionario na 
            variavel f. Essa variavel f vai ser passada como parametro para o 
            meu metodo cadastrarGerente na classe SrAntonioAdm.*/
            case 3: 
                f = funcionario(opcao);
                srA.cadastrarGerente((Gerente) f);
                break;
                
            /* Caso 4: Vai atribuir o retorno do meu metodo cliente na 
            variavel c. Essa variavel c vai ser passada como parametro para o 
            meu metodo cadastrarCliente na classe Atendente.*/
            case 4: 
                c = cliente();
                a.cadastrarCliente(c);
                break;
                
            /* Caso 5: Vai atribuir o retorno do meu metodo dependente na 
            variavel d. Essa variavel d vai ser passada como parametro para o 
            meu metodo cadastrarDependente na classe Cliente.*/
            case 5: 
                d = dependente();
                c.cadastrarDependente(d);                 
                break;
                
            /* Caso 6: Vai atribuir o retorno do meu metodo plano na 
            variavel p. Essa variavel p vai ser passada como parametro para o 
            meu metodo cadastrarPlano na classe SrAntonioAdm.*/
            case 6: 
                p = plano();
                srA.cadastrarPlano(p); 
                break;
            /*case 7:
                ep = especialidadesP();
                srA.cadastrarEspecialidadesPlano(ep);
                break;*/
        }
    }
}