import greenfoot.*;

/**
 * La clase ovni es un poder, la cual nos aparece un ovni sobrevolando a los personajes
 * este ovni tiene la funcion de atacar a los personajes, lanzándoles un rayo (esfera verde).
 * 
 * @author Irvin Alexis Rodriguez Estrada 
 * @author Irving Gerardo Cardenas Hernadez 
 * 
 * @version (17.15.2015)
 */
public class Ovni extends Actor
{
    private int primeravuelta;
    private int segundavuelta;
    private int terceravuelta;
    private int finvuelta;
    private SimpleTimer timerayo;
    
    /**
     * Constructor de la Clase
     * 
     */
    public Ovni()
    {
        primeravuelta=1;
        segundavuelta=0;
        terceravuelta=0;
        finvuelta=0;
        timerayo=new SimpleTimer();
    }

    public void act() 
    {
        Rayo ray=new Rayo();
        World w=getWorld();
        if(timerayo.millisElapsed()>6000)
        {
           w.addObject(ray,getX(),getY()+61);
           timerayo.mark();
        }
        if(primeravuelta==1)
        {
            move(1);
            if(getX()==657)
            {
                primeravuelta=0;
                segundavuelta=1;
            }
        } 
        if(segundavuelta==1)
        {
            move(-1);
            if(getX()==145)
            {
                segundavuelta=0;
                terceravuelta=1;
            }
        }
        if(terceravuelta==1)
        {
            move(1);
            if(getX()==657)
            {
                terceravuelta=0;
                finvuelta=1;
            }
        }
        if(finvuelta==1)
        {
            w.removeObject(this);
        }
    }
}
