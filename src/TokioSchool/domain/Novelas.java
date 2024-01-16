package TokioSchool.domain;

public class Novelas extends Biblioteca{

    private String resumen;
    private String numeroPaginas;

    public Novelas(String isbn, String titulo, String autor, String aEdicion,String numeroPaginas) {
        super(isbn, titulo, autor, aEdicion);
        this.numeroPaginas = numeroPaginas;
    }

    public Novelas(String resumen) {
        super();
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Novelas{" +
                "resumen='" + resumen + '\'' +
                ", numeroPaginas='" + numeroPaginas + '\'' +
                '}';
    }
}
