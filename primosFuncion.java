import java.util.Scanner;

public class PrimosFuncion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nro, intentos = 1;
        boolean esPrimo = true;
        
        System.out.print("Ingrese un numero? ");
        nro = teclado.nextInt();
        while ((nro <= 0) && (intentos < 3)) {
            System.out.println("Ingrese valores positivos");
            System.out.print("Ingrese un numero? ");
            nro = teclado.nextInt();
            intentos++;
        }

        if (nro > 0) {
            System.out.println("");
            if (ValorPrimo(nro)) {
                System.out.println("El " + nro + " es primo");
            }
            else {
                System.out.println("El " + nro + " NO es primo");
            }
        }
        else {
            System.out.println("");
            System.out.println("No se puede realizar la tarea");
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
