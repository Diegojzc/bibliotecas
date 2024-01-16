package TokioSchool.domain;

public class Socio {

    private String numeroSocio;
    private String nombre;
    private String apellido;
    private String email;
    private String libroPrestado;


    public Socio(){}

    public Socio(String numeroSocio, String nombre, String apellido, String email, String libroPrestado){
        this.numeroSocio= numeroSocio;
        this.nombre= nombre;
        this.apellido = apellido;
        this.email = email;
        this.libroPrestado = libroPrestado;

    }
    public Socio(String numeroSocio,String nombre, String apellido,String email){
        this.numeroSocio= numeroSocio;
        this.nombre= nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getemail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(String libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public String alquilar(String libro){
       return this.libroPrestado = libro;
    }
    public void devolver(String libro){
        libroPrestado =libro;
    }


    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio='" + numeroSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", libroPrestado='" + libroPrestado + '\'' +
                '}';
    }
}
