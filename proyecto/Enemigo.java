/**
 * Representa la informacion del enemigo
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Enemigo  
{
    // instance variables - reemplace el ejemplo a continuación por uno propio
    boolean band;
    
    /**
     * Constructor para objetos de clase Enemigo.
     */
    public Enemigo()
    {
        band=false;
    }
    /**
     * pone el valor del bando
     * 
     * @param unBando true para la luz, false para la obscuridad
     */
    public void setBando(boolean unBando)
    {
        band=unBando;
    }
    
    /**
     * devuelve el valor del bando
     * 
     * @return true para la luz, false para la obscuridad
     */
    public boolean getBando()
    {
        return band;
    }
}
