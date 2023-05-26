package maisoumenossaude;

import java.time.LocalDate;
import java.time.LocalTime;

public class Gerente extends Funcionario{
    private double comissaoFixa;
    private BDados bd = new BDados();
    
    public Gerente(){
        
    }
    
    public Gerente(String nome, String cpf, String endereco, String nTelefone, 
        String email, String nCtps, double salario, LocalDate dataContratacao, 
        LocalTime inicioExpediente, LocalTime fimExpediente, 
        double ultimoContraCheque, double bonificacao, double comissaoFixa) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario, 
            dataContratacao, inicioExpediente, fimExpediente, ultimoContraCheque, 
            bonificacao);
        this.comissaoFixa = comissaoFixa;
    }
    
    /*Recebe um vendedor como parametro e add em um ArrayList do tipo vendedor
    que tem na classe BDados.
    */
    public void cadastrarFuncionario(Vendedor v){
        this.bd.getVendedor().add(v);   
    }
    
    /*Recebe um Atendente como parametro e add em um ArrayList do tipo Atendente
    que tem na classe BDados.
    */
    public void cadastrarFuncionario(Atendente a){
        this.bd.getAtendente().add(a);
    }
    
    public void pagarFuncionario(Funcionario f){
        
    }
    
    public void calculaBonificacao1(){
        
    }
}
/*
Cada uma das três unidades da empresa possui um gerente, vendedores e atendentes. Um gerente é
responsável por contratar/cadastrar os funcionários da sua unidade e também por informar o pagamento de
cada um no sistema. Além disso, é o gerente quem atribui um plano de saúde para ser vendido por um
vendedor de sua unidade
*/