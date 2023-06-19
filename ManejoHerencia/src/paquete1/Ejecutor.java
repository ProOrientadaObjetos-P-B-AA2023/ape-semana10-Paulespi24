
package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.InstitucionEducativa;
import paquete4.PrestamoEducativo;


public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Prestamo> lista_prestamos = new ArrayList<>();
        
        boolean repeat  = false;
        while(!repeat){
        System.out.println("+============================================+");
        System.out.println("|             SISTEMA DE PRESTAMO            |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|   1   |  Prestamo Automovil                |");
        System.out.println("|   2   |  Prestamo Educativo                |");
        System.out.println("|   3   |  Salir y Mostar                    |");
        System.out.println("+============================================+");
        System.out.print("- Ingrese el numero de prestamo deseado: ");
        byte op = sc.nextByte();
        
        switch (op){
            case 1:
                System.out.println("--------------------------------------");
                System.out.println("| Postulacion para Prestamo Automovil |");
                 System.out.println("--------------------------------------");
                PrestamoAutomovil prestamoTipo1 = crearObjeto_PrestamoAutomovil(sc);
                prestamoTipo1.setCiudadPrestamo();
                prestamoTipo1.calcularValorMensualPagoAutomovil();
                lista_prestamos.add(prestamoTipo1);
                break;
            case 2:
                System.out.println("--------------------------------------");
                System.out.println("| Postulacion para Prestamo Educativo |");
                System.out.println("--------------------------------------");
                PrestamoEducativo prestamoTipo2 = crearObjeto_PrestamoEducativo(sc);
                prestamoTipo2.setCiudadPrestamo();
                prestamoTipo2.calcularValorMensualPago();
                lista_prestamos.add(prestamoTipo2);
                break;
            case 3:
                System.out.println("programa terminado...");
                //recorro la lista
                int n=1;
                for(Prestamo p : lista_prestamos) {
                    System.out.println("--------------------------------------");
                    System.out.println("|           PRESTAMO "+n+":             |");
                    System.out.println("--------------------------------------");
                    System.out.println(p.toString() );
                    n++;
                } 
                repeat = true;
                break;
                
            default:
                System.err.println("ERROR!");
                System.out.println("Opcion No Valida");
                break;
        }
       
        } 
    }
    
    public static PrestamoAutomovil crearObjeto_PrestamoAutomovil (Scanner teclado){
        //Persona y Prestamo
        System.out.println("INGRESE DATOS DEL BENEFICIARIO");
        teclado.nextLine();
        System.out.print("Nombre: "); String nombreB = teclado.nextLine();
        System.out.print("Apellido: "); String apellidoB = teclado.nextLine();
        System.out.print("Username: "); String userNameB = teclado.nextLine();
        Persona beneficiario = new Persona(nombreB, apellidoB, userNameB);
        System.out.print("Ingrese el Tiempo de prestamo en meses: "); double meses = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingrese la Ciudad del prestamo: "); String ciudad = teclado.nextLine();
        //Prestamo new = Prestamo(beneficiario, meses, ciudad);
        //PERSONA
        System.out.println("INGRESE DATOS DEL GARANTE 1"); 
        System.out.print("Nombre: "); String nombreG = teclado.nextLine();
        System.out.print("Apellido: "); String apellidoG = teclado.nextLine();
        System.out.print("Username: "); String userNameG = teclado.nextLine();
        Persona garante1 = new Persona(nombreG, apellidoG, userNameG);
        
        //PrestamoAutomovil
        System.out.println("INGRESE DATOS DEL AUTOMOVIL");
        System.out.print("Tipo: "); String tipoAutomovil = teclado.nextLine();
        System.out.print("Marca :"); String marcaAutomovil = teclado.nextLine();
        System.out.print("Valor del Automovil: "); double valorAutomovil = teclado.nextDouble();
        return new PrestamoAutomovil (tipoAutomovil, marcaAutomovil, garante1, valorAutomovil,beneficiario, meses, ciudad);
    }
    
    public static PrestamoEducativo crearObjeto_PrestamoEducativo(Scanner teclado){
        //PersonaBeneficiaria y Prestamo
        System.out.println("INGRESE DATOS DEL BENEFICIARIO");
        teclado.nextLine();
        System.out.print("Nombre: "); String nombreB = teclado.nextLine();
        System.out.print("Apellido: "); String apellidoB = teclado.nextLine();
        System.out.print("Username: "); String userNameB = teclado.nextLine();
        Persona beneficiario = new Persona(nombreB, apellidoB, userNameB);
        
        System.out.print("Ingrese el Tiempo de prestamo en meses: "); double meses = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingrese la Ciudad del prestamo: "); String ciudad = teclado.nextLine();
        //PrestamoEducativo
        System.out.print("Nivel de Estudio: "); String nivelEstudio = teclado.nextLine();
        System.out.print("Valor de la carrera: "); double valorCarrera = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("INGRESE DATOS DEL CENTRO EDUCATIVO");
        System.out.print("Nombre:"); String nombreC = teclado.nextLine();
        System.out.print("Siglas:"); String siglasC = teclado.nextLine();
        InstitucionEducativa centroEducativo = new  InstitucionEducativa (nombreC,siglasC);
        return new PrestamoEducativo(nivelEstudio, centroEducativo, valorCarrera, beneficiario, meses, ciudad);
     }
}