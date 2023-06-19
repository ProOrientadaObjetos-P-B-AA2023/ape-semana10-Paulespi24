
package paquete2;
public class Persona{
    public String nombre;
    public String apellido;
    public String userName; 

    public Persona() {}
    public Persona(String nombre, String apellido, String userName) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" +
                "Apellido = " + apellido + "\n" +
                "Username = " + userName + "\n";
    }
}