import greenfoot.*;

/**
 * Al presionar este boton, nos mostrara la pantalla de puntuaciones
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Icop extends Boton
{
    private GreenfootSound music;
    private World mundo2;
    /**
     * CONSTRUCTOR DE LA CLASE
     * 
     * @param m1 musica actual del juego
     */
    public Icop(GreenfootSound m1)
    {
        music=m1;
        mundo2=getWorld();
    }
    
    /**
     * metodo act heredado de Actor
     */
    public void act() 
    {
        mouseSobreObjecto(mundo2);
        cambiaMundo(music,mundo2);
    }  
    
    /**
     * heredado de la clase abstracta Boton indica si el cursor est sobre el y manda una respuesta visual
     * 
     * @param w mundo actual
     */
    public void mouseSobreObjecto(World w)
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage("ICO2.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO2.png");
        }
    }
    
     /**
     * heredado de la clase abstracta Boton indica si el cursor est sobre el y manda una respuesta visual
     * 
     * @param w mundo actual
     */
    public void cambiaMundo(GreenfootSound m,World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click.mp3");
            w=new PuntFondo(m);
            Greenfoot.setWorld(w);
        } 
    }
}
