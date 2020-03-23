package ejercicio13;

import com.google.gson.Gson;
import ejercicio8.Equipo;

import java.util.ArrayList;
import java.util.List;

public class TorneoDAO {
    Torneo torneo;
    List<Team> equipos;
    List<Partido> partidos;

    public void init(){
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
        Team equipo1 = new Team("Sacachispas", new ArrayList<>(),new ArrayList<>());
        Team equipo2 = new Team("Pelota corazon", new ArrayList<>(),new ArrayList<>());
        Team equipo3 = new Team("La Maquina", new ArrayList<>(),new ArrayList<>());
        Team equipo4 = new Team("Yunque", new ArrayList<>(),new ArrayList<>());
        Team equipo5 = new Team("San Fernando", new ArrayList<>(),new ArrayList<>());
        Team equipo6 = new Team("Estudiantes", new ArrayList<>(),new ArrayList<>());
        Team equipo7 = new Team("Victoria", new ArrayList<>(),new ArrayList<>());
        Team equipo8 = new Team("Juventud", new ArrayList<>(),new ArrayList<>());
        Team equipo9 = new Team("CAI", new ArrayList<>(),new ArrayList<>());
        Team equipo10 = new Team("Olivares", new ArrayList<>(),new ArrayList<>());

        equipos.add(equipo1);equipos.add(equipo2);equipos.add(equipo3);equipos.add(equipo4);equipos.add(equipo5);
        equipos.add(equipo6);equipos.add(equipo7);equipos.add(equipo8);equipos.add(equipo9);equipos.add(equipo10);
        // Eliminatorias \\
        Partido partido = new Partido(equipo1.getNombre(), equipo2.getNombre(), "2 - 1", equipo1.getNombre(), "Eliminatorias", true);
        equipo1.addPartidoJugado(partido);
        equipo2.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo1.getNombre(), equipo3.getNombre(), "3 - 0", equipo1.getNombre(), "Eliminatorias", true);
        equipo1.addPartidoJugado(partido);
        equipo3.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo1.getNombre(), equipo4.getNombre(), "2 - 1", equipo1.getNombre(), "Eliminatorias", true);
        equipo1.addPartidoJugado(partido);
        equipo4.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo1.getNombre(), equipo5.getNombre(), "3 - 1", equipo1.getNombre(), "Eliminatorias", true);
        equipo1.addPartidoJugado(partido);
        equipo5.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo2.getNombre(), equipo3.getNombre(), "3 - 1", equipo2.getNombre(), "Eliminatorias", true);
        equipo2.addPartidoJugado(partido);
        equipo3.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo2.getNombre(), equipo4.getNombre(), "1 - 0", equipo2.getNombre(), "Eliminatorias", true);
        equipo2.addPartidoJugado(partido);
        equipo4.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo2.getNombre(), equipo5.getNombre(), "4 - 1", equipo2.getNombre(), "Eliminatorias", true);
        equipo2.addPartidoJugado(partido);
        equipo5.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo3.getNombre(), equipo4.getNombre(), "4 - 1", equipo3.getNombre(), "Eliminatorias", true);
        equipo3.addPartidoJugado(partido);
        equipo4.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo3.getNombre(), equipo5.getNombre(), "5 - 2", equipo3.getNombre(), "Eliminatorias", true);
        equipo3.addPartidoJugado(partido);
        equipo5.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo4.getNombre(), equipo5.getNombre(), "1 - 0", equipo4.getNombre(), "Eliminatorias", true);
        equipo4.addPartidoJugado(partido);
        equipo5.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo6.getNombre(), equipo7.getNombre(), "1 - 0", equipo6.getNombre(), "Eliminatorias", true);
        equipo6.addPartidoJugado(partido);
        equipo7.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo6.getNombre(), equipo8.getNombre(), "2 - 1", equipo6.getNombre(), "Eliminatorias", true);
        equipo6.addPartidoJugado(partido);
        equipo8.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo6.getNombre(), equipo9.getNombre(), "3 - 1", equipo6.getNombre(), "Eliminatorias", true);
        equipo6.addPartidoJugado(partido);
        equipo9.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo6.getNombre(), equipo1.getNombre(), "4 - 1", equipo6.getNombre(), "Eliminatorias", true);
        equipo6.addPartidoJugado(partido);
        equipo10.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo7.getNombre(), equipo8.getNombre(), "4 - 1", equipo7.getNombre(), "Eliminatorias", true);
        equipo7.addPartidoJugado(partido);
        equipo8.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo7.getNombre(), equipo9.getNombre(), "3 - 1", equipo7.getNombre(), "Eliminatorias", true);
        equipo7.addPartidoJugado(partido);
        equipo9.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo7.getNombre(), equipo1.getNombre(), "2 - 1", equipo7.getNombre(), "Eliminatorias", true);
        equipo7.addPartidoJugado(partido);
        equipo10.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo8.getNombre(), equipo9.getNombre(), "3 - 1", equipo8.getNombre(), "Eliminatorias", true);
        equipo8.addPartidoJugado(partido);
        equipo9.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo8.getNombre(), equipo1.getNombre(), "1 - 0", equipo8.getNombre(), "Eliminatorias", true);
        equipo8.addPartidoJugado(partido);
        equipo10.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo9.getNombre(), equipo1.getNombre(), "1 - 0", equipo9.getNombre(), "Eliminatorias", true);
        equipo9.addPartidoJugado(partido);
        equipo10.addPartidoJugado(partido);
        partidos.add(partido);

        // Cuartos \\
        partido = new Partido(equipo1.getNombre(), equipo6.getNombre(), "6 - 1", equipo1.getNombre(), "Cuartos", true);
        equipo1.addPartidoJugado(partido);
        equipo6.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo2.getNombre(), equipo7.getNombre(), "3 - 0", equipo7.getNombre(), "Cuartos", true);
        equipo2.addPartidoJugado(partido);
        equipo7.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo3.getNombre(), equipo8.getNombre(), "4 - 2", equipo3.getNombre(), "Cuartos", true);
        equipo3.addPartidoJugado(partido);
        equipo8.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo4.getNombre(), equipo9.getNombre(), "3 - 2", equipo9.getNombre(), "Cuartos", true);
        equipo4.addPartidoJugado(partido);
        equipo9.addPartidoJugado(partido);
        partidos.add(partido);

        // Semi-Final \\
        partido = new Partido(equipo1.getNombre(), equipo7.getNombre(), "1 - 0", equipo1.getNombre(), "Semis", true);
        equipo1.addPartidoJugado(partido);
        equipo7.addPartidoJugado(partido);
        partidos.add(partido);

        partido = new Partido(equipo3.getNombre(), equipo9.getNombre(), "5 - 4", equipo3.getNombre(), "Semis", true);
        equipo3.addPartidoJugado(partido);
        equipo9.addPartidoJugado(partido);
        partidos.add(partido);

        // Final \\
        partido = new Partido(equipo1.getNombre(), equipo3.getNombre(), "", null, "Final", false);
        equipo1.addPartidoPorJugar(partido);
        equipo3.addPartidoPorJugar(partido);
        partidos.add(partido);
        torneo = new Torneo(equipos,partidos);
    }

    public String getTorneo(){
        init();
        Gson gson = new Gson();
        return gson.toJson(torneo);
    }

    public String getEquipo(String nombre){
        init();
        Gson gson = new Gson();
        Team equipoEncontrado = equipos.stream()
                .filter(equipo -> equipo.getNombre().equalsIgnoreCase(nombre))
                .findAny()
                .orElse(null);
        if (equipoEncontrado == null)
            return "{\"message\":\"No hay un equipo con ese nombre\"}";
        return gson.toJson(equipoEncontrado);
    }
}
