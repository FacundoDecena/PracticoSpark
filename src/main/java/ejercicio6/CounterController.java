package ejercicio6;
import  spark.Request;
import spark.Response;
import  spark.Route;

public class CounterController {
    public static Route contador = (Request request, Response response) -> {
        response.type("application/json");
        Counter c = new Counter();
        String palabra = request.queryParams("palabra");
        try {
            return c.counter(palabra);
        } catch (NullPointerException e){
            return "Parametros invalidos";
        }
    };
}
