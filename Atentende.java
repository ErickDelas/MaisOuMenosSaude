package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atentende extends Funcionario{
    private int totCancelamento;
    private double comissaoFixa;

    public Atentende(String nome, String cpf, String endereco, String nTelefone, 
        String email, String nCtps, double salario, LocalDate dataContratacao, 
        LocalTime inicioExpediente, LocalTime fimExpediente, 
        double ultimoContraCheque, double bonificacao, double comissaoFixa) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario, 
            dataContratacao, inicioExpediente, fimExpediente, ultimoContraCheque, 
            bonificacao);
            this.comissaoFixa = comissaoFixa;
    }
    
    @Override
    public void cadastrarFuncionario(Funcionario f){
        f.getFuncionario().add(f);
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
