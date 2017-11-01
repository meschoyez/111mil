package prueba111mil;

import java.util.Scanner;

public class Prueba111mil {

    public static void main(String[] args) {
        int valor, a, b, resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor para factorial? ");
        valor = teclado.nextInt();

        resultado = Factorial(valor);
        System.out.println("Factorial = " + resultado);
        resultado = FactorialIt(valor);
        System.out.println("Factorial (it) = " + resultado);

        System.out.println("Valor a mult? ");
        a = teclado.nextInt();
        System.out.println("Valor b mult? ");
        b = teclado.nextInt();
        resultado = Multiplicar(a, b);
        System.out.println("Multiplicacion = " + resultado);
        resultado = MultiplicarIt(a, b);
        System.out.println("Multiplicacion (it) = " + resultado);
        resultado = MultiplicarIt2(a, b);
        System.out.println("Multiplicacion (it2) = " + resultado);
}

    private static int Factorial(int nro) {
        int resultado;
        if ((nro == 0) || (nro == 1)) {
            resultado = 1;
        }
        else {
            resultado = nro * Factorial(nro - 1);
        }
        return resultado;
    }

    private static int FactorialIt (int nro) {
        int resultado = 1;
        for ( ; nro > 1; nro--) {
            resultado *= nro;
        }
        return resultado;
    }

    private static int Multiplicar (int x, int y) {
        int resultado;
        if (y == 0) {
            resultado = 0;
        }
        else {
            resultado = x + Multiplicar(x, y-1);
        }
        return resultado;
    }

    private static int MultiplicarIt (int x, int y) {
        int resultado = 0;
        for (int i = 1; i <= y; i++) {
//            resultado = resultado + x;
            resultado += x;
        }
        return resultado;
    }

    private static int MultiplicarIt2 (int x, int y) {
        int resultado = 0;
        for ( ; y > 0; y--) {
            resultado += x;
        }
        return resultado;
    }
}
