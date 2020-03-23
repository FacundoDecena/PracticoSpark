package ejercicio13;

import lombok.Data;

import java.util.List;

@Data
public class Torneo {
    private List<Team> equipos;
    private List<Partido> partidos;

    public Torneo(List<Team> equipos, List<Partido> partidos) {
        this.equipos = equipos;
        this.partidos = partidos;
    }
}
