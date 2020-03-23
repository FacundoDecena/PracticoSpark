package ejercicio13;

import spark.Request;
import spark.Response;
import spark.Route;

public class TorneoController {
    static public Route torneo = (Request request, Response response) -> {
        TorneoDAO t = new TorneoDAO();
        response.type("application/json");
        String nombre = request.queryParams("nombre");
        if (nombre == null)
            return t.getTorneo();
        return t.getEquipo(request.queryParams("nombre"));
    };

}
