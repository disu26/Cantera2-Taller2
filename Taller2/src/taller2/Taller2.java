
package taller2;

/**
 * Libreria necesaria para capturar datos.
 */
import java.util.Scanner;

/**
 * Segundo taller para la cantera nivel dos de Softka university.
 * @author Dímar Andrey Suárez Hidalgo
 */
public class Taller2 {
    
    public static void main(String[] args) {
        /**
         * Variable para leer entradas por consola
         */
        Scanner read = new Scanner(System.in);
        /**
         * Representa el país de lanzamiento de la nave
         */
        String launchingCountry = null;
        /**
         * Representa el nombre de la nave
         */
        String name = null;
        /**
         * Representa la velocidad de la nave
         */
        float speed = 0;
        /**
         * Captura el valor seleccionado del menú
         */
        int option=0;
        /**
         * Representa la creación de la nave, sin constructor
         */
        SpaceShip ship;
        /**
         * El menú se realizó en con un do-while, el cuál se repetirá hasta que
         * se seleccione la opción de salir.
         */
        do {
            /**
             * Impresión del menú
             */
            System.out.println("Seleccione una opción");
            System.out.println("1.Crear Nave Lanzadera");
            System.out.println("2.Crear Nave No Tripulada");
            System.out.println("3.Crear Nave Tripulada Lanzada Por EEUU");
            System.out.println("4.Crear Nave Tripulada");
            System.out.println("0.Salir");
            /**
             * Captura el valor seleccionado del menú.
             */
            option = read.nextInt();
            /**
             * Validación de que sea una opción válida.
             */
            if(option>0 && option <5){
                /**
                 * En la opción 3 no es necesario pedir el pais de lanzamiento de la nave.
                 */
                if(option!=3){
                    /**
                     * Se captura el pais de lanzamiento de la nave
                     */
                    System.out.println("Pais de lanzamiento de la nave");
                    launchingCountry = read.next();
                }
                /**
                 * Se captura el nombre de la nave
                 */
                System.out.println("Nombre de la nave");
                name = read.next();
                /**
                 * Se captura la velocidad de la nave
                 */
                System.out.println("Velocidad de la nave (km/h)");
                speed = read.nextFloat();
                
                /**
                 * Se crea la nave, dependiendo de la opción seleccionada por el usuario
                 */
                switch (option) {
                    /**
                     * Primera opción del menú.
                     */
                    case 1:                    
                        ship = new Shuttle(launchingCountry,name,speed);
                        ship.activity();
                        ship.fuel();
                        break;
                    /**
                     * Segunda opción del menú.
                     */    
                    case 2:
                        String study;
                        ship = new Unmanned(launchingCountry,name,speed);
                        ship.activity();
                        ship.fuel();
                        System.out.println("Objeto de estudio de la nave");
                        study = read.next();
                        ship.setStudy(study);
                        break;
                    /**
                     * Tercera opción del menú.
                     */    
                    case 3:
                        String americanMision;
                        ship = new MannedAmerican(name,speed);
                        ship.activity();
                        ship.fuel();
                        System.out.println("Nombre de la misión de la nave");
                        americanMision = read.next();
                        ship.setMision(americanMision);
                        break;
                    /**
                     * Cuarta opción del menú.
                     */
                    case 4:
                        String mision;
                        ship = new MannedAmerican(name,speed);
                        ship.activity();
                        ship.fuel();
                        System.out.println("Nombre de la misión de la nave");
                        mision = read.next();
                        ship.setMision(mision);
                        break;
                    /**
                     * Opción cero del menú.
                     */    
                    case 0:
                        System.out.println("Saliendo,Gracias por usar la aplicacion");
                        break;
                    default:
                        throw new AssertionError();
                }
            }else System.out.println("Escoja una opción válida");
        } while (option!=0);
        
    }
    
}
