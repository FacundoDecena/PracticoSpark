package ejercicio9;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class TelefonoDAO {
    private List<Telefono> telefonos;

    public void init(){
        telefonos = new ArrayList<>();
        telefonos.add(new Telefono("Policia", 911));
        telefonos.add(new Telefono("Emergencia medica", 107));
        telefonos.add(new Telefono("Bomberos", 100));
        telefonos.add(new Telefono("Defensa Civil", 103));
        telefonos.add(new Telefono("Emergencia Ambiental", 105));
        telefonos.add(new Telefono("Emergencia Nautica", 106));
        telefonos.add(new Telefono("Asistencia al Suicida", 135));
        telefonos.add(new Telefono("Chicos extraviados", 142));
        telefonos.add(new Telefono("Violencia de genero", 144));
        telefonos.add(new Telefono("Denuncia a violadores de cuarentena", 134));
    }

    public String numeroFromNombre(String nombre){
        init();
        Telefono t = telefonos.stream()
                .filter(telefono -> nombre.equalsIgnoreCase(telefono.getNombre()))
                .findAny()
                .orElse(null);
        Gson gson = new Gson();
        if (t == null)
            return gson.toJson(telefonos);
        return gson.toJson(t.getNumero());
    }
}
