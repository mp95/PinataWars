import greenfoot.*;
import java.awt.Color;

/**
 * FinalEscenario nos muestra al final del juego, dependiendo del resultado, 
 * una imagen en caso de resultar ganador, y otra se se pierde.
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class FinalEscenario extends World
{
    private GreenfootImage imagenfinal;
    private Letrero nombre;
    private Letrero score;
    private Letrero nombreM;
    private Letrero scoreM;
    private GreenfootSound musica;
    private BotonHome be;
    private BotonMenu bm;
     /**
     * Constructor para objetos de clase FinalEscenario.
     * 
     * Este es el contructor que crea el ecsenario fianl donde te marca si GANASTE O PERDISTE
     * 
     * @param bando indica el bando si es Luz o Obscuridad del jugador
     * @param jug lleva los datos del jugador Nombre,Puntos,etc
     * @param m es la musica que se usa para el funcionamiento del juego
     * 
     */
    public FinalEscenario(boolean bando,Jugador jug,GreenfootSound m)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1);
        musica=m;
        musica.stop();
        musica=new GreenfootSound("Pinaton.mp3");
        musica.playLoop();
        musica.setVolume(1);
        if(bando==true)
        {
            imagenfinal=new GreenfootImage("Fondo17.jpg");
        }
        else
        {
            imagenfinal=new GreenfootImage("Fondo18.jpg");
        }
        setBackground(imagenfinal);
        nombre=new Letrero(jug.getNombre()+":",null);
        addObject(nombre,455,298);
        score=new Letrero(""+jug.getScore(),Color.WHITE);
        addObject(score,600,299);
        nombreM=new Letrero("NOMBRE",Color.RED);
        addObject(nombreM,448,266);
        scoreM=new Letrero("SCORE",Color.RED);
        addObject(scoreM,602,265);
        be=new BotonHome(musica);
        addObject(be,607,474);
        bm=new BotonMenu(musica,jug);
        addObject(bm,399,476);
    }
}
