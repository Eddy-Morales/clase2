package Otros;

public class Material {
    String nombre;
    String resistencia;
    String conductib;
    String color;

    public Material(String nombre, String resistencia, String conductib, String color) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.conductib = conductib;
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public String getConductib() {
        return conductib;
    }

    public void setConductib(String conductib) {
        this.conductib = conductib;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
