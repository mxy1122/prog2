public class Circulo implements figura,Dibujable {
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    @Override
    public double area() {

        return Math.PI * (radio*radio);

    }
    @Override
    public void dibujar() {

        System.out.println("Dibujando un circulo partiendo desde el radio de:" + radio);

    }

}
