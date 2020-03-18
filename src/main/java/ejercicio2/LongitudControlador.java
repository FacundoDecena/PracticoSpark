package ejercicio2;

import  spark.Request;
import spark.Response;
import  spark.Route;

public class LongitudControlador {
    public static Route longitud = (Request request, Response response) -> {
        try {
            Longitud l = new Longitud();
            String a = request.queryParams("palabra");
            return l.Longitud(a);
        } catch (NullPointerException e){
            return "Parametros invalidos";
        }
    };
}
