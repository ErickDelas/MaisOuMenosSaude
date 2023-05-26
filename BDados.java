package maisoumenossaude;

import java.util.ArrayList;

public class BDados {
    private ArrayList <Atendente> atendente = new ArrayList();
    private ArrayList <Cliente> possiveisClientes = new ArrayList();
    private ArrayList <Cliente> clientesAtivos = new ArrayList();
    private ArrayList <Cliente> clientesInativos = new ArrayList();
    private ArrayList <Credenciais> credenciais = new ArrayList();
    private ArrayList <Dependente> dependente = new ArrayList();
    //private ArrayList <EspecialidadesP> ep = new ArrayList();
    private ArrayList <Gerente> gerente = new ArrayList();
    private ArrayList <Plano> plano = new ArrayList ();
    private ArrayList <Vendedor> vendedor = new ArrayList();

    public ArrayList<Atendente> getAtendente() {
        return atendente;
    }

    public ArrayList<Cliente> getPossiveisClientes() {
        return possiveisClientes;
    }

    public ArrayList<Cliente> getClientesAtivos() {
        return clientesAtivos;
    }

    public ArrayList<Cliente> getClientesInativos() {
        return clientesInativos;
    }

    public ArrayList<Credenciais> getCredenciais() {
        return credenciais;
    }

    public ArrayList<Dependente> getDependente() {
        return dependente;
    }

    /*public ArrayList<EspecialidadesP> getEp() {
        return ep;
    }*/

    public ArrayList<Gerente> getGerente() {
        return gerente;
    }

    public ArrayList<Plano> getPlano() {
        return plano;
    }

    public ArrayList<Vendedor> getVendedor() {
        return vendedor;
    }  
}
