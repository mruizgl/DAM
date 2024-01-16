public class Triangulo extends Figura{
    public Triangulo (float base, float altura) {
        super(base, altura);
    }

    @Override
    public String toString(){
        return "Base: "+getBase()+", altura: "+getAltura();
    }

    @Override
    public float calcularArea() {
        return (getBase() *getAltura())/2;
    }
}
