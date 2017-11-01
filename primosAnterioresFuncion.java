import java.util.Scanner;

public class PrimosFuncion {
    /* Pide un numero al usario y muestra por pantalla
     * todos los valores primos anteriores
     * (lo incluye de ser necesario)
     *
     * Ej: se ingresa el 11 entonces la salida es:
     *     1 2 3 5 7 11
     */

    public static void main(String[] args) {
        int nro;
        boolean esPrimo = true;

        nro = LeePositivo("Ingrese un numero? ");

        if (nro > 0) {
            System.out.println("Valores primos hasta" + nro);
            MostrarPrimosAnteriores(nro);
        }
        else {
            System.out.println("");
            System.out.println("No se puede realizar la tarea");
        }
    }

    // Funcion Lectura Teclado
    public static int LeePositivo (String msg) {
        Scanner teclado = new Scanner(System.in);
        int nro, intentos = 1;

        // Convertir lectura de teclado en funcion
        System.out.print(msg);
        nro = teclado.nextInt();
        while ((nro <= 0) && (intentos < 3)) {
            System.out.println("Ingrese valores positivos");
            System.out.print(msg);
            nro = teclado.nextInt();
            intentos++;
        }
        return nro;
    }

    // Funcion mostrar primos
    public static void MostrarPrimosAnteriores (int limite) {
        for (int i = 1; i <= limite; i++) {
            if (ValorPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    // Funcion Primo
    public static boolean ValorPrimo (int nro) {
        boolean esPrimo = true;
        if (nro > 3) {
            if (nro % 2 == 0) {
                esPrimo = false;                
            }
            else {
                int i = 3;
                while (esPrimo && (i < nro / 2)) {
                    if ( nro % i == 0 ) {
                        esPrimo = false;
                    }
                    i += 2;
                }
            }
        }
        return esPrimo;
     }

}
