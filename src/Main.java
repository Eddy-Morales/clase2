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

        

    }
}