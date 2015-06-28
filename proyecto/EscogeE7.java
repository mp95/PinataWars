import greenfoot.*;


/**
 * Muestra la interfaz grafica para escojer el escenario de un Bosque en el juego.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class EscogeE7 extends World
{

   /**
     * Constructor para objetos de clase EscogeE7.
     * 
     * @param next indica el escenario siguente en direccion derecha
     * @param prev indica el escenario posterior en direccion izquierda
     * @param music musica de la clase GreenfootSound
     * @param jug indica un jugador (informacion basica del mismo)
     * @param ene indica un jugador (informacion basica del mismo)
     * 
     */
     public EscogeE7(int next,int prev,GreenfootSound music,Jugador jug,Enemigo ene)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1); 
        Next n;
        Prev p;
        Play pl;
        n=new Next(next,music,jug,ene);
        p=new Prev(prev,music,jug,ene);
        pl=new Play(music,6,jug,ene);
        addObject(n,693,465);
        addObject(p,118,484);
        addObject(pl,544,410);
    }
}
