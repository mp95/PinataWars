import greenfoot.*;
import java.util.*;

/**
 * La subclase "Torre".
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Torre extends Actor
{
    private Vida vd;
    
    /**
     * Indica si alrededor de la torre hay Guerreros
     *  @param num indica que objecto busca
     *  @return true si hay objectos
     *  @return false si no
     */
    public boolean noHayObjectos(int num)
    {
        if(num==0)
        {
            List l1=this.getIntersectingObjects(GuerBueno.class);
            if(l1.isEmpty()==true)
                return true;
            else
                return false;
        }
        else
        {
            List l1=this.getIntersectingObjects(GuerMalo.class);
            if(l1.isEmpty()==true)
                return true;
            else
                return false;
        }

    }

    /**
     * Crea la vida de la torre 
     * @param b el bando que pertenece la torre
     * 
     * @return devuelve el objecto Vida ya creada
     */
    public Vida creaVida(boolean b)
    {
        World w=getWorld();
        vd=new Vida();
        if(b==true)
            w.addObject(vd,187,48);
        else
            w.addObject(vd,620,48);
        return vd;
    }

    /**
     * si la torre recibio algun daño
     * 
     * @param dano el daño que recibio
     * @param b el bando 
     * @param vid la vida que se disminuira
     * 
     * @return un 1 si ya no se puedo reducir
     * @return un 0 si lo logro
     */
    public int afectado(int dano,boolean b,Vida vid)
    {
        int alert;
        alert=vid.reduceVida(dano,vid.getImage());
        if(b==true)
            vid.setLocation(vid.getX()-dano/2,48);
        else
            vid.setLocation(vid.getX()+dano/2,48);
        return alert;
    }

    /**
     * la torre recibe un incremento de vida
     * 
     * @param inc el incremento que recibio
     * @param b el bando 
     * @param vid la vida que se aumentara
     * 
     */
    public void rebilitado(int inc,boolean b,Vida vid)
    {
        int interup;
        interup=vid.incrementaVida(inc,vid.getImage());
        if(interup==0)
        {
            if(b==true)
                vid.setLocation(vid.getX()+inc/2,48);
            else
                vid.setLocation(vid.getX()-inc/2,48);
        }

    }

}
