public class Rectangulo extends Figura{

    public Rectangulo() {}

    public Rectangulo (float base, float altura) {
        super(base, altura);

    }

    @Override
    @Deprecated
    public float calcularArea() {
        return getBase()*getAltura();
    }

    @Override
    public String toString() {
        return "base: "+getAltura()+", altura: "+getAltura();
    }


}
