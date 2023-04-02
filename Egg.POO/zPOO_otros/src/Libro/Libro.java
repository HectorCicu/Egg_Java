

package Libro;

/**
 *
 * @author Temporal
 */
public class Libro {
    int isbn;
    String titulo;
    String autor;  //atributos
    int nroPag;

    public Libro() { //constructor vacío
    }

    public Libro(int isbn, String titulo, String autor, int nroPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
    }

    public Libro(int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }
    
    public void cargaLibros(){
        System.out.println("\nLibro 4 ISBN: "+ getIsbn() + " - Título: " + 
                getTitulo() + " - Autor: " + getAutor() + " Nro Páginas: " + getNroPag() );
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", nroPag=" + nroPag + '}';
    }
    
    

}
