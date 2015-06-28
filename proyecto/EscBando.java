import greenfoot.*;

/**
 * esta clase se encarga de mostrar la interfaz para escoger  el bando con el que se quiere jugar
 * ya sea LUZ u OSCURIDAD
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class EscBando extends World
{

    /**
     * CONSTRUCTOR
     * es pone las condiciones basicas para la cracion del escenario
     * botones, fondo, musica , etc.
     * 
     * @param musica un sonido de la clase GreenfootSound
     */
    public EscBando(GreenfootSound musica)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1); 
        Symbol s1;
        Symbol s2;
        s1=new Luz(musica);
        s2=new Dark(musica);
        addObject(s1,212,376);
        addObject(s2,619,361);
    }
}
