package TokioSchool.domain;

public class Tebeos extends Biblioteca {

    private String resumen;
    private String personajePrincipal;

    public Tebeos(String isbn, String titulo, String autor, String aEdicion, String resumen, String personajePrincipal) {
        super(isbn, titulo, autor, aEdicion);
        this.resumen = resumen;
        this.personajePrincipal = personajePrincipal;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getPersonajePrincipal() {
        return personajePrincipal;
    }

    public void setPersonajePrincipal(String personajePrincipal) {
        this.personajePrincipal = personajePrincipal;
    }
}
