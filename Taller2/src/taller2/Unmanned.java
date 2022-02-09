
package taller2;

/**
 * Clase nave no tripulada, esta es una clase que se extiende de la clase nave espacial.
 * @author Dímar Andrey Suárez Hidalgo
 */
public class Unmanned extends SpaceShip{
    /**
     * Hace referencia al objeto de estudio de la nave.
     */
    public String study;
    
    /**
     * Constructor de la clase.
     * @param launchingCountry Hace referencia al pais de lanzamiento de la nave
     * @param name hace referencia al nombre de la nave.
     * @param speed hace referencia a la velocidad de la nave.
     */
    public Unmanned(String launchingCountry, String name, float speed) {
        super(name, speed);
        this.launchingCountry = launchingCountry;
    }

    /**
     * Se sobreescribe el metodo de la clase abstracta
     * @return el objeto de estudio de la nave
     */
    @Override
    public String getStudy() {
        return study;
    }
    
    /**
     * Se sobreescribe el metodo de la clase abstracta
     * @param study hace referencia a el valor de la variable estudio.
     */
    @Override
    public void setStudy(String study) {
        this.study = study;
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
