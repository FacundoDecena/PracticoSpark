package ejercicio9;

import lombok.Data;

@Data
public class Telefono {
    private String nombre;
    private int numero;

    public Telefono(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }

}
