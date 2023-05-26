package maisoumenossaude;

public class Consulta {
    private double valorConsulta;
    private String tipoString;
    
    public Consulta(double valorConsulta, String tipoString){
        this.valorConsulta = valorConsulta;
        this.tipoString = tipoString;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getTipoString() {
        return tipoString;
    }

    public void setTipoString(String tipoString) {
        this.tipoString = tipoString;
    }
}
