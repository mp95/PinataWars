import greenfoot.*;

/**
 * Clase abstracta que guarda todos lo metodos que se haran en sus respectivos Objectos 
 * del tipo bton de forma mas individual
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public abstract class Boton extends Actor
{
    /**
     * Cuando el Mause se encuentra sobre el Objecto
     * @param w el mundo donde se encuentra el Objecto
     */
    abstract public void mouseSobreObjecto(World w);
    
    /**
     * Cuando se hizo click en el objecto y hace una transicion del mundo
     * @param m la musica que se escucha el el momento
     * @param w el mundo donde se encuentra el objecto
     */
    abstract public void cambiaMundo(GreenfootSound m, World w);
}
