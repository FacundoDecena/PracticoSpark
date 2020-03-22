package ejercicio8;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Equipo {
    private String nombre;
    private List<Partido> partidos;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.partidos = new ArrayList<>();
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }
}

@Data
class Partido{
    private String rival;
    private String torneo;
    private String resultado;
    private boolean jugado;

    public Partido(String rival, String torneo, String resultado, boolean jugado) {
        this.rival = rival;
        this.torneo = torneo;
        this.resultado = resultado;
        this.jugado = jugado;
    }
}
