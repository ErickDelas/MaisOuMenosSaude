package maisoumenossaude;

//import java.util.Scanner;

public class Plano {
    private double valorPlano;
    private String ep1;
    private String ep2;
    private String ep3;
    private BDados bd = new BDados();
    //private String letrasMiudas; // O que seria isso, Arthur? está no diagrama de classes.
    
    public Plano (){}
    
    public Plano (double valorPlano, String ep1, String ep2, String ep3){
        this.valorPlano = valorPlano;
        this.ep1 = ep1;
        this.ep2 = ep2;
        this.ep3 = ep3;
    }
    
    /*public void cadastrarClinicas(nomesClinicas nc){
        this.bd.getNomeC().add(nc);
    }*/
}

/*
Um plano vendido pela empresa tem uma lista de especialidades médicas e uma lista com os nomes
das clínicas e hospitais que aceitam aquele plano. Cada especialidade tem um nome e o percentual de
desconto dado pelo plano.
*/

