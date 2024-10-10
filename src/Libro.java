public class Libro {
    //atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;

    //MEDIOS
    //Construvtor
    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }
    public void imprimir(){
        System.out.println("El título es: " + this.titulo);
        System.out.println("El autor es: " + this.autor);
        System.out.println("El editorial es: " + this.editorial);
        System.out.println("Las páginas son: " + this.paginas);
        System.out.println("--------------------------------");
    }
    public int imprimir_cubierta(){
        return this.paginas+5;
    }

}
