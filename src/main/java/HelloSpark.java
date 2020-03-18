import ejercicio4.CalculadoraControlador;
import ejercicio1.PalindromoControlador;
import ejercicio2.LongitudControlador;
import ejercicio3.CircunferenciaController;
import ejercicio5.ConversorHoraController;
import ejercicio6.CounterController;
import ejercicio7.FamiliaController;

import static spark.Spark.*;

public class HelloSpark {
    static String doc =
            "Las peticiones tienen el formato: /Metodo?parametros<br><br>" +
                    "<table style=\"width:100%\"><tr><td><b>Metodo</b></th><td><b>Parametros</b></th><td><b>Ejercicio</b></th></tr>" +

                    "<tr><td>hola</td><td>nombre & apellido</td><td>Hola mundo</td></tr>" +

                    "<tr><td>palindromo</td><td>palabra</td><td>Ejercicio 1</td></tr>" +

                    "<tr><td>longitud</td><td>palabra</td><td>Ejercicio 2</td></tr>" +

                    "<tr><td>perimetro</td><td>radio</td><td>Ejercicio 3 - perimetro</td></tr>" +

                    "<tr><td>area</td><td>radio</td><td>Ejercicio 3 - area</td></tr>" +

                    "<tr><td>perimetroyarea</td><td>radio</td><td>Ejercicio 3 - perimetro y area</td></tr>" +

                    "<tr><td>sumar</td><td>a & b </td><td>Ejercicio 4 - suma</td></tr>" +

                    "<tr><td>restar</td><td>a & b </td><td>Ejercicio 4 - resta</td></tr>" +

                    "<tr><td> segundosahoras </td><td> segundos </td><td> Ejercicio 5 </td></tr>" +

                    "<tr><td> contador </td><td> palabra </td><td> Ejercicio 6 </td></tr>" +

                    "<tr><td> todos </td><td>  </td><td> Ejercicio 7 - todos las personas </td></tr>" +

                    "<tr><td> hijos </td><td> nombre </td><td> Ejercicio 7 - Hijos de la persona </td></tr>" +

                    "<tr><td> nietos </td><td> nombre </td><td> Ejercicio 7 - Nietos de la persona </td></tr>" +

                    "<tr><td>  </td><td> </td><td> </td></tr>" +
                    "</table>";


    public static void main(String[] args) {
        get("/", (req, res) -> doc);
        get("/hola", (req, res) -> "Hola Spark " + req.queryParams("nombre") +
                req.queryParams("apellido"));
        get("/palindromo", PalindromoControlador.palindromo);
        get("/longitud", LongitudControlador.longitud);
        get("/perimetro", CircunferenciaController.perimetro);
        get("/area", CircunferenciaController.area);
        get("/perimetroyarea", CircunferenciaController.perimetroyarea);
        get("/sumar", CalculadoraControlador.sumar);
        get("/restar", CalculadoraControlador.restar);
        get("/segundosahoras", ConversorHoraController.hora);
        get("/contador", CounterController.contador);
        get("/todos", FamiliaController.todos);
        get("/hijos", FamiliaController.hijos);
        get("/nietos", FamiliaController.nietos);
    }
}