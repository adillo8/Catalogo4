package dominio;
public class Juego {
    /*
     * Atrubutos
     */
    protected String nombreju;
    protected int precioju;
    protected int calidad_graficos;
    
    /*
     * Constructor
     */
    public Juego(String nombreju, int precioju, int calidad_graficos) {
        this.nombreju = nombreju;
        this.precioju = precioju;
        this.calidad_graficos = calidad_graficos;
    }

    /*
     * Geter y seter
     */
    public void setNombreju(String nombreju) {
        this.nombreju = nombreju;
    }
    public String getNombreju() {
        return nombreju;
    }
    public void setPrecioju(int precioju) {
        this.precioju = precioju;
    }
    public int getPrecioju() {
        return precioju;
    }
    public void setCalidad_graficos(int calidad_graficos) {
        this.calidad_graficos = calidad_graficos;
    }
    public int getCalidad_graficos() {
        return calidad_graficos;
    }

    /*
     * Metodo toString
     */
    public String toString() {
        return ("El nombre del juego es " + nombreju + " y su precio es " + precioju  + " y su calidad grafica es " + calidad_graficos);
    }

}

