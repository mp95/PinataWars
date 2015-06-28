import greenfoot.*;

/**
 * Esta clase representa a las piñatas guerreras del juego, en la cual se incluye a las
 * subclases de "guermalo" que representa al equipo de la oscuridad,y la subclase "guerbueno",
 * la cual hace referencia al equipo de la luz.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Guerrero extends Actor
{
    private GreenfootImage bum=new GreenfootImage("bum.png");
    /**
     * Proporciona el movimiento de un guerrero
     * 
     * @pram band el bando que pertence
     * @param img1 recibe una imagen
     * @param img2 recibe una Imagen
     * @param dir indica la direcion del movimiento 1 derecha , -1 izquierda
     * 
     * @return debuelve el bando que pertenece true Luz , false obscuridad 
     * 
     */
     public int muevete(int band,GreenfootImage img1,GreenfootImage img2,int dir)
    {
        move(dir);
        if(band<5)
        {
            setImage(img2);
            band++;
        }
        else if(band>=5)
        {
            setImage(img1);
            band++;
            if(band>9)
            band=0;
        }
       return band;
    }
    
    /**
     * Indica si un Objecto est en el borde de la pantalla si lo esta lo elimina
     */
    public void estaAlBorde()
    {
        if(isAtEdge())
        {
            World w=getWorld();
            w.removeObject(this);
        }
    } 
    
    /**
     * provoca la muerte de un determinado guerrero, lo elimina del escenario o mundo
     */
    public void muere()
    {
       setImage(bum);
       Greenfoot.delay(4);
       World w=getWorld();
       w.removeObject(this); 
    }
    
}
