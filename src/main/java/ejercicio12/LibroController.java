package ejercicio12;

import spark.Request;
import spark.Response;
import spark.Route;

public class LibroController {
    static public Route libros = (Request request, Response response)->{
        LibroDAO l = new LibroDAO();
        response.type("application/json");
        return l.getLibros(request.queryParams("autor"));
    };
}
