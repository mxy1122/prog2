//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Cuadrado cuadrado  = new Cuadrado(4);

        double lado = cuadrado.getLado();
        System.out.println("El lado del cuadrado es: " + lado);

        double area = cuadrado.area();
        System.out.println("El area del cuadrado es: " + area);

        boolean esRotable = cuadrado.rotable();
        System.out.println("¿Es rotatable el cuadrado? " + esRotable);

        cuadrado.dibujar();

        Circulo circulo  = new Circulo(25.8);

        double areaCir = circulo.area();
        System.out.println("El area del circulo es: " + areaCir);

        circulo.dibujar();



    }
}