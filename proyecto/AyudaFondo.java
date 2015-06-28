import greenfoot.*;

/**
 * Muestra las Ayudas del juego; aqui graficamente podemos observar cómo jugar
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class AyudaFondo extends World
{

    /**
     * Construye las caracteristicas iniciales de la ventana de ayuda
     * 
     * @param music una musica de la clase GreenfootSound
     */
    public AyudaFondo(GreenfootSound music)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Boton r;
        r=new Return(music);
        addObject(r,58,542);
    }
}
