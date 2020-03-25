import Ejercicio10.PlazoFijoController;
import ejercicio11.ArticuloController;
import ejercicio12.LibroController;
import ejercicio13.TorneoController;
import ejercicio4.CalculadoraControlador;
import ejercicio1.PalindromoControlador;
import ejercicio2.LongitudControlador;
import ejercicio3.CircunferenciaController;
import ejercicio5.ConversorHoraController;
import ejercicio6.CounterController;
import ejercicio7.FamiliaController;
import ejercicio8.EquipoController;
import ejercicio9.TelefonoController;

import static spark.Spark.*;

public class HelloSpark {
    static String doc =
            "Las peticiones tienen el formato: /Metodo?parametros<br><br>" +
                    "<table style=\"width:100%;\">" +
                    "<tr><td><b>Metodo</b></th>" +
                    "<td><b>Parametros</b></th>" +
                    "<td><b>Ejercicio</b></th></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">hola</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">nombre & apellido</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Hola mundo</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">palindromo</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">palabra</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Ejercicio 1</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">longitud</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">palabra</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Ejercicio 2</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">perimetro</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">radio</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Ejercicio 3 - perimetro</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">area</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">radio</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Ejercicio 3 - area</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">perimetroyarea</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">radio</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Ejercicio 3 - perimetro y area</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">sumar</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">a & b </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Ejercicio 4 - suma</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\">restar</td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">a & b </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\">Ejercicio 4 - resta</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> segundosahoras </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> segundos </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 5 </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> contador </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> palabra </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 6 </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> todos </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> - </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 7 - todos las personas </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> hijos </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> nombre </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 7 - Hijos de la persona </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> nietos </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> nombre </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 7 - Nietos de la persona </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> resultados </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> nombre </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 8 </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> telefonos </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> nombre </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 9 </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> plazofijo </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> monto, plazo, interes </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 10</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> articulo </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> codigo </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 11</td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> libro </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> autor </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 12 </td></tr>" +

                    "<tr><td style=\"border-bottom: 1px solid #ddd;\"> torneo </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> nombre </td>" +
                    "<td style = \"border-bottom: 1px solid #ddd\"> Ejercicio 13</td></tr>" +
                    "</table>";


    public static void main(String[] args) {
        get("/", (req, res) -> doc);
        get("/hola", (req, res) -> "Hola Spark " + req.queryParams("nombre") +
                " " + req.queryParams("apellido"));
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
        get("/resultados", EquipoController.partidos);
        get("/telefonos", TelefonoController.telefonos);
        get("/plazofijo", PlazoFijoController.plazoFijo);
        get("/articulo", ArticuloController.articulo);
        get("/libro", LibroController.libros);
        get("/torneo", TorneoController.torneo);
        notFound(
                "<h2>404</h2><br>Visite <a href=http://localhost:4567/>la documentacion</a> para conocer las direcciones" +
                        " disponibles con sus respectivos parametros"
        );
        internalServerError(
                "<h2>505</h2><h3>Error de servidor</h3><br> Le juro profe que en mi computadora andaba"
        );
    }
}