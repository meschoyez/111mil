/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecciones.arreglos;

/**
 *
 * @author meschoyez
 */
public class ColeccionesArreglos {

    public static void main(String[] args) {
        int desocupadas = 0;
        boolean[] butacas = {false, true,
            true, false, false, false, true};

        desocupadas = ContarButacasLibres(butacas);
        System.out.println("Hay" + desocupadas +
                " butacas libres");

        OcuparButaca(butacas, 0);
        desocupadas = ContarButacasLibres(butacas);
        System.out.println("Hay" + desocupadas +
                " butacas libres");
    }

    private static int ContarButacasLibres(boolean[] butacas) {
        int desocupadas = 0;
        for (int b = 0; b < butacas.length; b++) {
            if (ButacaLibre(butacas, b)) {
                desocupadas++;
            }
        }
        return desocupadas;
    }

    private static boolean OcuparButaca(boolean[] butacas, int nro) {
        boolean libre = ButacaLibre(butacas, nro);
        if (libre) {
            butacas[nro] = true;
        }
        return libre;
    }

    private static boolean ButacaLibre(boolean[] butacas, int nro) {
        return ! butacas[nro];
    }
    
    private static boolean CineVacio(boolean[] butacas) {
    }

    private static boolean CineLleno(boolean[] butacas) {
    }

    private static int BuscarButacaLibre(boolean[] butacas) {
    }
}
