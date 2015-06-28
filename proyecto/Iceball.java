import greenfoot.*;

/**
 * La clase iceball o bola de nieve, al igual que la clase fireball es un poder, 
 * al ser seleccionada aparece bolas de nieve que caen y eliminan a los personajes que toque.
 * 
 * @author Irvin Alexis Rodriguez Estrada 
 * @author Irving Gerardo Cardenas Hernadez 
 * 
 * @version (17.15.2015)
 */
public class Iceball extends Actor
{
    private int onetime; //bandera que indica la inicializacion REAL de Y
    private int y;//Cordenada de caida
    private World w;//mundo actual
    final GreenfootImage explosion=new GreenfootImage("expice.png");
    /**
     * Constructor de la clase
     */
    public Iceball()
    {
        onetime=1;
        y=0;
        w=null;
    }
    
    /**
     * Metodo act 
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
     * Metodo que simula la caida del Objecto
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
   
