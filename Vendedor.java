package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vendedor extends Funcionario{
    private int totVendasMes = 0;
    private double comissaoFixa;

    public Vendedor(String nome, String cpf, String endereco, String nTelefone, 
        String email, String nCtps, double salario, LocalDate dataContratacao, 
        LocalTime inicioExpediente, LocalTime fimExpediente, 
        double ultimoContraCheque, double bonificacao, 
        double comissaoFixa) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario, 
            dataContratacao, inicioExpediente, fimExpediente, ultimoContraCheque, 
            bonificacao);
        this.comissaoFixa = comissaoFixa;
    }
    
    @Override
    public void cadastrarFuncionario(Funcionario f){
        f.getFuncionario().add(f);
    }
    
    public void venderPlano(){
        this.totVendasMes ++;
    }
    
    public int getTotVendasMes() {
        return totVendasMes;
    }

    public void setTotVendasMes(int totVendasMes) {
        this.totVendasMes = totVendasMes;
    }

    public double getComissaoFixa() {
        return comissaoFixa;
    }

    public void setComissaoFixa(double comissaoFixa) {
        this.comissaoFixa = comissaoFixa;
    }
    
}
