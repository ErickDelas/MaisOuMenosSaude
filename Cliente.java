package maisoumenossaudetest;

import java.time.LocalDateTime;

public class Cliente extends Pessoa{
    private String nSus;
    private String nCartaoCredito;
    private LocalDateTime dataHoraAquisicaoPlano;
    private Dependente dependente;
    
    public Cliente(String nome, String cpf, String endereco, 
        String nTelefone, String email, String nSus, String nCartaoCredito, 
        LocalDateTime dataHoraAquisicaoPlano, Dependente dependente) {
        super(nome, cpf, endereco, nTelefone, email);
        this.nSus = nSus;
        this.nCartaoCredito = nCartaoCredito;
        this.dataHoraAquisicaoPlano = dataHoraAquisicaoPlano;
        this.dependente = dependente;
    }

    public void cadastraDependente(){
        
    }
    
    public void cancelaPlano (){
        
    }
    
    public void exibePlano(){
        
    }
    
    public void marcarConsulta(){
        
    }
    
    public String getnSus() {
        return nSus;
    }

    public void setnSus(String nSus) {
        this.nSus = nSus;
    }

    public String getnCartaoCredito() {
        return nCartaoCredito;
    }

    public void setnCartaoCredito(String nCartaoCredito) {
        this.nCartaoCredito = nCartaoCredito;
    }

    public LocalDateTime getDataHoraAquisicaoPlano() {
        return dataHoraAquisicaoPlano;
    }

    public void setDataHoraAquisicaoPlano(LocalDateTime dataHoraAquisicaoPlano) {
        this.dataHoraAquisicaoPlano = dataHoraAquisicaoPlano;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
}
