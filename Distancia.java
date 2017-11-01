import java.util.Scanner;

public class Distancia {
    public static void main (String[] args) {
    float nro1, nro2;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    nro1 = teclado.nextFloat();
    System.out.print("Ingrese otro numero: ");
    nro2 = teclado.nextFloat();

    float distancia;
    distancia = nro2 - nro1;
    
    if (distancia < 0) {
        distancia = -distancia;
    }
    
    System.out.println("La distancia es " + distancia);

    }
}
