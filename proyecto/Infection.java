import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Infection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Infection extends Actor
{
    /**
     * METODO: Elimina a todo los personajes del Juego a causa de una infeccion mortal
     * 
     * @param w es el mundo donde se enuentran los personajes
     */
    public void eliminaTodos(World w)
    {
        List<Guerrero> guerreros=w.getObjects(Guerrero.class);
        if(guerreros.isEmpty()==false)
        {
            for(Guerrero guer:guerreros)
            {
                guer.muere();
            }
        }
    }
}
