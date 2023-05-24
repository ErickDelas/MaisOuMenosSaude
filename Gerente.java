package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Gerente extends Funcionario{
    private double comissaoFixa;
    private ArrayList<Plano> plano = new ArrayList();
    
    public Gerente(String nome, String cpf, String endereco, String nTelefone, 
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
    
    public void pagarFuncionario(Funcionario f){
        
    }
    
    public void contrataVendedor(Vendedor v){
        
    }
    
    public void calculaBonificacao1(){
        
    }
    
    public void cadastrarPlano(Plano p){
        this.plano.add(p);
    }
}
