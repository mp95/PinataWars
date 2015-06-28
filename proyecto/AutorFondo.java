import greenfoot.*;

/**
 * Muestra el escenario donde se mostraran la informacion de los Autores del juego
 * 
 * @author irvin Alexis Rodriguez Estrada 
 * @author Irving Gerardo Cardenaz Hernandez  
 * @version 23/04/2015
 */
public class AutorFondo extends World
{
    private GreenfootSound music;
    /**
     * Este es el constructor del la clase solamente inicia las condiciones iniciales del
     * Escenario
     * 
     * @param musica es la musica que suena en el fondo
     */
    public AutorFondo(GreenfootSound musica)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        music=musica;
        Boton r;
        r=new Return(music);
        addObject(r,700,500);
    }
    
}
