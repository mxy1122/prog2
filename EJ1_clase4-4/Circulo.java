public class Circulo implements figura,Dibujable {
    private int radio;
    public Circulo(int radio){
        this.radio = radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public int getRadio() {
        return radio;
    }
    @Override
    public void area() {
    }
    @Override
    public void dibujar() {
    }

}
