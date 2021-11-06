
package clase2java;

import java.util.Scanner;

public class Clase2Java {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();              
        System.out.println("¿Cual es tu hobbie?");
        String hobbie= entrada.nextLine();
        System.out.println("¿Cual es tu editor de codigo preferido?");
        String editorFavorito= entrada.nextLine();
        System.out.println("¿Que sistema operativo usas?");
        String sistemaOperativo= entrada.nextLine();
        System.out.println("¿Cuantos años tienes?");
        int edad = entrada.nextInt();  
        
        
        
        
        
        System.out.println("Bienvenidx! " + nombre + " " + apellido);       
        System.out.println("Su edad es:  " + edad);
        System.out.println("En tu tiempo libe te gusta dedicarte a:  " + hobbie);
        System.out.println("Tu editor de código favorito es:  " + editorFavorito + " y lo usas en tu sistema operativo " +sistemaOperativo);
        
     
            }
}