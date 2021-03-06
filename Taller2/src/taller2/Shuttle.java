
package taller2;

/**
 * Clase nave lanzadera, esta es una clase que se extiende de la clase nave espacial.
 * @author Dímar Andrey Suárez Hidalgo
 */
public class Shuttle extends SpaceShip {
    /**
     * Constructor de la clase.
     * @param launchingCountry Hace referencia al pais de lanzamiento de la nave
     * @param name hace referencia al nombre de la nave.
     * @param speed hace referencia a la velocidad de la nave.
     */
    public Shuttle(String launchingCountry, String name, float speed) {
        super(name, speed);
        this.launchingCountry = launchingCountry;
    }
    
    /**
     * Implementación del metodo abstracto actividad.
     * @return periodo de actividad de la nave.
     */
    @Override
    public String activity() {
        System.out.println("Año de lanzamiento");
        String start = read.next();
        System.out.println("Año de cese de funcionamiento (si sigue funcionando, se escribe 'actualidad')");
        String end = read.next();
        return "Actividad desde"+start+"Hasta"+end;
    }

    /**
     * Implementacion del metodo abstracto combustible.
     * @return combustible utilizado por la nave.
     */
    @Override
    public String fuel() {
        System.out.println("Combustible de la nave");
        String fuel = read.next();
        return "Esta nave usaba/usa"+fuel+"como combustible";
    }
    
}
