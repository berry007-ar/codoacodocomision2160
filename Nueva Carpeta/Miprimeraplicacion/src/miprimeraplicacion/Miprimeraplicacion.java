
package miprimeraplicacion;

import accesorios.Auto;
import java.util.HashSet;

public class Miprimeraplicacion {
    
    
    public static void main(String[] args) {        
        int numero; 
         String nombre;
         float promedio;
         boolean llueve = true;   
         numero = 13;
        float resultado;
        resultado = numero + 19;
        promedio = numero + 19 /2;
        System.out.println(resultado);
        System.out.println("El promedio es: "+ promedio);
        System.out.println( 45>19 && 19<17);
        if (llueve == true) {
            System.out.println("Usamos paraguas");
        }else{
            System.out.println("No usaremos paraguas");
        }
        
        Juego jugador = new Juego(3,3,"mario","hongos","luigi");
        System.out.println("Mi nombre es " + jugador.personajes );
        System.out.println("tENGO " + jugador.getVidas() + " vidas");
        System.out.println(jugador.mostrarSaludo());
        Auto miAuto  = (new Auto(250, 5, "rojo", "93", "1992", "sql866"));
        miAuto.setEncendido(false); 
        
           
    }
    
    
}
    
