package ejercicio9;

import spark.Request;
import spark.Response;
import spark.Route;

public class TelefonoController {
    static public Route telefonos = (Request request, Response response)->{
        TelefonoDAO t = new TelefonoDAO();
        response.type("application/json");
        String nombre = request.queryParams("nombre");
        try {
            return t.numeroFromNombre(nombre);
        } catch (NullPointerException e){
            return "{\"message\": \"Parametros invalidos\"}";
        }
    };
}
