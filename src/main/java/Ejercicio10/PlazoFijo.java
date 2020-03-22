package Ejercicio10;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class PlazoFijo {
    private double monto;
    private int meses;
    private double intereses;

    public PlazoFijo(double monto, int meses, double intereses){
        this.monto = monto;
        this.meses = meses;
        this.intereses = intereses;
    }

    public String ganancia(){
        Gson gson = new Gson();
        return gson.toJson((meses * intereses / 1200 * monto) + monto);
    }
}
