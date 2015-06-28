import greenfoot.*;

/**
 * Esta clase representa los simbolos referente al bando de la luz
 * desciende de la clase Abstracta Symbol por lo cual implemeta su metodos
 * 
 * VARIABLES DE INSTANCIA
 * 
 * "world1" representa el mundo actual donde se encuentra este objecto,
 * 
 * "music" representa la musica en reproducion actual,
 * 
 * "img1" la imagen del simbolo en respandor(ACTIVO),
 * 
 * "img2" la imagen del simbolo normal(INACTIVO)
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class Luz extends Symbol
{
    private World world1;
    private GreenfootSound music;
    private GreenfootImage img1= new GreenfootImage("SimbolLUX.2.png");
    private GreenfootImage img2= new GreenfootImage("SimbolLUX.png");
    /**
     * CONSTRUCTOR
     * construye las caracteristicas iniciales de un simbolo
     * @param unaMusica musica actual del mundo
     */
    public Luz(GreenfootSound unaMusica)
    {
        world1=getWorld();
        music=unaMusica;
    }

    /**
     * el metodo act es heredado de la clase Actor indica lo que hace durante su activacion 
     */
    public void act() 
    {
        mouseSobreSimbolo(world1);
        empezarJuego(world1,music); 
    }
    
    /**
     * este metodo hace lo siguente cuando el cursor esta sobre el objecto se activa generando un resplandor 
     * alrededor del objecto
     * 
     * @param world es el mundo actual del objecto
     */
    public void mouseSobreSimbolo(World world)
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage(img1);

        }
        else if(Greenfoot.mouseMoved(world))
        {
            setImage(img2);
        } 
    }
    
    /**
     * este metodo cambia el mundo del actual
     * 
     * @param world mundo actual
     * @param music musica actual
     */
    public void empezarJuego(World world,GreenfootSound music) 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Jugador j=new Jugador();
            j.setBando(true);
            Enemigo e=new Enemigo();
            e.setBando(false);
            world=new EscogeE1(1,5,music,j,e);
            Greenfoot.setWorld(world);
        }
    }
}
