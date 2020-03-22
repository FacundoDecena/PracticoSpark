package ejercicio12;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    private List<Libro> libros;

    public void init(){
        libros = new ArrayList<>();

        libros.add(new Libro("Javier Castillo","9788491292661","La chica de nieve"));
        libros.add(new Libro("Javier Castillo","9788466346122","El dia que se perdio la cordura"));
        libros.add(new Libro("Javier Castillo","9788491292180","Todo lo que sucedio con Miranda Huff"));
        libros.add(new Libro("Santiago Posteguillo","9788408224693","Y julia reto a los dioses"));
        libros.add(new Libro("Santiago Posteguillo","9788413141466","La traicion de Roma"));
        libros.add(new Libro("Elisabet Benavent","9788491291916","Un cuento perfecto"));
        libros.add(new Libro("Juan Gomez-Jurado","9788491291916","Reina Roja"));
        libros.add(new Libro("Juan Gomez-Jurado","9788466666497","Loba Negra"));
    }

    public String getLibros(String autor){
        init();
        Gson gson = new Gson();
        List<Libro> librosDelAutor = new ArrayList<>();
        if (autor != null) {
            for (Libro libro : libros) {
                if (libro.getAutor().equalsIgnoreCase(autor))
                    librosDelAutor.add(libro);
            }
            if (librosDelAutor.isEmpty())
                return "{\"message\": \"dicho autor no tiene libros cargados\"}";
            return gson.toJson(librosDelAutor);
        }
        return gson.toJson(libros);
    }
}
