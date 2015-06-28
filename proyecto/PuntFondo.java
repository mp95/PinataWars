import greenfoot.*;

/**
 * Basicamente muestra la puntuacion de los jugadores
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class PuntFondo extends World
{

    /**
     * Construye las caracteristicas Iniciales del Mundo
     * 
     * @param music musica de la clase GreenfootSound
     */
    public PuntFondo(GreenfootSound music)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Boton r;
        r=new Return(music);
        addObject(r,673,104);
        ScoreBoard score=new ScoreBoard(300, 350);
        addObject(score, 400, 343);
    }
}
