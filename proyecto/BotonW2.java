import greenfoot.*;

/**
 *Este boton (durante el modo de juego) al presionarse nos genera una pinata guerrera
 *de poder medio.
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class BotonW2 extends Actor
{
    private SimpleTimer timer;
    private boolean botonactivado;
    private GreenfootImage imgact;
    private GreenfootImage imgnoact;
    private int time;//Indica el tiempo de espera
    /**
     * CONSTRUCTOR DE LA CLASE
     * 
     * @param tb el tiempo de espera para su activacion
     */
    public BotonW2(int tb)
    {
        botonactivado=true;
        timer=new SimpleTimer();
        imgact=new GreenfootImage("BtnWarrior2.png"); 
        imgnoact=new GreenfootImage("BtnWarrior2.2.png"); 
        time=tb;
    }
    
    /**
     *  Indica lo que hara el Objecto en la ejecucion
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)&&botonactivado==true)
       {
           botonactivado=false;
           timer.mark();
           setImage(imgnoact);
       }
       if(timer.millisElapsed()>time)
       {
          botonactivado=true; 
          setImage(imgact);
       }
    }
    
     /**
     * Indica si el Boton esta activa o no
     * 
     * @return regresa si esta o no activado el boton
     */
    public boolean estasActivado()
    {
        return botonactivado;
    }  
}
