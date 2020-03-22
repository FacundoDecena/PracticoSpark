package ejercicio11;

import spark.Request;
import spark.Response;
import spark.Route;

public class ArticuloController {
    static public Route articulo = (Request request, Response response) -> {
        response.type("application/json");
        ArticuloDAO a = new ArticuloDAO();
        return a.getProduct(request.queryParams("codigo"));
    };
}
