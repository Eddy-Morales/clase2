package Musica;

public class Instrumento {
    String nombre;
    String color;
    double tamano_m;
    String dificultad;

    public Instrumento(String nombre, String color, double tamano_m, String dificultad) {
        this.nombre = nombre;
        this.color = color;
        this.tamano_m = tamano_m;
        this.dificultad = dificultad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamano_m() {
        return tamano_m;
    }

    public void setTamano_m(double tamano_m) {
        this.tamano_m = tamano_m;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }


}
