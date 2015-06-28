import greenfoot.*;
import java.awt.Color;

/**
 * Es es la CLASE del Mundo donde se desarrolla el juego.
 * es una de las clases mas Importante puesto que se desarrolla el ambiente para el juego.
 * CONSTANTES DE LA CLASE "JUEGO".
 * int MEXICO representa el escenario de mexico.
 * int USA representa el escenario de estados unidos.
 * int FRANCE representa el escenario de francia.
 * int EGYPT representa el escenario de egipto.
 * int JAPAN representa el escenario de japon.
 * estas costantes sirven para un manejo mas rapido de los cambios internos de escenario de la clase.
 * VARIABLES DE INSTANCIA DE LA CLASE.
 * int dificultad: representa la dificultad de juego se maneja en 3 grados.
 * 1.FACIL.
 * 2.NORMAL.
 * 3.DIFICIL.
 * GreenfootSound musica representa la musica que se reproducira durante el juego.
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class Juego extends World
{
    final int MEXICO=1;
    final int USA=2;
    final int FRANCE=3;
    final int EGYPT=4;
    final int JAPAN=5;
    final int BOSQUE=6;
    private int dificultad;
    private GreenfootSound musica;
    private SimpleTimer timer;
    private SimpleTimer timerfire;
    private SimpleTimer timerice;
    private int activafire;
    private int activaice;
    private int time;
    private int timebotton;
    /**
     * METODO CONSTRUCTOR
     * este es el costructor inicial del juego y este propone las instancias iniciales del mundo
     * @param escenario el ecsenario donde se desarrolla va el 1 al 5
     * @param jug es la informacion general del jugador (UNA CLASE JUGADOR)
     * @param ene es la informacion general del enemigo (UNA CLASE ENEMIGO)
     */
    public Juego(int escenario,Jugador jug,Enemigo ene)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaÃ±o de celda de 1x1 pixeles.
        super(800, 600, 1); 
        if(escenario==MEXICO)
        {
            dificultad=1;
            musica=new GreenfootSound("MEXICO.mp3");
            musica.playLoop();
            musica.setVolume(100);
            setBackground("Fondo16.jpg");
            time=10000;
            timebotton=2000;
        }
         else if(escenario==BOSQUE)
        {
            dificultad=1;
            musica=new GreenfootSound("MEXICO.mp3");
            musica.playLoop();
            musica.setVolume(100);
            setBackground("Fondo20.jpg");
            time=8000;
            timebotton=4000;
        }
        else if(escenario==USA)
        {
            dificultad=1;
            musica=new GreenfootSound("MEXICO.mp3");
            musica.playLoop();
            musica.setVolume(100);
            setBackground("Fondo15.jpg");
            time=10000;
            timebotton=2000;
        }
        else if(escenario==FRANCE)
        {
            dificultad=2;
            musica=new GreenfootSound("MEXICO.mp3");
            musica.playLoop();
            musica.setVolume(100);
            setBackground("Fondo14.jpg");
            time=8000;
            timebotton=4000;
        }
        else if(escenario==EGYPT)
        {
            dificultad=2;
            musica=new GreenfootSound("MEXICO.mp3");
            musica.playLoop();
            musica.setVolume(100);
            setBackground("Fondo12.jpg");
            time=8000;
            timebotton=4000;
        }
        else 
        {
            dificultad=3;
            musica=new GreenfootSound("MEXICO.mp3");
            musica.playLoop();
            musica.setVolume(100);
            setBackground("Fondo13.jpg");
            time=5000;
            timebotton=8000;
        }
        if(jug.getBando()==true)
        {
            TorreLux j=new  TorreLux(true,dificultad,jug,musica,time);
            TorreDark e=new TorreDark(false,dificultad,jug,musica,time);
            addObject(j,34,284);
            addObject(e,766,285);
            Letrero oscuridadteam=new Letrero("Piñatas de la Oscuridad",Color.RED);
            addObject(oscuridadteam,607,90);
            Letrero luzteam=new Letrero("Piñatas de la Luz",Color.CYAN);
            addObject(luzteam,153,89);
            Power pow=new Power(true,false);
            addObject(pow,405,513);
        }
        else
        {
            TorreLux e=new  TorreLux(false,dificultad,jug,musica,time);
            TorreDark j=new TorreDark(true,dificultad,jug,musica,time);
            addObject(j,34,284);
            addObject(e,766,285);
            Letrero oscuridadteam=new Letrero("Piñatas de la Oscuridad",Color.RED);
            addObject(oscuridadteam,195,89);
            Letrero luzteam=new Letrero("Piñatas de la Luz",Color.CYAN);
            addObject(luzteam,648,88);
            Power pow=new Power(false,true);
            addObject(pow,405,513);
        }
        BotonW1 boton1=new BotonW1(timebotton);
        addObject(boton1,293,508);
        BotonW2 boton2=new BotonW2(timebotton);
        addObject(boton2,182,508);
        BotonW3 boton3=new BotonW3(timebotton);
        addObject(boton3,69,508);
        Letrero dineroText=new Letrero("DINERO",Color.BLACK);
        addObject(dineroText,520,471);
        Letrero score=new Letrero("SCORE",Color.BLACK);
        addObject(score,666,469);
        timer=new SimpleTimer();
        timerfire=new SimpleTimer();
        timerice=new SimpleTimer();
        Indicador indice=new Indicador();
        addObject(indice,601,563);
        activafire=0;
        activafire=0;
    }

    /**
     *Metodo Act:
     *indica lo que hara en el juego el escenario
     *principal mente el que caigan monedas para activar poderes
     */
    public void act()
    {
        Coins moneda=new Coins();

        if(timer.millisElapsed()>10300)
        {
            addObject(moneda,Greenfoot.getRandomNumber(800),146);
            timer.mark();
        }

        if(activafire!=0)
        {
            Fireball bola=new Fireball();

            if(timerfire.millisElapsed()>2000)
            {
                addObject(bola,Greenfoot.getRandomNumber(800),146);
                timerfire.mark();
            }
            activafire--;
        }
        
        if(activaice!=0)
        {
            Iceball bola=new Iceball();

            if(timerice.millisElapsed()>2000)
            {
                addObject(bola,Greenfoot.getRandomNumber(800),146);
                timerice.mark();
            }
            activaice--;
        }
    }
    
    /**
     * Activa la bandera para activa el poder le las bolas de fuego
     */
    public void activaFire()
    {
        activafire=500;
    }
    
    /**
     * Activa la bandera para activa el poder le las bolas de Hielo
     */
    public void activaIce()
    {
        activaice=500;
    }
}
