package TokioSchool.domain;

public class SocioVip extends Socio{

    private String numeroTarjeta;

    public SocioVip(String numeroSocio, String nombre, String apellido, String libroPrestado, String numeroTarjeta) {
        super(numeroSocio, nombre, apellido, libroPrestado);
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return "SocioVip{"+"nombre='"+ getNombre() + '\'' +"numero de Tarjeta='" + numeroTarjeta + '\'' + '}';
    }
}
