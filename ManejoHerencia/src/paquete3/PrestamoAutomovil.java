
package paquete3;
import paquete2.*;

public class PrestamoAutomovil extends Prestamo {
    public String tipoAutomovil;
    public String marcaAutomovil;
    public Persona garante1;
    public double valorAutomovil;
    public double valorMensualPagoAutomovil;

    public PrestamoAutomovil() {}

    public PrestamoAutomovil(String tipoAutomovil,String marcaAutomovil,Persona garante1,double valorAutomovil,Persona beneficiario,double tiempoMeses,String ciudadPrestamo)
    {
        super(beneficiario,tiempoMeses,ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
    }

    public void calcularValorMensualPagoAutomovil() {
        this.valorMensualPagoAutomovil = (this.valorAutomovil / tiempoMeses) ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "--- Prestamo Automovil: ---\n"+
                "Tipo de automovil = " + tipoAutomovil + "\n" +
                "Marca de automovil = " + marcaAutomovil + "\n" +
                "Garante 1:\n" + 
                garante1.toString() +
                "Valor de automovil: " + valorAutomovil + "\n" +
                "Valor mensual de pago del prestamo del automovil: " + valorMensualPagoAutomovil+ "\n";
   }
}