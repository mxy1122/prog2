public class Cuadrado implements figuras{
    private double lado;
    public Cuadrado(double lado){
        this.lado=lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public double area(){

       return lado * lado;

    }
    public boolean rotable(){

        return true;

    }
    public void dibujar(){

        System.out.println("Dibujando un cuadrado con " + lado+" lados");

    }


}



