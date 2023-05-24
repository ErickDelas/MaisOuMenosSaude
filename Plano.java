package maisoumenossaudetest;

import java.util.ArrayList;

public class Plano {
    private double valorPlano;
    private String beneficiosPlano;
    //private String letrasMiudas; // O que seria isso, Arthur? está no diagrama de classes.
    private ArrayList <Plano> plano = new ArrayList ();
    
    public Plano (double valorPlano, String beneficiosPlano){
        this.valorPlano = valorPlano;
        this.beneficiosPlano = beneficiosPlano;
        //this.letrasMiudas = letrasMiudas;
    }

    public void cadastrarPlano (Plano p){
        this.plano.add(p);
    }

    public ArrayList<Plano> getPlano() {
        return plano;
    }
    
    public double getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(double valorPlano) {
        this.valorPlano = valorPlano;
    }

    public String getBeneficiosPlano() {
        return beneficiosPlano;
    }

    public void setBeneficiosPlano(String beneficiosPlano) {
        this.beneficiosPlano = beneficiosPlano;
    }
}
