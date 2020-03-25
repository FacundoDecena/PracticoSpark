package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class EquipoDAO {
    private List<Equipo> equipoList;

    public void init(){
        equipoList = new ArrayList<>();
        Equipo equipo = new Equipo("Boca");
        Partido partido = new Partido("Gimnasia","Superliga", "Boca 1-0",true);
        equipo.addPartido(partido);

        partido = new Partido("Caracas","Fase de grupos - Libertadores", "Empate 1-1",true);
        equipo.addPartido(partido);

        partido = new Partido("Godoy Cruz","Copa de la Superliga", "Boca 4-1",true);
        equipo.addPartido(partido);

        equipoList.add(equipo);
        //******************************************************************************************\\
        equipo = new Equipo("River");
        partido = new Partido("LDU Quito","Fase de grupos - Libertadores", "LDU Quito 3-0",true);
        equipo.addPartido(partido);

        partido = new Partido("Atletico Tucuman","Superliga", "Empate 1-1",true);
        equipo.addPartido(partido);

        partido = new Partido("Binacional","Fase de grupos - Libertadores", "River 8-0", true);
        equipo.addPartido(partido);
        equipoList.add(equipo);
    }

    public String getResultadosEquipo(String nombre){
        init();
        Gson gson = new Gson();
        Equipo encontrado = equipoList.stream()
                .filter(equipo -> nombre.equalsIgnoreCase(equipo.getNombre()))
                .findAny()
                .orElse(null);
        if (encontrado == null){
            return gson.toJson(equipoList);
        }
        return gson.toJson(encontrado);
    }
}
