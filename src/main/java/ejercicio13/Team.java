package ejercicio13;

import lombok.Data;

import java.util.List;

@Data
public class Team implements Comparable<Team>{
    private String nombre;
    private List<Partido> partidosJugados;
    private List<Partido> partidosPorJugar;

    public Team(String nombre, List<Partido> partidosJugados, List<Partido> partidosPorJugar){
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.partidosPorJugar = partidosPorJugar;
    }

    public void addPartidoJugado(Partido partidoJugado){
        this.partidosPorJugar.remove(partidoJugado);
        this.partidosJugados.add(partidoJugado);
    }

    public void addPartidoPorJugar(Partido partido){
        this.partidosPorJugar.add(partido);
    }

    @Override
    public int compareTo(Team o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
