package Otros;

public class videojuego {
    //Atributos
    String nombre;
    String genero;
    int anio;
    int calificacion;

    //Métodos
    //Constructor
    public videojuego(String nombre, String genero, int anio, int calificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
