import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Primer Ejercicio");

        Scanner teclado = new Scanner(System.in);
        System.out.println("En que posiscion te encuentras?");
        int posicion = teclado.nextInt();
        // teclado. System.out.println("En el puesto 5, está Alberto García con 20 años");

        // if (teclado.nextInt() == 5 ) {
        //   System.out.println("En el puesto 5, está Alberto García con 20 años");  
        // }
        
        System.out.println("Dime tu nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Dime tu apellido:");
        String apellido = teclado.nextLine();
        System.out.println("Dime tu edad:");
        int edad = teclado.nextInt();
        System.out.println("El/La estudiante " + nombre +" "+ apellido + " tiene " + edad  + " años. Bienvenid@! estas en la posicion "+ posicion);
        teclado.close();
      
    }
}
