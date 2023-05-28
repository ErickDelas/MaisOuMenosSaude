package maisoumenossaude;


public class SrAntonioAdm {
    private BDados bd = new BDados ();
    private Credenciais usuario = new Credenciais();
    
    public SrAntonioAdm(){}
    
    public SrAntonioAdm(String usuario, String senha){
        this.usuario.setUsuario(usuario);
        this.usuario.setSenha(senha);
    }
    
    /*Recebe um Gerente como parametro e add em um ArrayList do tipo gerente
    que tem na classe BDados.
    */
    public void cadastrarGerente(Gerente g){
        this.bd.getGerente().add(g);
    }
    
    /*Recebe um Plano como parametro e add em um ArrayList do tipo Plano
    que tem na classe BDados.
    */
    public void cadastrarPlano (Plano p){
        this.bd.getPlano().add(p);
    }
    
    /*public void cadastrarEspecialidadesPlano(EspecialidadesP ep){
        this.bd.getEp().add(ep);
    }*/

    public Credenciais getUsuario() {
        return usuario;
    }
    
    
}
/*
o sr. Antônio quer fazer a migração de forma gradual, testando ele mesmo todas as
funcionalidades. Assim, durante 1 mês, o sr. Antônio utilizará o sistema
como se fosse cada um dos funcionários da “Mais ou menos saúde”.

Atualmente o sr. Antônio tem acesso a todas as planilhas da empresa e é ele quem faz a
contratação/registro dos gerentes e também é ele quem cadastra os planos de saúde que estão disponíveis
para venda. Assim sendo, ele terá um papel de administrador no novo sistema.
*/
