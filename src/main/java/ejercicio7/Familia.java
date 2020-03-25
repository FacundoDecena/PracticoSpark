package ejercicio7;

import com.google.gson.Gson;

import java.util.LinkedList;
import java.util.List;

public class Familia {

    List<Persona> familia = new LinkedList<>();
    Familia(){
        List<Persona> h1 = new LinkedList<>();
        List<Persona> h2 = new LinkedList<>();
        List<Persona> h3 = new LinkedList<>();
        Persona juan = new Persona("Juan", null);
        Persona pedro = new Persona("Pedro", null);
        Persona sofia = new Persona("Sofia", null);
        Persona matias = new Persona("Matias", null);
        h1.add(juan);
        h3.add(matias);
        Persona jose = new Persona("Jose", h3);
        h2.add(pedro);h2.add(sofia);h2.add(jose);
        Persona sara = new Persona("Sara", h1);
        Persona beatriz = new Persona("Beatriz", h2);
        Persona amelia = new Persona("Amelia", h3);
        familia.add(juan);familia.add(pedro);familia.add(sofia);familia.add(jose);familia.add(matias);familia.add(sara);
        familia.add(beatriz);familia.add(matias);
    }

    public String todos(){
        Gson gson = new Gson();
        return gson.toJson(familia);
    }

    public String hijos(String nombre){
        Persona p = getPersonaFromNombre(nombre);
        Gson gson = new Gson();
        if (p != null && p.getHijos() != null){
            return gson.toJson(p.getHijos());
        } else {
            return "{\"message\": \"No tiene hijos o parametros invalidos\"}";
        }
    }

    public String nietos(String nombre){
        Persona p = getPersonaFromNombre(nombre);
        Gson gson = new Gson();
        if (p != null && p.getNietos() != null){
            return gson.toJson(p.getNietos());
        } else {
            return "{\"message\": \"No tiene hijos o parametros invalidos\"}";
        }
    }

    private Persona getPersonaFromNombre(String nombre){
        for (Persona persona : familia) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        return null;
    }
}

class Persona{
    private String nombre;
    private List<Persona> hijos;

    Persona(String nombre, List<Persona> hijos){
        this.nombre = nombre;
        this.hijos = hijos;
    }

    public String getNombre(){
        return this.nombre;
    }

    public List<Persona> getHijos(){
        return this.hijos;
    }

    public List<Persona> getNietos(){
        List<Persona> nietos = new LinkedList<>();
        if (this.hijos == null){
            return null;
        }
        this.hijos.forEach(hijo->{
            if (hijo.getHijos() != null)
                nietos.addAll(hijo.getHijos());
        });
        return nietos;
    }

}
