/**
 * Representa al jugador
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Jugador  
{
    /*La Clase jugador es una clase externa de las SUPERCLASES ACTOR Y WORLD puesto que esta solo representa el
     jugador y su Informacion esencia para la dinamica del jugador*/
    
    /*VARIABLES DE INSTANCIA*/ 
    private int score;//PUNTUACION DEL JUGADOR
    private boolean bando;//BANDO EN EL QUE PERTENECE (FALSE=OBSCURIDAD,TRUE=LUZ)
    private String name;//NOMBRE DEL JUGADOR

    /**
     * Constructor para objetos de clase Jugador.
     */
    public Jugador()//Costructor de la Clase 
    {
        score=0;//Inicializa el score con 0
        bando=false;//*Inicializa el bando en false
        name="Unnamed";//Inicializa con un nombre por dafault
    }
    
    /**
     * pone el valor del score
     * 
     * @param unScore el valor del score
     */
    public void setScore(int unScore)//Pone un valor a score el parametro es un valor entero
    {
        score=unScore;
    }
    
    /**
     * pone el valor del bando
     * 
     * @param unBando true para la luz, false para la obscuridad
     */
    public void setBando(boolean unBando)
    {
        bando=unBando;
    }
    
    /**
     * pone el nombre del jugador
     * 
     * @param unNombre el nombre del jugador
     */
    public void setName(String unNombre)
    {
        name=unNombre;
    }
    
    /**
     * devuelve el valor del score
     * 
     * @return te devuleve el valor del score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * devuelve el valor del bando
     * 
     * @return true para la luz, false para la obscuridad
     */
    public boolean getBando()
    {
        return bando;
    }
    
    /**
     * devuelve el nombre
     * 
     * @return devuelve el nombre
     */
    public String getNombre()
    {
        return name;
    }
}
