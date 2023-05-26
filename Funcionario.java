package maisoumenossaude;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Funcionario extends Pessoa{
    private String nCtps;
    private double salario;
    private LocalDate dataContratacao;
    private LocalTime inicioExpediente;
    private LocalTime fimExpediente;
    private double ultimoContraCheque;
    private double bonificacao;
    //private ArrayList <Funcionario> funcionario = new ArrayList();
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, String cpf, String endereco, 
        String nTelefone, String email, String nCtps, double salario, 
        LocalDate dataContratacao, LocalTime inicioExpediente, 
        LocalTime fimExpediente, double ultimoContraCheque, double bonificacao) {
        super(nome, cpf, endereco, nTelefone, email);
        this.nCtps = nCtps; 
        this.salario = salario; 
        this.dataContratacao = dataContratacao; 
        this.inicioExpediente = inicioExpediente; 
        this.fimExpediente = fimExpediente; 
        this.ultimoContraCheque = ultimoContraCheque; 
        this.bonificacao = bonificacao;
    }

    public double calculaBonificacao(){
        return 0;
    }
    
    public void recebeBonificacao(){
        
    }
    
    public void cadastrarFuncionario(Funcionario f){
        
    }
}