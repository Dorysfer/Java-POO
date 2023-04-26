/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author Home
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    String ISBN;
    String autor;
    String titulo;
    String paginas;

    public Libro() {
    }

    public Libro(String ISBN, String autor, String titulo, String paginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        
    }

    public void regresarInfo(String ISBN, String autor, String titulo, String paginas)    {
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", autor=" + autor + ", titulo=" + titulo + ", paginas=" + paginas + '}';
    }
   
}
