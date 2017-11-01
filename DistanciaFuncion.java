import java.util.Scanner;

public class Distancia {
    public static void main (String[] args) {
        float nro1, nro2;
        float distancia;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        nro1 = teclado.nextFloat();
        System.out.print("Ingrese otro numero: ");
        nro2 = teclado.nextFloat();

        distancia = Diferencia(nro1, nro2);
    
        System.out.println("La distancia es " + distancia);

    }

    public static float Diferencia (float nro1, float nro2) {
        float distancia;
        distancia = nro2 - nro1;
    
        if (distancia < 0) {
            distancia = -distancia;
        }
        return distancia;
    }
}
