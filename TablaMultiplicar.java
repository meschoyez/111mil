import java.util.Scanner;

public class TablaMultiplicar {
    public static void main (String[] args) {
        int valor, limite;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nro de la tabla de multiplicar? ");
        valor = teclado.nextInt();
        System.out.print("Nro. maximo para multiplicar? ");
        limite = teclado.nextInt();

        for (int nro = 0; nro <= limite; nro = nro + 1) {
            System.out.println("" + valor + "*" + nro + "=" + (valor * nro));
        }
    }
}
