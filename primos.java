import java.util.Scanner;

public class PositivosONegativos {

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
            if (nro > 3) {
                if (nro % 2 == 0) {
                    System.out.println("NO ES PRIMO (PAR)");
                    esPrimo = false;                
                }
                else {
                    // for (int i = 3; i < nro / 2; i+=2) {
                    int i = 3;
                    while (esPrimo && (i < nro / 2)) {
                        System.out.println("Probando contra " + i);
                        if ( nro % i == 0 ) {
                            System.out.println("NO ES PRIMO");
                            esPrimo = false;
                        }
                        i += 2;
                    }
                }
            }
            System.out.println("");
            if (esPrimo) {
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
}
