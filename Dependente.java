package maisoumenossaude;

import java.util.ArrayList;

public class Dependente extends Pessoa {
    private ArrayList <Dependente> dependente = new ArrayList();
    
    public Dependente (){
        
    }
    
    public Dependente(String nome, String cpf, String endereco, 
        String nTelefone, String email) {
        super(nome, cpf, endereco, nTelefone, email);
    }
    
    public void cadastrarDependente(Dependente d){
        this.dependente.add(d);
    }

    public ArrayList<Dependente> getDependente() {
        return dependente;
    }
}
