import greenfoot.*;
import java.awt.*;

/**
 * Esta clase sirve para poner mensejes de texto en el juego y para que 
 * estos puedan ser modificados durante el mismo
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Letrero extends Actor
{
    GreenfootImage texto;
    /**
     * Constructor de la Clase
     * 
     * @param unTexto recibe un texto 
     * @param color recibe un objecto color
     */
    public Letrero(String unTexto,Color color)
    {
        texto=new GreenfootImage(unTexto,34,color,null);
        setImage(texto);
    }
    
    /**
     * Modifica el texto 
     * 
     * @param unTexto recibe un texto 
     * @param color recibe un objecto color
     */
    public void modificaLetrero(String unTexto,Color color)
    {
        texto.clear();
        texto=new GreenfootImage(unTexto,34,color,null);
        setImage(texto);
    }
    
}
