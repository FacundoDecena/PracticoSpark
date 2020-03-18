package ejercicio4;

import  spark.Request;
import spark.Response;
import  spark.Route;

public class CalculadoraControlador {
    public static Route
            sumar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        try{
            int a = Integer.parseInt(request.queryParams("a"));
            int b = Integer.parseInt(request.queryParams("b"));
            return c.sumar(a, b);
        } catch (NumberFormatException e){
            return "Parametros invalidos";
        }

    };
    public static Route
            restar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        try {
            int a = Integer.parseInt(request.queryParams("a"));
            int b = Integer.parseInt(request.queryParams("b"));
            return c.restar(a, b);
        }
        catch (NumberFormatException e){
            return "Parametros invalidos";
        }
    };
}
