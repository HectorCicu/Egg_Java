package Guia7.Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class Libro {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private int isbn;
    private String titulo;
    private String autor;
    private int cantPaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int cantPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
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

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    void altaLibro() {
        System.out.print("\nNro. ISBN: ");
        isbn = read.nextInt();
        System.out.print("Título: ");
        titulo = read.next();
        System.out.print("Autor: ");
        autor = read.next();
        System.out.print("Cant. Páginas: ");
        cantPaginas = read.nextInt();
    }

    void imprime() {
        System.out.println("\nNro ISBN.....: " + isbn);
        System.out.println("Título.....: " + titulo);
        System.out.println("Autor......: " + autor);
        System.out.println("Cant.páginas: " + cantPaginas);
    }
}
