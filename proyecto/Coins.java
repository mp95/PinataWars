import greenfoot.*;
import java.util.*;

/**
 *Esta clase son las monedas que permiten acceder a los poderes durante el juego
 *la monedas caeran y el jugador las atrapara dando click sobre ellas
 * 
 * @author Irvin Alexis Rodriguez Estrada 
 * @author Irvin Gerardo Cardenaz Hernandez
 * @version (17.05.2015)
 */
public class Coins extends Actor
{
    private int onetime;//bandera que Inicializa con el valor actual del Objeto la veriable Y 
    private int y;//Guarda el valor de Y del objecto
    private World w;//El mundo donde se encuentra el Objecto
    private List l1;//Una lista donde se guardara el Objecto(s) Indicador
    /**
     * Constructor de Coins
     */
    public Coins()
    {
        onetime=1;
        y=0;
        w=null;
        l1=null;
    }
    
    /**
     * el metodo que se llame e indica que se hara durante el juego
     */
    public void act() 
    {
        if(y<405)
        muevete();
        
        
        if(Greenfoot.mouseClicked(this))
        {
            w=getWorld();
            l1=w.getObjectsAt(601,563,Indicador.class);
            ((Indicador)l1.get(0)).aumenta();
            w.removeObject(this);
        }
    } 
    /**
     * Indica el movimiento de caida durante el juego
     */
    public void muevete()
    {
         if(onetime==1)
        {
            y=getY();
            onetime=0;
        }
        setLocation(getX(),y);
        y++;
    }
}
