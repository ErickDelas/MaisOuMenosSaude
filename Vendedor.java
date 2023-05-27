package maisoumenossaude;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vendedor extends Funcionario{
    private int totVendasMes = 0;
    private double comissaoFixa;
    private Credenciais c = new Credenciais();

    public Vendedor (){
        
    }
    public Vendedor(String nome, String cpf, String endereco, String nTelefone, 
        String email, String nCtps, double salario, LocalDate dataContratacao, 
        LocalTime inicioExpediente, LocalTime fimExpediente, 
        double ultimoContraCheque, double bonificacao, double comissaoFixa, 
        String usuario, String senha) {
        super(nome, cpf, endereco, nTelefone, email, nCtps, salario, 
            dataContratacao, inicioExpediente, fimExpediente, ultimoContraCheque, 
            bonificacao);
        this.comissaoFixa = comissaoFixa;
        this.c.setUsuario(usuario);
        this.c.setSenha(senha);
    }
    
    public void venderPlano(){
        this.totVendasMes ++;
    }
}
/*
O vendedor é responsável por vender o plano a ele atribuído. Ele escolhe um cliente da lista de
“possíveis clientes” e entra em contato para apresentar o plano. Caso ele consiga realizar uma venda, uma
bonificação lhe é paga no final do mês.
*/
