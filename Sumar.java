import java.util.Scanner;

public class Sumar {
    public static void main (String[] args) {
    int nro1, nro2;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese un numero entero: ");
    nro1 = teclado.nextInt();
    System.out.print("Ingrese otro numero entero: ");
    nro2 = teclado.nextInt();

    int resultado;
    resultado = nro1 + nro2;
    System.out.println("El resultado es " + resultado);

    }
}
