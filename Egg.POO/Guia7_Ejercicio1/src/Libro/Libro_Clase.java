package Libro;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Libro_Clase {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private int isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    public Libro_Clase() {
    }

    public Libro_Clase(int isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
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

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public void cargarDatos() {

        System.out.print("\nIngrese ISBN: ");
        isbn = read.nextInt();
        System.out.print("Título: ");
        titulo = read.next();
        System.out.print("Autor: ");
        autor = read.next();
        System.out.print("Cant. páginas: ");
        nroPaginas = read.nextInt();

    }
    
    public void mostrarDatos(){
        System.out.println("\nISBN.........:" + isbn);
        System.out.println("Título.......: "+ titulo);
        System.out.println("Autor........: " + autor);
        System.out.println("Cant. Páginas: " + nroPaginas);
    }
}
