import greenfoot.*;

/**
 * Este boton  funciona dentro del menu de seleccion de escenario, al presionarlo
 * se cambia al siguiente escenario.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Next extends Boton
{
    static int USA=1;//Constante que indica que el mundo USA tiene el valor de 1
    static int FRANCE=2;//Constante que indica que el mundo FRANCE tiene el valor de 2
    static int EGYPT=3;//Constante que indica que el mundo EGYPT tiene el valor de 3
    static int JAPAN=4;//Constante que indica que el mundo JAPAN tiene el valor de 4
    static int MEXICO=5;//Constante que indica que el mundo MEXICO tiene el valor de 5
    static int BOSQUE=6;//constante que indica que el mundo BOSQUE tiene un valor de 6
    private int Next;//Indica el valor actual del mundo seleccionado
    private GreenfootSound m;//la musica actaul
    private World w;//mundo actual
    private Jugador jug;//los datos del jugador
    private Enemigo ene;//los datos del enemigo
   
    /**
     * Constructor de la clase
     * 
     * @param direccion bandera que indica la direccion
     * @param m1 es la musica que actual que se envia
     * @param Juagador los datos del jugador
     * @param Enemigo los datos del enemigo
     */
    public Next(int direccion,GreenfootSound m1,Jugador j,Enemigo e)
    {
        Next=direccion;
        m=m1;
        w=getWorld();
        jug=j;
        ene=e;
    }
    
    /**
     * Indica lo que se hara durante el juego
     */
    public void act() 
    {
      mouseSobreObjecto(w);
      cambiaMundo(m,w);
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
            setImage("Next.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("Next.png");
        }
    }
    
     /**
     * heredado de la clase abstracta Boton indica si el cursor est sobre el y manda una respuesta visual
     * 
     * @param w mundo actual
     */
     public void cambiaMundo(GreenfootSound m,World w)
    {
         if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("right"))
        {
            if(Next==USA)
            {
              
              w= new EscogeE2(2,1,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(Next==FRANCE)
            {
              
              w= new EscogeE3(3,2,m,jug,ene);
              Greenfoot.setWorld(w); 
            }
            else if(Next==EGYPT)
            {
               
              w= new EscogeE4(4,3,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(Next==JAPAN)
            {
              
              w= new EscogeE5(5,4,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(Next==BOSQUE)
            {
              
              w= new EscogeE7(6,6,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            
            else
            {
              
              w= new EscogeE1(1,5,m,jug,ene);
              Greenfoot.setWorld(w);
            }
        }
    }
}
