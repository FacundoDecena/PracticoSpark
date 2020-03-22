package ejercicio11;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class Articulo {
    private String codigo;
    private String descripcion;
    private double precio;

    public Articulo(String codigo, String descripcion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getData(){
        Gson gson = new Gson();
        String ret = gson.toJson(this.descripcion);
        ret += gson.toJson(this.precio);
        double iva = this.precio * 0.21;
        double total = this.precio + iva;
        ret += gson.toJson(iva);
        ret += gson.toJson(total);
        return ret;
    }
}
