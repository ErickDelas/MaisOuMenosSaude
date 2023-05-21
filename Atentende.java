package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atentende extends Funcionario{
    private int totCancelamento;

    public Atentende(String nome, String cpf, String endereco, String nTelefone, 
        String email, String nCtps, double salario, LocalDate dataContratacao, 
        LocalTime inicioExpediente, LocalTime fimExpediente, 
        double ultimoContraCheque, double bonificacao, int totCancelamento) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario, 
            dataContratacao, inicioExpediente, fimExpediente, ultimoContraCheque, 
            bonificacao);
        this.totCancelamento = totCancelamento;
    }
    
    public void cancelaPlano(){
        
    }
    
    public double calculaSalario(){
        return 0;
    }
    
    public void cadastraCliente(){
        
    }
    
    public int getTotCancelamento() {
        return totCancelamento;
    }

    public void setTotCancelamento(int totCancelamento) {
        this.totCancelamento = totCancelamento;
    }
    
}
