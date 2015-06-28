import greenfoot.*;

/**
 * Este objeto es el guerrero intermedio del equipo de la luz
 * se mueve y ataca a sus enemigos; para llevarlo al campo de batalla se 
 * requieren x monedas
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class GuerreroLux2 extends GuerBueno
{
    private GreenfootImage i1=new GreenfootImage("n1.png");
    private GreenfootImage i2=new GreenfootImage("n2.png");
    private GreenfootImage i3=new GreenfootImage("na1.png");
    private GreenfootImage i4=new GreenfootImage("na2.png");
    private GreenfootImage i5=new GreenfootImage("na3.png");
    private int vida;
    private int band;//Selecciona las Imagenes
    private int band2;//Selecciona las Imagenes
    private int band3;//Selecciona las Imagenes
    private int dir;
    private int dineroguerra;
    private int scoreguerra;
    private int cambio;
    /**
     * Constructor de la clase
     * 
     * @param unNum indica donde mirara el Guerrero
     */
    public GuerreroLux2(int unNum)
    {
        if(unNum==1)
        {
            i1.mirrorHorizontally();
            i2.mirrorHorizontally();
            i3.mirrorHorizontally();
            i4.mirrorHorizontally();
            i5.mirrorHorizontally();
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
        vida=75;
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
                setImage(i3);
                band2=1;
            }
            else if(band2==1)
            {
                setImage(i4);
                band2=2;
            } 
            else if(band2==2)
            {
                setImage(i5);
                band2=0;
            } 
            int activa=Greenfoot.getRandomNumber(50);
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
                setImage(i3);
                band3=1;
            }
            else if(band3==1)
            {
                setImage(i4);
                band3=2;
            } 
            else if(band3==2)
            {
                setImage(i5);
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
            i4.mirrorHorizontally();
            i5.mirrorHorizontally();
            dir=-1;
        }
        else
        {
            i1.mirrorHorizontally();
            i2.mirrorHorizontally();
            i3.mirrorHorizontally();
            i4.mirrorHorizontally();
            i5.mirrorHorizontally();
            dir=1;
        }
        cambio=1;
    }
}
