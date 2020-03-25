package ejercicio8;

import spark.Request;
import spark.Response;
import spark.Route;


public class EquipoController {
    static public Route partidos = (Request request, Response response) -> {
        EquipoDAO t = new EquipoDAO();
        response.type("application/json");
        String nombre = request.queryParams("nombre");
        try {
            return t.getResultadosEquipo(nombre);
        } catch (NullPointerException e){
            return "{\"message\": \"Parametros invalidos\"}";
        }
    };
}
