package ejercicio5;

import  spark.Request;
import spark.Response;
import  spark.Route;

public class ConversorHoraController {
    public static Route hora = (Request request, Response response) -> {
        ConversorHora ch = new ConversorHora();
        int segundos = Integer.parseInt(request.queryParams("segundos"));
        return ch.calcularHora(segundos);
    };
}
