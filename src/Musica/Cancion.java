package Musica;

public class Cancion {
    String artista;
    int duracion_min;
    String genero;
    String nombre;

    public Cancion(String artista, int duracion_min, String genero, String nombre) {
        this.artista = artista;
        this.duracion_min = duracion_min;
        this.genero = genero;
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(int duracion_min) {
        this.duracion_min = duracion_min;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

