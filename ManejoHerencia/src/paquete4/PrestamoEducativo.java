package paquete4;
import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo{
    public String nivelEstudio;
    public InstitucionEducativa centroEducativo;
    public double valorCarrera;
    public double valorMensualPagoCarrera;

    public PrestamoEducativo() {}
    public PrestamoEducativo(String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera, Persona beneficiario, double tiempoMeses, String ciudadPrestamo) {
        super(beneficiario,tiempoMeses,ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    
    
    public void calcularValorMensualPago(){
        this.valorMensualPagoCarrera = (this.valorCarrera/ tiempoMeses) - ( (this.valorCarrera/ tiempoMeses) * 0.10 );
    }
    
    @Override
    public String toString() {
        return super.toString()+
                "-- PrestamoEducativo: --\n" +
                "Nivel de Estudio = " + nivelEstudio + "\n"+ 
                "Centro Educativo: " + 
                centroEducativo.toString() + "\n"+ 
                "Valor de la Carrera = " + valorCarrera + "\n"+  
                "Valor Mensual del Pago del prestamo del valor de la carrera = " + valorMensualPagoCarrera + "\n";
   }
}