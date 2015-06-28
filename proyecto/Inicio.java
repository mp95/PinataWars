import greenfoot.*;

/**
 * es la clase donde se muestra el escenario inicial del juego
 * basicamente muestra una portada inicial del juago
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class Inicio extends World
{
    /**
     * PRIMER CONSTRUCTOR
     * este es el primer constructor no tiene parametros de entrada puesto que este genera las condiciones
     * iniciales como la ventana visual, los botones y la musica de fondo
     * esta metodo se llama desde la ejecucion(LA PRIMERA EJECUCION) o cuando hay un reinicio del juego
     * 
     */
    public Inicio()//Es la Clase Costructora del Mundo inicio REPRODUCE SONIDO
    {    
        super(800, 600, 1);//Tamaño de la Pantalla
        GreenfootSound music=new GreenfootSound("Pinaton.mp3");
        music.playLoop();
        music.setVolume(100);
        
        Boton b1;//Boton Juego
        Boton b2;//Boton Puntaje
        Boton b3;//Boton Autores
        Boton b4;//Boten Informacion
    
        b1=new icoj(music);//Crea Boton de Jugar
        b2=new Icop(music);//Crea Boton de Puntaje
        b3=new Icoau(music);//Crea Boton de Autores
        b4=new Icoinf(music);//Crea Boton de Informacion
   
        addObject(b1,500,200);//Agrega el Boton Jugar
        addObject(b2,650,200);//Agrega el Boton Puntaje
        addObject(b3,500,400);//Agrega el Boton Autores 
        addObject(b4,650,400);//Agrega el Boton Informacion
 
      
    }
    
    /**
     * SEGUNDO CONSTRUCTOR
     * este se llama ya en otras lineas de codigo y solo cuanta con un parametro que es la musica para que la musica original 
     * la que se escucha en la primara ejecucion no se pierda en los escenario de la AYUDA, LOGROS Y AUTORES y se detenga cuando
     * se comience el JUEGO
     * 
     * @param music musica previa a la llamada
     */
    public Inicio(GreenfootSound music)//Es la Clase Costructora del Mundo inicio REPRODUCE SONIDO
    {    
        super(800, 600, 1);//Tamaño de la Pantalla
        Boton b1;//Boton Juego
        Boton b2;//Boton Puntaje
        Boton b3;//Boton Autores
        Boton b4;//Boten Informacion
        
        b1=new icoj(music);//Crea Boton de Jugar
        b2=new Icop(music);//Crea Boton de Puntaje
        b3=new Icoau(music);//Crea Boton de Autores
        b4=new Icoinf(music);//Crea Boton de Informacion
  
        addObject(b1,500,200);//Agrega el Boton Jugar
        addObject(b2,650,200);//Agrega el Boton Puntaje
        addObject(b3,500,400);//Agrega el Boton Autores 
        addObject(b4,650,400);//Agrega el Boton Informacion

      
    }
   
}
