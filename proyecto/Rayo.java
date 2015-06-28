import greenfoot.*;

/**
 * Clase rayo se ocupa cuando se invoca al Ovni y es para matar a los guerreros 
 * durante la ejecucion del mismo.
 * 
 * @author Irvin Alexis Rodriguez Estrada 
 * @author Irving Gerardo Cardenas Hernadez 
 * 
 * @version (17.15.2015)
 */
public class Rayo extends Actor
{
    private int onetime; //Bandara que inicializa la posiscion de Y
    private int y;//variable que guarda la posicision actual de Y
    private World w;//Variable que guarda el mundo actual
    final GreenfootImage explosion=new GreenfootImage("expfire.png");/*costante que guarda la imagen
    de explosion*/
    /**
     * Constructor de la clase rayo 
     */
    public Rayo()
    {
        onetime=1;
        y=0;
        w=null;
    }
    
    /**
     * Indica lo que se hara en el proceso del juego
     */
    public void act() 
    {
        if(y<405)
        caida();
        if(y==404)
        {
            setImage(explosion);
            Greenfoot.delay(1);
            w=getWorld();
            w.removeObject(this);
        }
    } 
    
    /**
     * Genera el Movimiento de caida del rayo
     */
    public void caida()
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
  

