
package nombreapellido;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
//String cosas = new String(Alberto, Perez);
public class NombreApellido {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Introduce el nombre:  ");
        String nombre = ent.nextLine();
        System.out.println("Introduce los apellidos: ");
        String apellidos = ent.nextLine();
        System.out.println("Tu nombre y apellidos son: " + nombre + " " + apellidos);
        
    }
    
}
