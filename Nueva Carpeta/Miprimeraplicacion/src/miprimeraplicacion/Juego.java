
package miprimeraplicacion;

public class Juego {
    private int puntos, vidas;

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getVidas() {
        return vidas;
    }
    public String personajes, enemigos, aliados;
    Juego(int puntos, int vidas, String personajes, String enemigos, String aliados){
        this.puntos=puntos;
        this.vidas=vidas;
        this.personajes=personajes;
        this.enemigos=enemigos;
        this.aliados=aliados;
        
    }    
    
    String mostrarSaludo(){
        return "Hola soy:" + this.personajes + " y tengo" + this.vidas + " vidas";
        
    }
}
