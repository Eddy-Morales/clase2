public class Operaciones {
    double n1;
    double n2;

    public Operaciones() {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Getters y Setters
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    // Métodos para realizar operaciones
    public double sumatoria() {
        return n1 + n2;
    }

    public double resta() {
        return n1 - n2;
    }

    public double multiplicacion() {
        return n1 * n2;
    }

    public double division() {
        if (n2 != 0) {
            return n1 / n2;
        } else System.out.println("No se puede dividir por cero");
        return 0;
    }

    // metodo imprimir

    public void imprimirResultados() {
        System.out.println("Resultados:");
        System.out.println("Suma: " + sumatoria());
        System.out.println("Resta: " + resta());
        System.out.println("Multiplicación: " + multiplicacion());
        System.out.println("Division: " + division());
    }
}


