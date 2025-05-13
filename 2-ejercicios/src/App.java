import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Condiciones/Bucles");
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Que edad tienes ?");
        int edad = teclado.nextInt();

        if (edad >= 6 && edad <= 13) {
            System.out.println("Estás en primaria");
        }else if (edad >= 14 && edad <= 18) {
            System.out.println("Estas en secundaria");
        }else if (edad >=19 && edad <= 27){
            System.out.println("Estas en la universidad");
        }else if (edad>=28 && edad <=120){
            System.out.println("Estas trabajando");
        }else if(edad < 6 || edad > 120)
        System.out.println("Error vulve a intentar!");
        
        System.out.println(" ");
  // --BUCLE---------------------------------------------------------
       for( int i = 20; i >= 10; i--){
        System.out.println("El cuadrado de " + i + " es -> " + (i*i) );
       }
      
       System.out.println(" ");
       teclado.nextLine();
  // --MEDIA DE EDADES-------------------------------------------------------------
     
       System.out.println("Como se llama tu mama?");
       String MAnombre = teclado.nextLine();
       System.out.println("Que edade tiene?");
       int MAedad = teclado.nextInt();

       teclado.nextLine();

       System.out.println("Como se llama tu papa?");
       String PAnombre = teclado.nextLine();
       System.out.println("Que edad tiene?");
       int PAedad = teclado.nextInt();

       float MediaEdad = (float) MAedad + PAedad / 2;
       System.out.println("Tu madre se llama "+ MAnombre +" y tiene "+ MAedad + " años, y tu padre se llama " + PAnombre + " y tiene " + PAedad + " años, y la media de sus edades es " + MediaEdad);

       teclado.close();
    } 
   
}
//  NOTAS 
// scanner.hasNextInt() control previo del scanner si es entero
// equalsIgnoreCase(“”) para ignorar si son mayusculas

