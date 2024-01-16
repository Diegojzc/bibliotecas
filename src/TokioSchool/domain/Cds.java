package TokioSchool.domain;

public class Cds extends Biblioteca{
    private int numeroCancion;
    private String Discografica;

    public Cds(String isbn, String titulo, String autor, String aEdicion, int numeroCancion , String discografica ){
        super(isbn, titulo, autor, aEdicion);
        this.numeroCancion = numeroCancion;
        this.Discografica = discografica;
    }

    public int getNumeroCancion() {
        return numeroCancion;
    }

    public void setNumeroCancion(int numeroCancion) {
        this.numeroCancion = numeroCancion;
    }

    public String getDiscografica() {
        return Discografica;
    }

    public void setDiscografica(String discografica) {
        Discografica = discografica;
    }
}
