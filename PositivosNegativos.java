import java.util.Scanner;

public class PositivosONegativos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cant, nro, intentos = 1;
        boolean positivos = true;
        boolean negativos = true;
    
        System.out.print("Cantidad datos? ");
        cant = teclado.nextInt();
        while ((cant < 0) && (intentos < 3)) {
            System.out.println("Ingrese valores positivos");
            System.out.print("Cantidad datos? ");
            cant = teclado.nextInt();
            intentos++;
        }

        if (cant > 0) {
            for (int i = 0; i < cant; i++) {
                System.out.print("Ingrese un numero");
                nro = teclado.nextInt();
                if (nro < 0) {
                    positivos = false;
                }
                if (nro >= 0) {
                    negativos = false;
                }
            }
            System.out.println("");
            if (positivos) {
                System.out.println("Todos son positivos");
            }
            else {
                if (negativos) {
                    System.out.println("Todos son negativos");
                }
                else {
                    System.out.println("Hay positivos y negativos");
                }
            }
        }
        else {
            System.out.println("");
            System.out.println("No se puede realizar la tarea");
        }
    }
}
