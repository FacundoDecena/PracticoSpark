package ejercicio11;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class Articulo {
    private String codigo;
    private String descripcion;
    private double precio;
    private double iva;
    private double total;

    public Articulo(String codigo, String descripcion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.iva = precio * 0.21;
        this.total = precio + this.iva;
    }

}
