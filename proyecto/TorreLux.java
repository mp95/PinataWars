import greenfoot.*;
import java.util.*;
import java.awt.Color;

/**
 *Este objeto corresponde a la torre del equipo de la luz, la cual cuenta
 * con un porcentaje de vida, el cual puede ser reducido al ser atacada por enemigos.
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class TorreLux extends Torre
{
    /**
     * Act - hace lo que Jugador quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int rango;
    private boolean bd;
    private int activaRango;
    private int d;
    private int NuevaVida;
    private Vida vid;
    private int finish;
    private int dinero;
    private Letrero countdinero;
    private Letrero countscore;
    private int valorinicial;
    private List<GuerBueno>guerreros;
    private int score;
    private Jugador jugador;
    private GreenfootSound musica;
    private Records records;
    private int tiempo;
    private SimpleTimer time;
    private SimpleTimer timenemigo;
    /**
     * Constructor de la clase
     * 
     * @param band el bando que pertenece
     * @param dif indica cual sera el parsonaje que aparecera
     * @param jug recibe el jugador
     * @param m la musica actual
     * @param times el tiempo de espera que salgan los enemigos
     */
    public TorreLux(boolean band,int dif,Jugador jug,GreenfootSound m,int times)
    {
        if(band==true)
        {
            dinero=2500;
        }
        else
        {
            dinero=0;
        }
        jugador=jug;
        score=0;
        bd=band;
        d=dif;
        records=new Records();
        musica=m;
        time=new SimpleTimer();
        timenemigo=new SimpleTimer();
        tiempo=times;
        NuevaVida=1;
    }

    /**
     * Indica lo que se hara en el juego
     */
    public void act() 
    {
        if(bd==true&&valorinicial==0)
        {
            escribeValorDeDineroInicial();
            escribeScoreInicial();
            valorinicial++;
        }

        if(NuevaVida==1)
        {
            vid=creaVida(bd);
            NuevaVida=0;
        }

        if(bd==true)
        {
            actuaJugador();
        }
        else
        {
            actuaEnemigo();
            if(time.millisElapsed()>60000)
            {
                World w=getWorld();
                List l1=w.getObjectsAt(405,513,Power.class);
                ((Power)l1.get(0)).activaPoder(true);
                time.mark();
            }
        }
        if(isTouching(GuerMalo.class))
        {
            int atk=Greenfoot.getRandomNumber(35);
            if(atk==5)
            {
                danoTorre(10);
            }
        }

    } 

    /**
     * indica las acciones que hara el jugador en caso de se elegido
     */
    public void actuaJugador()
    {
        World w=getWorld();
        List l1=w.getObjectsAt(293,508,BotonW1.class);
        if(Greenfoot.mouseClicked(l1.get(0))&&dinero>200&&((BotonW1)(l1.get(0))).estasActivado()==true)
        {
            GuerreroLux1 g1=new GuerreroLux1(1);
            w.addObject(g1,58,413);
            dinero=dinero-200;
            countdinero.modificaLetrero(""+dinero,Color.white);
        }
        List l2=w.getObjectsAt(182,508,BotonW2.class);
        if(Greenfoot.mouseClicked(l2.get(0))&&dinero>600&&((BotonW2)(l2.get(0))).estasActivado()==true)
        {
            GuerreroLux2 g1=new GuerreroLux2(1);
            w.addObject(g1,62,407);
            dinero=dinero-600;
            countdinero.modificaLetrero(""+dinero,Color.white);
        }
        List l3=w.getObjectsAt(69,508,BotonW3.class);
        if(Greenfoot.mouseClicked(l3.get(0))&&dinero>1000&&((BotonW3)(l3.get(0))).estasActivado()==true)
        {
            GuerreroLux3 g1=new GuerreroLux3(1);
            w.addObject(g1,58,413);
            dinero=dinero-1000;
            countdinero.modificaLetrero(""+dinero,Color.white);
        }

        w=getWorld();
        guerreros=w.getObjects(GuerBueno.class);
        for(GuerBueno guer:guerreros)
        {
            dinero=dinero+guer.retribulleDinero();
            countdinero.modificaLetrero(""+dinero,Color.white);
            score=score+guer.retribulleScore();
            countscore.modificaLetrero(""+score,Color.white);
        }
    }

    /**
     * Indica las acciones del enemigo 
     */
    public void actuaEnemigo()
    {
        World w=getWorld();
        if(timenemigo.millisElapsed()>tiempo)
        {
            if(noHayObjectos(0)==true)
            {
                int Guerrero=Greenfoot.getRandomNumber(6);
                if(d==1)
                {
                    if(Guerrero==0||Guerrero==1||Guerrero==2)
                    {
                        GuerreroLux1 g1=new GuerreroLux1(0);
                        w.addObject(g1,731,413);
                    }
                    else if(Guerrero==3||Guerrero==4)
                    {
                        GuerreroLux2 g1=new GuerreroLux2(0);
                        w.addObject(g1,731,413);
                    }
                    else
                    {
                        GuerreroLux3 g1=new GuerreroLux3(0);
                        w.addObject(g1,731,413);
                    }
                }
                if(d==2)
                {
                    if(Guerrero==0||Guerrero==1)
                    {
                        GuerreroLux1 g1=new GuerreroLux1(0);
                        w.addObject(g1,731,413);
                    }
                    else if(Guerrero==2||Guerrero==3)
                    {
                        GuerreroLux2 g1=new GuerreroLux2(0);
                        w.addObject(g1,731,413);
                    }
                    else
                    {
                        GuerreroLux3 g1=new GuerreroLux3(0);
                        w.addObject(g1,731,413);
                    }
                }
                if(d==3)
                {
                    if(Guerrero==0)
                    {
                        GuerreroLux1 g1=new GuerreroLux1(0);
                        w.addObject(g1,731,413);
                    }
                    else if(Guerrero==1||Guerrero==2)
                    {
                        GuerreroLux2 g1=new GuerreroLux2(0);
                        w.addObject(g1,731,413);
                    }
                    else
                    {
                        GuerreroLux3 g1=new GuerreroLux3(0);
                        w.addObject(g1,731,413);
                    }
                }
            }

            timenemigo.mark();
        } 

    }

    /**
     * Inicializa el valor del dinero
     */
    public void escribeValorDeDineroInicial()
    {
        World w=getWorld();
        countdinero=new Letrero(""+dinero,Color.WHITE);
        w.addObject(countdinero,504,508);
    }

    /**
     * Inicializa el valor del Score
     */
    public void escribeScoreInicial()
    {
        World w=getWorld();
        countscore=new Letrero(""+score,Color.WHITE);
        w.addObject(countscore,672,506); 
    }

    /**
     * Devuelve el score
     * 
     * @return el valor del score
     */
    public int getScore()
    {
        return score;
    }

    /**
     * Incremanta la salud de la torre
     */
    public void masSalud()
    {
        rebilitado(30,bd,vid);
    }

    /**
     * aumenta el valor del dinero
     */
    public void aumentaDinero()
    {
        if(bd==true)
        {
            dinero=dinero+500;
            countdinero.modificaLetrero(""+dinero,Color.white);
        }
    }

    /**
     * disminuye la salud de la torre
     */
    public void danoTorre(int dano)
    {
        finish=afectado(dano,bd,vid);
        if(finish==1)
        {
            World w=getWorld();
            if(bd==false)
            {
                List torre=w.getObjects(TorreDark.class);
                score=((TorreDark)torre.get(0)).getScore();
            }
            jugador.setScore(score);
            records.guardaRecords(score);
            w=new FinalEscenario(bd,jugador,musica);
            Greenfoot.setWorld(w);
        }
    }
}
