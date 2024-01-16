package TokioSchool.domain;

public class Biblioteca {
    private String isbn;
    private String titulo;
    private String autor;
    private String aEdicion;


    public Biblioteca(String isbn, String titulo, String autor, String aEdicion){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.aEdicion = aEdicion;


    }

    public Biblioteca() {

    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }


    public String getaEdicion() {
        return aEdicion;
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", aEdicion='" + aEdicion + '\'' +
                '}';
    }
}
