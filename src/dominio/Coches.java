package dominio;
public class Coches extends Juego{
    /*
     * Atributos
     */
    protected String nombre;
    protected int numero_coches;
    protected int numero_circuitos;

    /*
     * Constructor
     */
    public Coches(String nombreju, int precioju, int calidad_graficos, String nombre, int numero_coches, int numero_circuitos) {
        super(nombreju, precioju, calidad_graficos);
        this.nombre = nombre;
        this.numero_coches = numero_coches;
        this.numero_circuitos = numero_circuitos;
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
    public void setNumero_coches(int numero_coches) {
        this.numero_coches = numero_coches;
    }
    public int getNumero_coches() {
        return numero_coches;
    }
    public void setNumero_circuitos(int numero_circuitos) {
        this.numero_circuitos = numero_circuitos;
    }
    public int getNumero_circuitos() {
        return numero_circuitos;
    }

    /*
     * Metodo toString
     */
    public String toString() {
        return ("El nombre del juego es " + nombre + " y su precio es " + precioju  + " y su calidad grafica es " + calidad_graficos + " y su cantidad de coches es " + numero_coches + " y su cantidad de circuitos es " + numero_circuitos);
    }
    
}
