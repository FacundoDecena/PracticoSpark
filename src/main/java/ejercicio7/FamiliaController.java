package ejercicio7;

import spark.Request;
import spark.Response;
import spark.Route;

public class FamiliaController {
    public static Route todos = (Request request, Response response) -> {
        Familia familia = new Familia();
        response.type("application/json");
        return familia.todos();
    };
    public static Route hijos = (Request request, Response response) -> {
        Familia familia = new Familia();
        String nombre = request.queryParams("nombre");
        response.type("application/json");
        return familia.hijos(nombre);
    };
    public static Route nietos = (Request request, Response response) -> {
        Familia familia = new Familia();
        String nombre = request.queryParams("nombre");
        response.type("application/json");
        return familia.nietos(nombre);
    };
}
