import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cant, nro, mayor, intentos = 0;
    
        System.out.print("Cantidad datos? ");
        cant = teclado.nextInt();
        while ((cant < 0) && (intentos < 3)) {
            System.out.println("Ingrese valores positivos");
            System.out.print("Cantidad datos? ");
            cant = teclado.nextInt();
            intentos++;
        }

        if (cant > 0) {
            System.out.print("Ingrese un numero");
            mayor = teclado.nextInt();
            for (int i = 1; i < cant; i++) {
                System.out.print("Ingrese un numero");
                nro = teclado.nextInt();
                if (mayor < nro) {
                    mayor = nro;
                }
            }
            System.out.println("");
            System.out.println("El mayor es" + mayor);
        }
        else {
            System.out.println("");
            System.out.println("No se puede realizar la tarea");
        }
    }
}
