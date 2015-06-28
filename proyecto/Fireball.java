import greenfoot.*;

/**
 * La clase fireball o bola de fuego, es un poder, el cual hace que lsa bolas de fuego
 * se desplacen hacia abajo dañando a todos los personajes que toque.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenas Hernadez 
 * 
 * @version (17.15.2015)
 */
public class Fireball extends Actor
{
    private int onetime;//bandera que indica la inicializacion REAL de Y
    private int y;//Cordenada de caida
    private World w;//mundo actual
    final GreenfootImage bola1=new GreenfootImage("fireball1.png");
    final GreenfootImage bola2=new GreenfootImage("fireball.png");
    final GreenfootImage bola3=new GreenfootImage("fireball2.png");
    final GreenfootImage explosion=new GreenfootImage("expfire.png");
    private int cambio;//bandera que sincroniza el cambio de imagen
    
    /**
     * Constructor de la clase
     */
    public Fireball()
    {
        onetime=1;
        y=0;
        w=null;
        cambio=0;
    }
    
    /**
     * Metodo act 
     */
    public void act() 
    {
        if(y<405)
        caida();
        
        if(cambio==0)
        {
            setImage(bola1);
            cambio=1;
        }
        else if(cambio==1)
        {
            setImage(bola2);
            cambio=2;
        }else
        {
            setImage(bola3);
            cambio=0;
        }
        
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
