package TokioSchool;

import TokioSchool.domain.Biblioteca;
import TokioSchool.domain.Socio;
import TokioSchool.domain.SocioVip;

public class Principal {
    public static void main(String[]args){

        Socio socio = new Socio("12523", "paloma", "ahuja", "@com", "null");
        SocioVip socio1 = new SocioVip("54545","diego","zapata", "quijote","jfd54515");
        Biblioteca biblioteca = new Biblioteca("15415121", "escuche","jw","2012");



        socio.alquilar("escuche");


        System.out.println(socio);

    }
}
