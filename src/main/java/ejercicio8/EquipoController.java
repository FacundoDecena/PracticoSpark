package ejercicio8;

import spark.Request;
import spark.Response;
import spark.Route;


public class EquipoController {
    static public Route partidos = (Request request, Response response) -> {
        EquipoDAO t = new EquipoDAO();
        response.type("application/json");
        String nombre = request.queryParams("nombre");
        return t.getResultadosEquipo(nombre);
    };
}
