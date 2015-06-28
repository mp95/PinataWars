import greenfoot.*;

/**
 * Este boton, al presionarlo, nos mostrará la pantalla de "autores".
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Icoau extends Boton
{
    private GreenfootSound music;
    private World mundo2;
    /**
     * CONSTRUCTOR DE LA CLASE
     * 
     * @param m1 musica actual del juego
     */
    public Icoau(GreenfootSound m1)
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
            setImage("ICO3.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO3.png");
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
            w=new AutorFondo(m);
            Greenfoot.setWorld(w);
        } 
    }
}
