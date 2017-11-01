import java.util.Scanner;

public class Bancos {
    public static void main (String[] args) {
        int bancos, inscriptos;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero de bancos: ");
        bancos = teclado.nextInt();
        System.out.print("Ingrese otro numero inscriptos: ");
        inscriptos = teclado.nextInt();

        if (bancos >= inscriptos) {
            System.out.println("Hay suficientes bancos");
        }
        else {
            int faltante;
            faltante = inscriptos - bancos;
            System.out.println("Faltan " + faltante + " bancos");
        }
    }
}
