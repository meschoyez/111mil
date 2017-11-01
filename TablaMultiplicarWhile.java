import java.util.Scanner;

public class TablaMultiplicar {
    public static void main (String[] args) {
        int valor, limite;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nro de la tabla de multiplicar? ");
        valor = teclado.nextInt();
        System.out.print("Nro. maximo para multiplicar? ");
        limite = teclado.nextInt();

        int nro = 0;
        while (nro <= limite) {
            System.out.println("" + valor + "*" + nro + "=" + (valor * nro));
            nro = nro + 1;
        }
    }
}
