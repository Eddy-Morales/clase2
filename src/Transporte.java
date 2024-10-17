public class Transporte {
    String tipo;
    String nombre;
    int velocidad_m;
    String riesgo;

    public Transporte(String tipo, String nombre, int velocidad_m, String riesgo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.velocidad_m = velocidad_m;
        this.riesgo = riesgo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad_m() {
        return velocidad_m;
    }

    public void setVelocidad_m(int velocidad_m) {
        this.velocidad_m = velocidad_m;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }




}
