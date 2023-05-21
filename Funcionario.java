package maisoumenossaudetest;

import java.time.LocalDate;
import java.time.LocalTime;

public class Funcionario extends Pessoa{
    private String nCtps;
    private double salario;
    private LocalDate dataContratacao;
    private LocalTime inicioExpediente;
    private LocalTime fimExpediente;
    private double ultimoContraCheque;
    private double bonificacao;

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
    
    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    public String getnCtps() {
        return nCtps;
    }

    public void setnCtps(String nCtps) {
        this.nCtps = nCtps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public LocalTime getInicioExpediente() {
        return inicioExpediente;
    }

    public void setInicioExpediente(LocalTime inicioExpediente) {
        this.inicioExpediente = inicioExpediente;
    }

    public LocalTime getFimExpediente() {
        return fimExpediente;
    }

    public void setFimExpediente(LocalTime fimExpediente) {
        this.fimExpediente = fimExpediente;
    }

    public double getUltimoContraCheque() {
        return ultimoContraCheque;
    }

    public void setUltimoContraCheque(double ultimoContraCheque) {
        this.ultimoContraCheque = ultimoContraCheque;
    }
}
