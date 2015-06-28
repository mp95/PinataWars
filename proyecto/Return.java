import greenfoot.*;

/**
 * Esta Clase RETURN sirve para regresar al inicio del Juego
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Return extends Boton
{
    private GreenfootSound music;
    private World mundo2;
    /**
     * COSTRUCTOR DE LA CLASE
     * 
     * @param m1 un sonido o musica actual del juego
     */
    public Return(GreenfootSound m1)
    {
        music=m1;
        mundo2=getWorld();
    }
    /**
     * Metodo act heredado de la clase actor
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
            setImage("Return.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("Return.png");
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
            w=new Inicio(m);
            Greenfoot.setWorld(w);
        } 
    }
}
