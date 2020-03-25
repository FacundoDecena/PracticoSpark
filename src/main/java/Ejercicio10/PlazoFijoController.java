package Ejercicio10;

import spark.Response;
import spark.Request;
import spark.Route;

public class PlazoFijoController {
    static public Route plazoFijo = (Request request, Response response) -> {
        response.type("application/json");
        try{
            double monto = Double.parseDouble(request.queryParams("monto"));
            int plazo = Integer.parseInt(request.queryParams("plazo"));
            double interes = Double.parseDouble(request.queryParams("interes"));
            PlazoFijo pf = new PlazoFijo(monto, plazo, interes);
            return pf.ganancia();
        } catch (NumberFormatException | NullPointerException e){
            return ("{\"message\": \"Parametros invalidos\"}");
        }

    };
}
