package maisoumenossaude;

import java.util.ArrayList;
import java.util.List;

public class Plano {

    private String nomePlano;
    private Double valorPlano;
    List<EspecialidadesP> especialidadesPlanos = new ArrayList<>();
    List<NomesClinicas> nomesClinicas = new ArrayList<>();

    public Plano() {
    }

    public Plano(String nomePlano, Double valorPlano) {
        this.nomePlano = nomePlano;
        this.valorPlano = valorPlano;
    }

    public List<EspecialidadesP> getEspecialidadesPlanos() {
        return especialidadesPlanos;
    }

    public List<NomesClinicas> getNomesClinicas() {
        return nomesClinicas;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do plano: " + this.nomePlano);
        sb.append(" - Valor do plano: R$" + this.valorPlano);
        sb.append(" - Especialidades desse plano: ");
        for (EspecialidadesP ep : especialidadesPlanos) {
            sb.append(ep);
        }
        sb.append(" - Nomes das clinicas que aceitam esse plano: ");
        for (NomesClinicas nc : nomesClinicas) {
            sb.append(nc);
        }
        return sb.toString();
    }
}

/*
Um plano vendido pela empresa tem uma lista de especialidades médicas e uma lista com os nomes
das clínicas e hospitais que aceitam aquele plano. Cada especialidade tem um nome e o percentual de
desconto dado pelo plano.
 */
