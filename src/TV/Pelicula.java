package TV;

public class Pelicula {
    String titulo;
    double duracion_min;
    String director;
    String genero;

    public Pelicula(String titulo, double duracion_min, String director, String genero) {
        this.titulo = titulo;
        this.duracion_min = duracion_min;
        this.director = director;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(double duracion_min) {
        this.duracion_min = duracion_min;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
