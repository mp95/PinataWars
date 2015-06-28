import greenfoot.*;
import java.util.*;

/**
 * La clase nuclear es un poder, tiene la funcion de que al ser seleccionada
 * elimina a todos los personajes que estén en pantalla durante la ejecución de dicho poder.
 * 
 * @author Irvin Alexis Rodriguez Estrada 
 * @author Irving Gerardo Cardenas Hernadez 
 * 
 * @version (17.15.2015)
 */
public class Nuclear extends Actor
{
    private GreenfootImage img1;
    private GreenfootImage img2;
    private GreenfootImage img3;
    private GreenfootImage img4;
    private GreenfootImage img5;
    private GreenfootImage img6;
    private GreenfootImage img7;
    private GreenfootImage img8;
    private GreenfootImage img9;
    private GreenfootImage img10;
    private int cambio;
    /**
     * CONSTRUCTOR DE CLASE NUCLEAR
     */
    public Nuclear()
    {
        img1=new GreenfootImage("nuke1.png");
        img2=new GreenfootImage("nuke2.png");
        img3=new GreenfootImage("nuke3.png");
        img4=new GreenfootImage("nuke4.png");
        img5=new GreenfootImage("nuke5.png");
        img6=new GreenfootImage("nuke6.png");
        img7=new GreenfootImage("nuke7.png");
        img8=new GreenfootImage("nuke8.png");
        img9=new GreenfootImage("nuke9.png");
        img10=new GreenfootImage("nuke10.png");
        cambio=0;
    }
    
    /**
     * Indica que se hara durante el juego
     */
    public void act() 
    {
        if(cambio==0)
        {
            setImage(img1);
            cambio=1;
        }
        else if(cambio==1)
        {
            setImage(img1);
            cambio=2;
        }
        else if(cambio==2)
        {
            setImage(img3);
            cambio=3;
        }
        else if(cambio==3)
        {
            setImage(img4);
            cambio=4;
        }
        else if(cambio==4)
        {
            setImage(img5);
            cambio=5;
        }
        else if(cambio==5)
        {
            setImage(img6);
            cambio=6;
        }
        else if(cambio==6)
        {
            setImage(img7);
            cambio=7;
        }
        else if(cambio==7)
        {
            setImage(img8);
            cambio=8;
        }
        else if(cambio==8)
        {
            setImage(img9);
            cambio=9;
        }
        else 
        {
            setImage(img10);
            World w=getWorld();
            w.removeObject(this);
            eliminaTodos(w);
        }

    }
    
    /**
     * METODO: Elimina a todo los personajes del Juego
     * 
     * @param w es el mundo donde se enuentran los personajes
     */
    public void eliminaTodos(World w)
    {
        List<Guerrero> guerreros=w.getObjects(Guerrero.class);
        if(guerreros.isEmpty()==false)
        {
            for(Guerrero guer:guerreros)
            {
                guer.muere();
            }
        }
    }
}
