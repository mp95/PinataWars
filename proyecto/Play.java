import greenfoot.*;

/**
 * Este boton aparece en la pantalla de seleccion de escenario,
 * al presionarse se inicializa el juego en el escenario seleccionado.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Play extends Actor
{
    static int MEXICO=1;
    static int USA=2;
    static int FRANCE=3;
    static int EGYPT=4;
    static int JAPAN=5;
    static int BOSQUE=6;
    private GreenfootSound m;//musica inicial del juego
    private int ply;//Indica a que mundo ira
    private Jugador jug;
    private Enemigo ene;
    
    /**
     * CONSTRUCTOR DE LA CLASE
     * 
     * @param m1 archivo actual de musica
     * @param num indica a que mundo ira
     * @param j indica el Objecto jugador
     * @param e indica el Objecto enemigo
     */
    public Play(GreenfootSound m1,int num,Jugador j,Enemigo e)
    {
       m=m1; 
       ply=num;
       jug=j;
       ene=e;
    }
    
    /**
     * Indica lo que se hara durante el juego
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            if(ply==MEXICO)
            {
              World w=getWorld();
              m.stop();
              w= new Juego(1,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(ply==USA)
            {
              World w=getWorld();
              m.stop();
              w= new Juego(2,jug,ene);
              Greenfoot.setWorld(w);
            }
             else if(ply==FRANCE)
            {
              World w=getWorld();
              m.stop();
              w= new Juego(3,jug,ene);
              Greenfoot.setWorld(w);
            }
             else if(ply==EGYPT)
            {
              World w=getWorld();
              m.stop();
              w= new Juego(4,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(ply==BOSQUE)
            {
              World w=getWorld();
              m.stop();
              w= new Juego(6,jug,ene);
              Greenfoot.setWorld(w);
            }
             else 
            {
              World w=getWorld();
              m.stop();
              w= new Juego(5,jug,ene);
              Greenfoot.setWorld(w);
            }
        }
    }
    }
