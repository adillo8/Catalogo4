package dominio;
public class Armas extends Juego{
    /*
     * Atributos
     */
    protected String nombre;
    protected int jugadores;

    /*
     * Constructor
     */
    public Armas(String nombreju, int precioju, int calidad_graficos, String nombre, int jugadores) {
        super(nombreju, precioju, calidad_graficos);
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    /*
     * Geter y seter
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }
    public int getJugadores() {
        return jugadores;
    }

    /*
     * Metodo toString
     */
    public String toString() {
        return ("El nombre del juego es " + nombre + " y su precio es " + precioju  + " y su calidad grafica es " + calidad_graficos + " y su cantidad de jugadores es " + jugadores);
    }

}