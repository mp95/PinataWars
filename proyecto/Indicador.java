import greenfoot.*;
import java.util.*;

/**
 * La clase indicador representa al contenedor de las estrellas que es necesario acumular para
 * utilizar uno de los diversos poderes que se tienen.
 * 
 * @author Irvin Alexis Rodriguez Estrada 
 * @author Irving Gerardo Cardenas Hernadez 
 * 
 * @version (17.15.2015)
 */
public class Indicador extends Actor
{
    private GreenfootImage vacio; 
    private GreenfootImage uno;
    private GreenfootImage dos;
    private GreenfootImage tres;
    private GreenfootImage cuatro;
    private GreenfootImage full;
    private int cantidad;
    /**
     * Constructor de la clase
     */
    public Indicador() 
    {
        vacio=new GreenfootImage("coinsclear.png");
        uno=new GreenfootImage("coinsfull.5.png");
        dos=new GreenfootImage("coinsfull.4.png");
        tres=new GreenfootImage("coinsfull.3.png");
        cuatro=new GreenfootImage("coinsfull.2.png");
        full=new GreenfootImage("coinsfull.png");
        cantidad=0;
    }
    
    /**
     * Indica lo que se hara durante el juego
     */
    public void act()
    {
        if(cantidad>=5)
        {
            World w=getWorld();
            List l1=w.getObjectsAt(405,513,Power.class);
            ((Power)l1.get(0)).activaPower();
        }
    }
    
    /**
     * Aumenta la cantidad en una unidad
     */
    public void aumenta()
    {
        cantidad++;
        if(cantidad==1)
        {
            setImage(uno);
        }
        else if(cantidad==2)
        {
            setImage(dos);
        }
        else if(cantidad==3)
        {
            setImage(tres);
        }
        else if(cantidad==4)
        {
            setImage(cuatro);
        }
        else
        {
            setImage(full);
        }
    }
    
    /**
     * Borra la cantidad (Asigna a cero) y pone a la imagen en un estado original
     */
    public void clear()
    {
        cantidad=0;
        setImage(vacio);
    }
}
