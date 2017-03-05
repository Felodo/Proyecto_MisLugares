package daw2.hlc.felix.mislugaresjava;

/**
 * Created by Felix Lozano on 17/01/2017.
 */

public class Complejo {
    //declaración de atributos
    /*private double modulo, fase;
    //declaración de constructor
    public Complejo(double real, double imaginario) {
        modulo = Math.hypot(real, imaginario);
        fase = Math.atan2(imaginario, real);
    }
    //declaración de métodos
    public double getReal() {

        return modulo * Math.cos(fase);
    }
    public void setReal(double real, double imaginario){

        this.fase = Math.atan2(imaginario, real);
    }*/






    //private double real, imaginario;


    //declaración de atributos
    private double real, imaginario;

    //declaración de constructor
    public Complejo(double real, double imaginario)
    { this.real= real; this.imaginario= imaginario; }

    //declaración de métodos /** Transcribe el complejo a String. * @return un string con la parte entera y la imaginaria
    public String toString()
    { return real + "+"+ imaginario + "i"; }

    public void suma(Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }


    public double getReal() {
        return real;
    }
    public void setReal(double real){
        this. real = real;
    }

    public double getImaginario(){
        return imaginario;
    }
    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }


}
