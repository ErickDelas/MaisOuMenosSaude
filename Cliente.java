package maisoumenossaudetest;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String nSus;
    private String nCartaoCredito;
    private LocalDateTime dataHoraAquisicaoPlano;
    private Dependente dependente;
    private ArrayList <Cliente> cliente = new ArrayList();
        
    public Cliente(String nome, String cpf, String endereco, 
        String nTelefone, String email, String nSus, String nCartaoCredito, 
        LocalDateTime dataHoraAquisicaoPlano, Dependente dependente) {
        super(nome, cpf, endereco, nTelefone, email);
        this.nSus = nSus;
        this.nCartaoCredito = nCartaoCredito;
        this.dataHoraAquisicaoPlano = dataHoraAquisicaoPlano;
        this.dependente = dependente;
    }

    public void cadastrarCliente(Cliente c){
        this.cliente.add(c);
    }
    
    /*public void cadastrarDependente(Dependente d){
        this.cliente.add(d);
    }*/
    
    public void cancelaPlano (){
        
    }
    
    public void exibePlano(){
        
    }
    
    public void marcarConsulta(){
        
    }
}
