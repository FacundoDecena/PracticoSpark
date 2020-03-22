package ejercicio11;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ArticuloDAO {
    List<Articulo> articulos;

    public void init(){
        articulos = new ArrayList<>();
        articulos.add(new Articulo("0001-a", "Articulo 1", 105.50));
        articulos.add(new Articulo("0001-b", "Articulo 2", 245.3));
        articulos.add(new Articulo("0021-a", "Articulo 3", 175));
        articulos.add(new Articulo("0003-a", "Articulo 4", 190));
        articulos.add(new Articulo("0005-a", "Articulo 5", 85.50));
        articulos.add(new Articulo("0006-a", "Articulo 6", 99.99));
        articulos.add(new Articulo("0023-a", "Articulo 7", 250.50));
        articulos.add(new Articulo("2141-a", "Articulo 8", 560.50));
        articulos.add(new Articulo("0231-a", "Articulo 9", 320));
        articulos.add(new Articulo("0051-a", "Articulo 10", 410));
        articulos.add(new Articulo("0085-a", "Articulo 11", 420.50));
        articulos.add(new Articulo("0023-a", "Articulo 12", 16.99));
    }

    public String getProduct(String codigo){
        init();
        Gson gson = new Gson();
        if (codigo == null){
            return gson.toJson(articulos);
        } else {
            Articulo a = articulos.stream()
                        .filter(articulo -> codigo.equalsIgnoreCase(articulo.getCodigo()))
                        .findAny()
                        .orElse(null);
            if (a == null){
                return "{\"message\":\"Codigo invalido\"}";
            } else {
                return gson.toJson(a);
            }
        }

    }
}
