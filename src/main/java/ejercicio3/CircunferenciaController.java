package ejercicio3;

import  spark.Request;
import spark.Response;
import  spark.Route;

public class CircunferenciaController {
    public static Route perimetro = (Request request, Response response) -> {
        try {
            int radio = Integer.parseInt(request.queryParams("radio"));
            Circunferencia c = new Circunferencia();
            return c.perimetro(radio);
        } catch (NumberFormatException e){
            return "Parametros invalidos";
        }
    };
    public static Route area = (Request request, Response response) -> {
        try {
            int radio = Integer.parseInt(request.queryParams("radio"));
            Circunferencia c = new Circunferencia();
            return c.area(radio);
        } catch (NumberFormatException e){
            return "Parametros invalidos";
        }

    };
    public static Route perimetroyarea = (Request request, Response response) -> {
        try{
            int radio = Integer.parseInt(request.queryParams("radio"));
            String res;
            Circunferencia c = new Circunferencia();
            res = "Perimetro: "+String.valueOf(c.perimetro(radio)) + "<br>Area: " + String.valueOf(c.area(radio));
            return res;
        } catch (NumberFormatException e){
            return "Parametros invalidos";
        }
    };
}
