public class Series {
    //Atributos
    String nombre;
    int n_episodios;
    String director;
    int calificacion;

    //métodos
    //Constructor
    public Series(String nombre, int n_episodios, String director, int calificacion) {
        this.nombre = nombre;
        this.n_episodios = n_episodios;
        this.director = director;
        this.calificacion = calificacion;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getN_episodios() {
        return n_episodios;
    }

    public String getDirector() {
        return director;
    }

    public int getCalificacion() {
        return calificacion;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_episodios(int n_episodios) {
        this.n_episodios = n_episodios;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}