package dominio;
public class Terror extends Juego {
    /*
     * Atributos
     */
    protected String nombre;
    protected int jumpscares;

    /*
     * Constructor
     */
    public Terror(String nombreju, int precioju, int calidad_graficos, String nombre, int jumpscares) {
        super(nombreju, precioju, calidad_graficos);
        this.nombre = nombre;
        this.jumpscares = jumpscares;
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
    public void setJumpscares(int jumpscares) {
        this.jumpscares = jumpscares;
    }
    public int getJumpscares() {
        return jumpscares;
    }

    /*
     * Metodo toString
     */
    public String toString() {
        return ("El nombre del juego es " + nombre + " y su precio es " + precioju  + " y su calidad grafica es " + calidad_graficos + " y su cantidad de jumpscares es " + jumpscares);
    }

}
