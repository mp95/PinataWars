import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * La clase vida representa la salud de las torres, la cual al ser atacada disminuye y cambia de color
 * dependiendo del daño que haya recibido e igualmente puede aumentar en ciertos casos.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Vida extends Actor
{
    /**
     * COSNTRUCTOR DE LA CLASE VIDA
     */
    public Vida() 
    {
        GreenfootImage vida = new GreenfootImage(262, 20);
        vida.setColor(Color.GREEN);
        vida.fill();
        setImage(vida);
    }
    
    /**
     * Reduce la vida de cierta torre, su ancho de la figura disminuye (Cambia de color dependiendo del tamaño)
     * 
     * @param dano valor del daño recibido
     * @param vd la imagen actual (Rectangulo) que representa la vida
     * 
     * @return Devuelve un 0 si se disminuyo, un 1 si no
     */
    public int reduceVida(int dano,GreenfootImage vd)
    {
        if(basta(dano,vd)==false)
        {
            int vid=(vd.getWidth())-dano;
            GreenfootImage vida =new GreenfootImage(vid, 20);
            if(vid>176)
            {
                vida.setColor(Color.GREEN);
            }
            else if(vid>88)
            {
                vida.setColor(Color.ORANGE);
            }
            else
            {
                vida.setColor(Color.RED);
            }
            vida.fill();
            setImage(vida);
            return 0;
        }
        else
        {
            vd.clear();
            setImage(vd);
            return 1;
        }
    }
    
    /**
     * Aumenta la vida(ancho) del rectangulo i
     * 
     * @param inc el valor de lo que aumentara
     * @param vid la imagen actual(Rectangulo) que representa la vida
     * 
     * @return Devuelve un 0 si se aumento, un 1 si no
     */
    public int incrementaVida(int inc,GreenfootImage vd)
    {
        if(tope(inc,vd)==false)
        {
            int vid=(vd.getWidth())+inc;
            GreenfootImage vida =new GreenfootImage(vid, 20);
            if(vid>176)
            {
                vida.setColor(Color.GREEN);
            }
            else if(vid>88)
            {
                vida.setColor(Color.ORANGE);
            }
            else
            {
                vida.setColor(Color.RED);
            }
            vida.fill();
            setImage(vida);
            return 0;
        }
        else
        {
            setImage(vd);
            return 1;
        }
        
    }
    
    /**
     * Indica si el daño es mayor al ancho de la imagen
     * 
     * @param dano valor del daño recibido
     * @param vd la imagen actual (Rectangulo) que representa la vida
     * 
     * @return Devuelve un true en caso que si sea mayor y un false en caso contrario
     */
    public boolean basta(int dano,GreenfootImage vd)
    {
        if(vd.getWidth()<=dano)
            return true;
        else
            return false;
    }
    
    /**
     * Indica si ya no se puede aumentar mas a la vida puesto que llego a sui maximo
     * 
     * @param inc valor del incremento recibido
     * @param vd la imagen actual (Rectangulo) que representa la vida
     * 
     * @return Devuelve un true si esta en el tope y un false en su caso contrario
     */
    public boolean tope(int inc,GreenfootImage vd)
    {
        if(vd.getWidth()+inc>262)
          return true;
        else
          return false;
    }
   
}
