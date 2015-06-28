import greenfoot.*;

/**
Este objeto es el guerrero más fuerte del equipo de la luz
 * se mueve y ataca a sus enemigos; para llevarlo al campo de batalla se 
 * requieren x monedas
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class GuerreroLux3 extends GuerBueno
{
    /**
     * Act - hace lo que GuerreroLux3 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage i1=new GreenfootImage("v1.png");
    private GreenfootImage i2=new GreenfootImage("v2.png");
    private GreenfootImage i3=new GreenfootImage("v3.png");
    private int vida;
    private int band;//Seleciona las Imagenes
    private int band2;//Sleciona las Imagenes
    private int band3;//Sleciona las Imagenes
    private int dir;
    private int dineroguerra;
    private int scoreguerra;
    private int cambio;
    /**
     * Constructor de la clase
     * 
     * @param unNum indica donde mirara el Guerrero
     */
    public GuerreroLux3(int unNum)
    {
        if(unNum==1)
        {
            i1.mirrorHorizontally();
            i2.mirrorHorizontally();
            i3.mirrorHorizontally();
            dir=1;
        }
        else
        {
            dir=-1;
        }
        cambio=0;
        setImage(i1);
        band=0;
        band2=0;
        band3=0;
        vida=100;
        dineroguerra=0;
        scoreguerra=0;
    }

    /**
     * Indica que hara durante el juego
     */
    public void act() 
    {
        if(isTouching(GuerMalo.class))
        {
            if(band2==0)
            {
                setImage(i1);
                band2=1;
            }
            else if(band2==1)
            {
                setImage(i3);
                band2=0;
            } 
            int activa=Greenfoot.getRandomNumber(20);
            if(activa==5)
            {
                dineroguerra=dineroguerra+200;
            }
            vida--;
        }
        else if(isTouching(TorreDark.class))
        {
            if(band3==0)
            {
                setImage(i1);
                band3=1;
            }
            else if(band3==1)
            {
                setImage(i3);
                band3=0;
            } 
            int activa=Greenfoot.getRandomNumber(50);
            if(activa==5)
            {
                scoreguerra=scoreguerra+Greenfoot.getRandomNumber(90);
            }
        }
         else if(isTouching(Iceball.class)||isTouching(Fireball.class)||isTouching(Rayo.class))
        {
            vida=-1;
        }
        else if(isTouching(Tornado.class))
        {
            vida=-1;
        }
        else if(objectoEnFrente(dir)==true&&cambio==0)
        {
            setImage(i1);
        }
        else
        {
            band=muevete(band,i1,i2,dir);
        }
        if(vida<0)
        {
            muere();
        }
        else
        {
            estaAlBorde();
        }
    } 

    /**
     * Devuelve el dinero que tenga durante el juego
     * 
     * @return la cantidad de dinero que tiene
     */
    public int retribulleDinero()
    {
        int dinero=0;
        dinero=dineroguerra;
        dineroguerra=0;
        return dinero;
    }

    /**
     * Devuelve el Score que tenga durante el juego
     * 
     * @return la cantidad de Score que tiene
     */
    public int retribulleScore()
    {
        int score=0;
        score=scoreguerra;
        scoreguerra=0;
        return score;
    }

    /**
     * Cambia la direccion del objecto por la contraria
     */
    public void cambiaDireccion()
    {
        if(dir==1)
        {
            i1.mirrorHorizontally();
            i2.mirrorHorizontally();
            i3.mirrorHorizontally();
            dir=-1;
        }
        else
        {
            i1.mirrorHorizontally();
            i2.mirrorHorizontally();
            i3.mirrorHorizontally();
            dir=1;
        }
        cambio=1;
    }
}
