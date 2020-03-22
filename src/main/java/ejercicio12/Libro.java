package ejercicio12;

import lombok.Data;

@Data
public class Libro {
    private String autor;
    private String ISBN;
    private String titulo;

    public Libro(String autor, String ISBN, String titulo){
        this.autor = autor;
        this.ISBN = ISBN;
        this.titulo = titulo;
    }

}
