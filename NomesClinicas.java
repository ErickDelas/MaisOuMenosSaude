package maisoumenossaude;

public class NomesClinicas {
    private String nomeClinica;

    public NomesClinicas() {
    }

    public NomesClinicas(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    @Override
    public String toString() {
        return " - " + this.nomeClinica + " - ";
    }
}
