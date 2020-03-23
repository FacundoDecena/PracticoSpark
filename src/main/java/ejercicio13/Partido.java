package ejercicio13;

import lombok.Data;

@Data
public class Partido implements Comparable<Partido>{
    private String equipo1, equipo2;
    private String resultado;
    private String ganador;
    private String ronda;
    private boolean jugado;

    public Partido(String equipo1, String equipo2, String resultado, String ganador, String ronda, boolean jugado) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;
        this.ganador = ganador;
        this.ronda = ronda;
        this.jugado = jugado;
    }

    @Override
    public int compareTo(Partido o) {
        if (this.equipo1.equals(o.getEquipo1()) &&
                this.equipo2.equals(o.getEquipo2()) &&
                this.ronda.equals(o.getRonda())
        )
            return 0;

        return 1;
    }
}
