import greenfoot.*;

/**
 * Esta es una clase Abstracta puesto que solo representa y agrupa
 * simbolos que representa los bandos a escoger LUZ y OSCURIDAD
 * pero cada uno hace distintas cosas dependiendo de sus atributos
 * es por eso que se agrupan en una clase abstracta
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public abstract class Symbol extends Actor
{
    
    /**
     * Este metodo abstracto solo indica que si el mause esta sobre el simbolo
     * realiza cierta actividad dependiendo de su redefinicion
     * 
     * @param w es el mundo actual donde esta el simbolo
     */
    abstract public void mouseSobreSimbolo(World w);
    
    /**
     * este metodo abstracto solo indica cuando o porque condicionales empieza el juago
     * dependiendo de la redifinicion 
     * 
     * @param w el mundo actual del simbolo
     * @param m la musica actual del mundo
     */
    abstract public void empezarJuego(World w,GreenfootSound m);
}
