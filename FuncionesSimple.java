import java.util.Scanner;

public class FuncionesSimples {

    // Cabecera de la Funcion/Metodo
    public static     void         main   (String[] args)
// | Tipo Acceso | Valor retorno| Nombre | Argumentos 
    // Fin de la Cabecera
    {
        int valor, limite;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nro de la tabla de multiplicar? ");
        valor = teclado.nextInt();
        System.out.print("Nro. maximo para multiplicar? ");
        limite = teclado.nextInt();

        Multiplicaciones(valor, limite);
    }

    public static     int        Multiplica (int a, int b) {
// | Tipo Acceso | Valor retorno| Nombre   | Argumentos
        return a * b;
    }
    
    public static void Multiplicaciones (int valor, int limite) {
        for (int nro = 0; nro <= limite; nro = nro + 1) {
            System.out.println("" + valor + "*" + nro + "="
                      + Multiplica(valor, nro));
        }
    }
}
