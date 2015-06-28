import greenfoot.*;
import java.util.*;

/**
 * La clase poder es un boton que necesita del indicador para poder utilizarse, si el indicador se llena de estrellas
 * este boton estara disponible para poder usarse.
 * 
 * @author Irvin Alexis Rodriguez Estrada 
 * @author Irving Gerardo Cardenas Hernadez 
 * 
 * @version (17.15.2015)
 */
public class Power extends Actor
{
    private GreenfootImage low;
    private GreenfootImage high;
    private int interruptor;
    private boolean jugador;
    private boolean enemigo;
    private Cartel poder;
    /**
     * Constructor de la clase
     * 
     * @param jug el valor que ocupa jugador
     * @param ene el valor que ocupa enemigo
     */
    public Power(boolean jug,boolean ene)
    {
        low=new GreenfootImage("powerlow.png");
        high=new GreenfootImage("powerhigh.png");
        interruptor=0;
        jugador=jug;
        enemigo=ene;
    }

    /**
     * Indica lo que hara en el juego
     */
    public void act() 
    {

        if(Greenfoot.mouseClicked(this)&&interruptor==1)
        {
            World w=getWorld();
            activaPoder(jugador);
            desactivaPower();
            List l1=w.getObjectsAt(601,563,Indicador.class);
            ((Indicador)l1.get(0)).clear();
        }
    }    

    /**
     * Activa el boton del poder
     */
    public void activaPower()
    {
        setImage(high);
        interruptor=1;
    }
    
    /**
     * Desactiva el boton del poder
     */
    public void desactivaPower()
    {
        setImage(low);
        interruptor=0;
    }

    /**
     * Activa un poder cualquiera del repertorio
     * 
     * @param band el valor del bando
     */
    public void activaPoder(boolean band)
    {
        int p;
        p=eligePoder();
        switch(p)
        {
            case 0:
            {
                atraso(band);
                break;
            }
            case 1:
            {
                aumentaSalud(band);
                break;
            }
            case 2:
            {
                aumentaDinero(band);
                break;
            }
            case 3:
            {
                danoEnemigo(band);
                break;
            }
            case 4:
            {
                exticion();
                break;
            }
            case 5:
            {
                fireBalls();
                break;
            }
            case 6:
            {
                iceBalls();
                break;
            }
            case 7:
            {
                invocaOvni();
                break;
            }
            case 8:
            {
                invocaTornado(band);
                break;
            }
            case 9:
            {
                Infection(band);
                break;
            }
            
        }

    }

    /**
     * escoje un poder del repertorio
     * 
     * @return el valor del poder elegido
     */
    public int eligePoder()
    {
        int ind=0; 
        int i;
        poder=new Cartel();
        World w=getWorld();
        for(i=0;i<5;i++)
        {
            ind=Greenfoot.getRandomNumber(10);
            poder.cambiaImagen(ind);
            w.addObject(poder,415,288);
            if(i!=4)
                Greenfoot.delay(5);
            else
                Greenfoot.delay(20);
            w.removeObject(poder);
        }
        return ind;
    }

    /**
     * activa el poder del cambio de direccion de los guerreros
     * 
     * @param band el valor del bando
     */
    public void atraso(boolean band)
    {
        World w=getWorld();
        if(band==true)
        {
            List<GuerMalo> guerrerosdark=w.getObjects(GuerMalo.class);
            for(GuerMalo guer:guerrerosdark)
            {
                guer.cambiaDireccion();
            }
        }
        else
        {
            List<GuerBueno> guerreroslux=w.getObjects(GuerBueno.class);
            for(GuerBueno guer:guerreroslux)
            {
                guer.cambiaDireccion();
            }
        } 
    }

    /**
     * aumenta la salud del que invoco el poder
     * 
     * @param band el valor del bando
     */
    public void aumentaSalud(boolean band)
    {
        World w=getWorld();
        if(band==true)
        {
            List l1=w.getObjects(TorreLux.class);
            ((TorreLux)l1.get(0)).masSalud();
        }
        else
        {
            List l1=w.getObjects(TorreDark.class);
            ((TorreDark)l1.get(0)).masSalud(); 
        }
    }

    /**
     * aumenta el dinero del que invoco el poder
     * 
     * @param band el valor del bando
     */
    public void aumentaDinero(boolean band)
    {
        World w=getWorld();
        if(band==true)
        {
            List l1=w.getObjects(TorreLux.class);
            ((TorreLux)l1.get(0)).aumentaDinero();
        }
        else
        {
            List l1=w.getObjects(TorreDark.class);
            ((TorreDark)l1.get(0)).aumentaDinero(); 
        }
    }

    /**
     * daña al enemigo dependiendo de quien haya invocado el poder
     * 
     * @param band el valor del bando
     */
    public void danoEnemigo(boolean band)
    {
        World w=getWorld();
        if(band==true)
        {
            List l1=w.getObjects(TorreDark.class);
            ((TorreDark)l1.get(0)).danoTorre(30);
        }
        else
        {
            List l1=w.getObjects(TorreLux.class);
            ((TorreLux)l1.get(0)).danoTorre(30); 
        }
    }

    /**
     * Elimina a todos los personajes del mundo
     */
    public void exticion()
    {
        World w=getWorld();
        Nuclear nuke=new Nuclear();
        w.addObject(nuke,402,347);
    }

    /**
     * Elimina a todos los personajes del mundo
     */
    public void Infection(boolean band)
    {World w=getWorld();
        if(band==true)
        {
            List<GuerMalo> guerrerosdark=w.getObjects(GuerMalo.class);
            for(GuerMalo guer:guerrerosdark)
            {
                guer.muere();
            }
        }
        else
        {
            List<GuerBueno> guerreroslux=w.getObjects(GuerBueno.class);
            for(GuerBueno guer:guerreroslux)
            {
                guer.muere();
            }
        } 
    }
    /**
     * invoca la caida de bolas de fuego
     */
    public void fireBalls()
    {
        int i;
        World w=getWorld();
        
        ((Juego)w).activaFire();
    }
    
    /**
     * invoca la caida de bolas de hielo
     */
    public void iceBalls()
    {
        int i;
        World w=getWorld();
        
        ((Juego)w).activaIce();
    }
    
    /**
     * invoca al ovni
     */
    public void invocaOvni()
    {
        World w=getWorld();
        Ovni ov=new Ovni();
        w.addObject(ov,145,159);
    }
    
    /**
     * invoca al tornado
     * 
     * @param band el valor del bando
     */
    public void invocaTornado(boolean band)
    {
        World w=getWorld();
        if(band==true)
        {
            Tornado tor=new Tornado(-1);
            w.addObject(tor,674,380);
        }
        else
        {
            Tornado tor=new Tornado(1);
            w.addObject(tor,129,383);
        }
    }
    
}
