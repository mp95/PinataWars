import greenfoot.*;
import java.util.*;

/**
 * Subclase correspondiente a los guerreros del equipo de la luz.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public abstract class  GuerBueno extends Guerrero
{
    /**
     * Indica si un Guerrero este enfrente de otro 
     * 
     * @param dir direccion donde mira el Objecto
     * 
     * @return devuelve false si no hay guerrero , true si lo hay
     */
    public boolean objectoEnFrente(int dir)
    {
        if(dir>0)
        {
          List l1=this.getObjectsAtOffset(40,0,GuerBueno.class);
          if(l1.isEmpty()==false)
             return true;
            else
             return false;
        }
        else
        {
          List l1=this.getObjectsAtOffset(-40,0,GuerBueno.class);
          if(l1.isEmpty()==false)
             return true;
            else
             return false;  
        }
    }
    
    /**
     * Devuelve el dinero que tenga durante el juego
     * 
     * @return la cantidad de dinero que tiene
     */
    abstract public int retribulleDinero();
    
    /**
     * Devuelve el Score que tenga durante el juego
     * 
     * @return la cantidad de Score que tiene
     */
    abstract public int retribulleScore();
    
    /**
     * Cambia la direccion del objecto por la contraria
     */
    abstract public void cambiaDireccion();
}
