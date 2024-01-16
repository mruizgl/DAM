import java.sql.SQLOutput;

public class AppFigura {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    static Rectangulo rectangulo;
    public static void main(String[] args) {
        cuadrado = new Cuadrado(5.0f);
        //System.out.println("Valor cuadrado:"+cuadrado.toString());
        triangulo = new Triangulo (10f, 5f);
        rectangulo = new Rectangulo(4f,3f);

        //System.out.println("Valor triangulo:"+triangulo);
        //System.out.println("Area= "+triangulo.calcularArea());

        mostrarArea(cuadrado);
        mostrarArea(triangulo);
        mostrarArea(rectangulo);
        System.out.println("Valor de mi area rectangulo: "+rectangulo.calcularArea());
    }

    public static void mostrarArea(Figura figura) {
        System.out.println("Valor del area "+figura.calcularArea());
    }
}
