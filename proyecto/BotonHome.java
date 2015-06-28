import greenfoot.*;

/**
 * El boton "home" al presionarse nos regresa a la pantalla del incio del juego.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class BotonHome extends Actor
{
    /**
     * Act - hace lo que BotonHome quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootSound musica;
    private World w;
    /**
     * CONSTRUCTOR DE LA CLASE
     * 
     * @param m el archivo de musica actual
     */
    public BotonHome(GreenfootSound m) 
    {
        musica=m;
        w=getWorld();
    }
    
    /**
     * Indica que se hara durante la ejecucion
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
           cambiaMundo();
        }
    }
    
    /**
     * cambia el mundo en este caso al inicio del juego
     */
    public void cambiaMundo()
    {
         w=new Inicio(musica);
         Greenfoot.setWorld(w);
    }
}
