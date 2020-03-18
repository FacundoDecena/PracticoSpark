package ejercicio1;

import  spark.Request;
import spark.Response;
import  spark.Route;

public class PalindromoControlador {
    public static Route palindromo = (Request request, Response response) -> {
        try {
            Palindromo pc = new Palindromo();
            String palabra = request.queryParams("palabra");
            return pc.isPalindromo(palabra);
        } catch (NullPointerException e){
            return "Parametros invalidos";
        }
    };
}
