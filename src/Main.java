public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1=new Libro("el resplandor", "stephen king", "juvenaria", 600);
        Libro libro2=new Libro("cien años de soledad", "gabriel garcia marquez", "juvenaria", 500);
        Libro libro3= new Libro("El Hobbit","J.R.R Tolkien","Booket",448);
        Libro libro4= new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);



        libro1.imprimir();
        System.out.println(libro1.imprimir_cubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimir_cubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimir_cubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimir_cubierta());

        //Series
        Series serie1=new Series("Malcolm in the middle",151,"Linwood Boomer",8);
        Series serie2=new Series("Perdidos",121, "J.J Abrams",8);

        System.out.println(serie1.getNombre());
        System.out.println(serie2.getNombre());

        //Videojuegos
        videojuego videojuego1=new videojuego("Alien Isolation","Terror",2014,9);
        videojuego videojuego2=new videojuego("Fornite","Battle Royale",2017,8);

        System.out.println(videojuego1.getNombre());
        System.out.println(videojuego2.getNombre());

    }

}