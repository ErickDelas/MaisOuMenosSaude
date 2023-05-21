package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalTime;

public class Gerente extends Funcionario{

    public Gerente(String nome, String cpf, String endereco, String nTelefone, 
        String email, String nCtps, double salario, LocalDate dataContratacao, 
        LocalTime inicioExpediente, LocalTime fimExpediente, 
        double ultimoContraCheque, double bonificacao) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario, 
            dataContratacao, inicioExpediente, fimExpediente, ultimoContraCheque, 
            bonificacao);
    }
    
    public void pagarFuncionario(Funcionario f){
        
    }
    
    public void contrataVendedor(Vendedor v){
        
    }
    
    public void calculaBonificacao1(){
        
    }
    
    public void criaPlanos(){
        
    }
}
