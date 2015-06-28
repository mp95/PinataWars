import greenfoot.*;

/**
 * Este boton aparece al final del juego, en la pantalla que muestra el puntaje obtenido,
 * al presionarse nos regresara¡ a la pantalla de seleccion de escenario.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class BotonMenu extends Actor
{
    private GreenfootSound musica; 
    private World w;
    private Jugador jug;
    private Enemigo ene;
    
    /**
     * CONSTRUCTOR DE LA CLASE
     * 
     * @param m musica actual
     * @param j el objecto jugador que contiene la imformacion del mismo
     */
    public BotonMenu(GreenfootSound m,Jugador j)
    {
        musica=m;
        w=getWorld();
        jug=j;
        ene=new Enemigo();
        if(jug.getBando()==true)
        {
            ene.setBando(false);
        }
        else
        {
            ene.setBando(true);
        }
    }
    
    /**
     * indica que se hara en la ejecion
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            w=new EscogeE1(1,5,musica,jug,ene);
            Greenfoot.setWorld(w);
        }
    }    
}
