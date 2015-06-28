import greenfoot.*;

/**
 * La clase cartel se utiliza para mostrar en pantalla durante la ejecución del juego los diferentes
 * iconos de los poderes que puede utilizarse, su selección es aleatoria y tanto ele enmigo como
 * el jugador, pueden utilizarlo.
 * 
 * @autor Irvin Alexis Rodriguez Estrada 
 * @autor Irving Gerardo Cardenas Hernadez 
 * 
 * @versión (17.15.2015)
 */
public class Cartel extends Actor
{
    /**
     * Act - hace lo que Cartel quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    final GreenfootImage salud=new GreenfootImage("salud.png");
    final GreenfootImage dinero=new GreenfootImage("money.png");
    final GreenfootImage reversa=new GreenfootImage("reversa.png");
    final GreenfootImage dano=new GreenfootImage("danoenem.png");
    final GreenfootImage ext=new GreenfootImage("extincion.png");
    final GreenfootImage fireball=new GreenfootImage("fire.png");
    final GreenfootImage iceball=new GreenfootImage("ice.png");
    final GreenfootImage ovni=new GreenfootImage("ovni.png");
    final GreenfootImage tornado=new GreenfootImage("tornado.png");
    final GreenfootImage infection=new GreenfootImage("biohazard.png");
    
    public void cambiaImagen(int index)
    {
        switch(index)
        {
            case 0:
            {
                setImage(reversa);
                break;
            }
             case 1:
            {
                setImage(salud);
                break;
            }
             case 2:
            {
                setImage(dinero);
                break;
            }
             case 3:
            {
                setImage(dano);
                break;
            }
             case 4:
            {
                setImage(ext);
                break;
            }
             case 5:
            {
                setImage(fireball);
                break;
            }
             case 6:
            {
                setImage(iceball);
                break;
            }
             case 7:
            {
                setImage(ovni);
                break;
            }
             case 8:
            {
                setImage(tornado);
                break;
            }
            case 9:
            {
                setImage(infection);
                break;
            }
            
        }
    }
}
