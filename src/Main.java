import Movilidad.Auto;
import Movilidad.Transporte;
import Musica.Cancion;
import Musica.Instrumento;
import Otros.*;
import TV.Pelicula;
import TV.Series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        //para declarar el objeto
        //para instanciar una clase
//        Libro libro1=new Libro("el resplandor", "stephen king", "juvenaria", 600);
//        Libro libro2=new Libro("cien años de soledad", "gabriel garcia marquez", "juvenaria", 500);
//        Libro libro3= new Libro("El Hobbit","J.R.R Tolkien","Booket",448);
//        Libro libro4= new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);


//        libro1.imprimir();
//        System.out.println(libro1.imprimir_cubierta());
//        libro2.imprimir();
//        System.out.println(libro2.imprimir_cubierta());
//        libro3.imprimir();
//        System.out.println(libro3.imprimir_cubierta());
//        libro4.imprimir();
//        System.out.println(libro4.imprimir_cubierta());

        //TV.Series
//        Series serie1=new Series("Malcolm in the middle",151,"Linwood Boomer",8);
//        Series serie2=new Series("Perdidos",121, "J.J Abrams",8);
//
//        System.out.println(serie1.getNombre());
//        System.out.println(serie2.getNombre());
//
//        //Videojuegos
//        videojuego videojuego1=new videojuego("Alien Isolation","Terror",2014,9);
//        videojuego videojuego2=new videojuego("Fornite","Battle Royale",2017,8);
//
//        System.out.println(videojuego1.getNombre());
//        System.out.println(videojuego2.getNombre());
//
//        //Canciones
//        System.out.println("--------------------------");
//        Cancion cancion1=new Cancion("Cancerbero",3,"Rap","épico");
//        Cancion cancion2=new Cancion("Tierra caneña",2,"Cumbia","joven profesor");
//        System.out.println(cancion1.getNombre());
//        System.out.println(cancion2.getArtista());
//
//        //Personas
//        System.out.println("--------------------------");
//        Persona persona1=new Persona("Eddy","Morales",24,"Masculino");
//        Persona persona2=new Persona("alexandra","Gonzales",25,"Femenino");
//        System.out.println(persona1.getNombre());
//        System.out.println(persona2.getApellido());
//
//        //Movilidad.Auto
//        System.out.println("--------------------------");
//        Auto auto1=new Auto("Toyota","camioneta","asd45","blanco");
//        Auto auto2=new Auto("chevrolet","avanz","zxc55","negro");
//        System.out.println(auto1.getMarca());
//        System.out.println(auto2.getPlaca());
//
//        //Movilidad.Transporte
//        System.out.println("--------------------------");
//        Transporte transporte1=new Transporte("aereo","avión",50,"bajo");
//        Transporte transporte2=new Transporte("tierra","auto",10,"medio");
//        System.out.println(transporte1.getNombre());
//        System.out.println(transporte2.getRiesgo());
//
//        //Musica.Instrumento
//        System.out.println("--------------------------");
//        Instrumento instrumento1=new Instrumento("guitarra","café",1.5,"media");
//        Instrumento instrumento2=new Instrumento("saxofón","dorado",1,"alta");
//        System.out.println(instrumento1.getColor());
//        System.out.println(instrumento2.getDificultad());
//
//        //Otros.Material
//        System.out.println("--------------------------");
//        Material material1=new Material("oro","baja","alta","dorado");
//        Material material2=new Material("plata","alta","media","plata");
//        System.out.println(material1.getResistencia());
//        System.out.println(material2.getNombre());
//
//        //TV.Pelicula
//        System.out.println("--------------------------");
//        Pelicula pelicula1=new Pelicula("avengers",180.0,"kevin r.","accion");
//        Pelicula pelicula2=new Pelicula("joker",200,"marcos f.","accion");
//        System.out.println(pelicula1.getTitulo());
//        System.out.println(pelicula2.getGenero());

        //Otros.Zapato
//        System.out.println("--------------------------");
//        Zapato zapato1=new Zapato("adidas",42,"blanco","deportivo");
//        System.out.println("Ingrese la marca: ");
//        String marca= scanner.nextLine();
//        System.out.println("ingresa la talla: ");
//        int talla= scanner.nextInt();
//        scanner.nextLine();    // sirve para que no existan errores al ingresar
//        System.out.println("ingresa el color: ");
//        String color= scanner.nextLine();
//        System.out.println("ingresa el tipo: ");
//        String tipo= scanner.nextLine();
//        Zapato zapato2=new Zapato(marca,talla,color,tipo);
//        zapato2.mostrar_zapato();
//        System.out.println();
//        zapato1.mostrar_zapato();
//    }


//    //LibroCalificaciones miLibroCalificaciones =new LibroCalificaciones("","",0,0.0);
//    System.out.println("Ingrese el nombre del curso: ");
//    String nombreDelCurso = scanner.nextLine();
//
//    System.out.println("Ingrese periodo: ");
//    String periodo = scanner.nextLine();
//
//        System.out.println("Ingrese el año: ");
//    int anio = scanner.nextInt();
//
//        System.out.println("Ingrese el promedio: ");
//    Double promedio = scanner.nextDouble();
//    org.example.LibroCalificaciones miLibroCalificaciones =
//            new org.example.LibroCalificaciones(nombreDelCurso, periodo, anio, promedio);
//    //miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
//    //miLibroCalificaciones.setPeriodo(periodo);
//    //miLibroCalificaciones.setAnio(anio);
//    //miLibroCalificaciones.setPromedio(promedio);
//        miLibroCalificaciones.mostrarMensaje();
//}

//        Operaciones operaciones = new Operaciones("");
//        operaciones.setN1(20.0);
//        operaciones.setN2(2.0);
//        operaciones.imprimirDatos(); // Imprime los valores de n1 y n2
//        operaciones.sumaeimpresiones();
        
        System.out.print("Ingrese el valor de n1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese el valor de n2: ");
        double n2 = scanner.nextDouble();
        Operaciones operaciones = new Operaciones();
        operaciones.setN1(n1);
        operaciones.setN2(n2);

        operaciones.imprimirResultados();
        scanner.close();


    }
}