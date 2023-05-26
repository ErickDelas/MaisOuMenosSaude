package maisoumenossaude;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.ArrayList;

public class Atendente extends Funcionario{
    private int totCancelamento;
    private double comissaoFixa;
    private BDados bd = new BDados();
    
    public Atendente(){}
    
    public Atendente(String nome, String cpf, String endereco, String nTelefone, 
        String email, String nCtps, double salario, LocalDate dataContratacao, 
        LocalTime inicioExpediente, LocalTime fimExpediente, 
        double ultimoContraCheque, double bonificacao, double comissaoFixa) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario, 
            dataContratacao, inicioExpediente, fimExpediente, ultimoContraCheque, 
            bonificacao);
            this.comissaoFixa = comissaoFixa;
    }
    
    /*Recebe um Cliente como parametro e add em um ArrayList do tipo Cliente 
    chamado possiveisClientes que tem na classe BDados.
    */
    public void cadastrarCliente(Cliente c){
        this.bd.getPossiveisClientes().add(c);
    }
    
    public void cancelaPlano(){
        
    }
    
    public double calculaSalario(){
        return 0;
    }
    
    public void cadastraCliente(){
        
    }
}
/*
O atendente é responsável por cadastrar os clientes na lista de “possíveis clientes”. Estes “clientes em
potencial” podem vir tanto de um atendimento presencial quanto a partir de campanhas na internet e redes
sociais. O atendente também é responsável por atender às solicitações de cancelamento do plano de saúde e
para isso ele deve informar o CPF do cliente. O valor da bonificação de um atendente dependerá da quantidade
de cancelamentos feitos no mês: quanto mais cancelamentos, menor a bonificação
*/