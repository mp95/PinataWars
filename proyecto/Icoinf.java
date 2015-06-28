import greenfoot.*;

/**
 * Boton que al presionarse nos mostrara la pantalla de ayuda.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Icoinf extends Boton
{
    private GreenfootSound music;
    private World mundo2;
    /**
     * Constructor de la clase
     * 
     * @param m1 un Archivo de sonido
     */
    public Icoinf(GreenfootSound m1)
    {
        music=m1;
        mundo2=getWorld();
    }
    
    /**
     * metodo act heredado de actor
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
            setImage("ICO4.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO4.png");
        }
    }
    
     /**
     * Herado de la clase abstracta Boton si se presiono el objecto con el cursor cambia el 
     * mundo donde se encuentra
     * 
     * @param m musica actual
     * @param w mundo actual
     */
    public void cambiaMundo(GreenfootSound m,World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click.mp3");
            w=new AyudaFondo(m);
            Greenfoot.setWorld(w);
        } 
    }
}
