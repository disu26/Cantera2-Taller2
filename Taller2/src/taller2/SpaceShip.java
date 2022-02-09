
package taller2;

/**
 * Libreria necesaria para capturar datos.
 */
import java.util.Scanner;

/**
 * Clase nave espacial, esta es una clase abstracta.
 * @author Dímar Andrey Suárez Hidalgo
 */
public abstract class SpaceShip {
    /**
     * Variable para leer entradas por consola.
     */
    Scanner read = new Scanner(System.in);
    /**
     * Representa el país de lanzamiento de la nave.
     */
    public String launchingCountry;
    /**
     * Representa el nombre de la nave.
     */
    public String name;
    /**
     * Representa la velocidad de la nave.
     */
    public float speed;
    
    /**
     * Constructor de la clase.
     * @param name hace referencia al nombre de la nave.
     * @param speed hace referencia a la velocidad de la nave.
     */
    public SpaceShip( String name, float speed) {
        this.launchingCountry = null;
        this.name = name;
        this.speed = speed;
    }
    
    /**
     * Metodo para asignar el valor a la variable estudio,usada por algunas naves.
     * @param study hace referencia al objeto de estudio de la nave.
     */
    public void setStudy(String study){}
    /**
     * 
     * @return el valor de la variable estudio.
     */
    public String getStudy(){
        return null;
    }
    /**
     * Metodo para asignar el valor a la variable misión, usada por algunas naves.
     * @param mision hace referencia al nombre de la misión de la nave.
     */
    public void setMision(String mision){}
    /**
     * 
     * @return El valor de la variable misión.
     */
    public String getMision(){
        return null;
    }
    /**
     * Clase abstracta, que será implementada en los diferentes tipos de nave.
     * @return periodo de actividad de la nave.
     */
    public abstract String activity();
    /**
     * Clase abstracta, que será implementada en los diferentes tipos de nave.
     * @return combustible utilizado por las naves.
     */
    public abstract String fuel();
    
}
