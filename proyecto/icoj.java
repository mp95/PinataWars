import greenfoot.*;

/**
 * Este boton inicializa el juego, nos llevara a la pantalla de seleccion de equipo y despues
 * a la pantalla de seleccion de escenario.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class icoj extends Boton
{
    private GreenfootSound music;
    private World mundo2;
    /**
     * Constructor de la clase
     * 
     * @param m1 un archivo de sonido
     */
    public icoj(GreenfootSound m1)
    {
        music=m1;
        mundo2=getWorld();
    }
    
    /**
     * Metodo act heredado de actor
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
            setImage("ICO1.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO1.png");
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
            w=new EscBando(m);
            Greenfoot.setWorld(w);
        } 
    }
}
