
package taller2;

/**
 * Clase nave tripulada, esta es una clase que se extiende de la clase nave espacial.
 * @author Dímar Andrey Suárez Hidalgo
 */
public class Manned extends SpaceShip{
    /**
     * Hace referencia al nombre la mision de la nave
     */
    public String mision;

    /**
     * Constructor de la clase.
     * @param launchingCountry Hace referencia al pais de lanzamiento de la nave
     * @param name hace referencia al nombre de la nave.
     * @param speed hace referencia a la velocidad de la nave.
     */
    public Manned(String launchingCountry, String name, float speed) {
        super(name, speed);
        this.launchingCountry = launchingCountry;
    }

    /**
     * Se sobreescribe el metodo de la clase abstracta
     * @return el nombre de la mision de la nave
     */
    @Override
    public String getMision() {
        return mision;
    }

    /**
     * Se sobreescribe el metodo de la clase abstracta
     * @param mision hace referencia al nombre de la mision.
     */
    @Override
    public void setMision(String mision) {
        this.mision = mision;
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
