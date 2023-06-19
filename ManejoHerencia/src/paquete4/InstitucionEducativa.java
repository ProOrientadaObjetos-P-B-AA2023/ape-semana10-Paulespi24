package paquete4;

public class InstitucionEducativa{
    public String nombre;
    public String siglas;

    public InstitucionEducativa() {}
    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }
    
    @Override
    public String toString() {
        return siglas + "\nNombre = " + nombre + 
                "\nSiglas = " + siglas;
    }
 
}