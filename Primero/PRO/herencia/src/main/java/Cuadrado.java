public class Cuadrado extends Rectangulo{
    public Cuadrado(float lado){
        super(lado, lado);
    }



    @Override
    public String toString() {
        return "Lado A: "+getAltura()+" Lado B: "+getBase();
    }

    @Override
    public float calcularArea() {
        return getBase()*getAltura();
    }
}
