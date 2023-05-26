package maisoumenossaude;

import java.time.LocalDateTime;
//import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String nSus;
    private String nCartaoCredito;
    private LocalDateTime dataHoraAquisicaoPlano;
    private Dependente dependente;
    private BDados bd = new BDados();
    public Cliente (){
        
    }
    
    public Cliente(String nome, String cpf, String endereco, 
        String nTelefone, String email, String nSus, String nCartaoCredito, 
        LocalDateTime dataHoraAquisicaoPlano, Dependente dependente) {
        super(nome, cpf, endereco, nTelefone, email);
        this.nSus = nSus;
        this.nCartaoCredito = nCartaoCredito;
        this.dataHoraAquisicaoPlano = dataHoraAquisicaoPlano;
        this.dependente = dependente;
    }
    
    /*Recebe um Dependente como parametro e add em um ArrayList do tipo 
    dependente que tem na classe BDados.
    */
    public void cadastrarDependente(Dependente d){
        this.bd.getDependente().add(d);
    }
    
    public void cancelaPlano (){
        
    }
    
    public void exibePlano(){
        
    }
    
    public void marcarConsulta(){
        
    }
}
