package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class Counter {
    public String counter(String palabra){
        Map<Character, Integer> contador = new HashMap<>();

        for (int i = 0; i < palabra.length(); i++){
            if (contador.containsKey(palabra.charAt(i))){
                contador.replace(palabra.charAt(i), contador.get(palabra.charAt(i))+1);
            } else {
                contador.put(palabra.charAt(i), 1);
            }
        }

        Gson gson = new Gson();

        return gson.toJson(contador);
    }
}
