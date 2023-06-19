
package paquete2;
public class Prestamo {
    public Persona beneficiario;
    public double tiempoMeses;
    public String ciudadPrestamo;

    public Prestamo() {}

    public Prestamo(Persona beneficiario, double tiempoMeses, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoMeses = tiempoMeses;
        this.ciudadPrestamo = ciudadPrestamo;
    }

  

    public void setCiudadPrestamo() {
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    @Override
    public String toString() {
        return "-- Beneficiario: --\n" + 
                beneficiario.toString() +
                "Tiempo de prestamo en meses = " + tiempoMeses + "\n" +
                "Ciudad del prestamo = " + ciudadPrestamo + "\n";
}   

}

