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
        boolean resultado;
//        boolean[] butacas = new boolean[30];
//        for (int pos=0; pos < butacas.length; pos++) {
//            butacas[pos] = true;
//        }
//        boolean[] butacas = {false, false, false};
        boolean[] butacas = {false, true,
            true, false, false, false, true};

        System.out.println("Lleno al " +
             PorcentajeOcupacion(butacas) + "%");
/*        desocupadas = ContarButacasLibres(butacas);
        System.out.println("Hay" + desocupadas +
                " butacas libres");

        OcuparButaca(butacas, 0);
        desocupadas = ContarButacasLibres(butacas);
        System.out.println("Hay" + desocupadas +
                " butacas libres");
        
        resultado = CineVacio(butacas);
        resultado = CineVacioWhile(butacas);
        resultado = CineVacioIndef(butacas);
*/
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
    
    private static boolean ButacaOcupada(boolean[] butacas, int nro) {
        return butacas[nro];
    }

    private static boolean CineVacio(boolean[] butacas) {
        boolean vacio = true;
        for (int pos = 0; pos < butacas.length; pos++) {
//            if (butacas[pos] == true) {
            if (butacas[pos]) {
                vacio = false;
            }
        }
        return vacio;
    }

    private static boolean CineVacioWhile(boolean[] butacas) {
        boolean vacio = true;
        int pos = 0;
        while (pos < butacas.length) {
            if (butacas[pos]) {
                vacio = false;
            }
            pos++;
        }
        return vacio;
    }

    private static boolean CineVacioIndef(boolean[] butacas) {
        boolean vacio = true;
        int pos = 0;
        while (vacio && (pos < butacas.length)) {
            if (ButacaOcupada(butacas, pos)) {
                vacio = false;
            }
            pos++;
        }
        return vacio;
    }

    private static boolean CineVacioContar(boolean[] butacas) {
        boolean vacio = true;
        int libres = ContarButacasLibres(butacas);
        if (libres != butacas.length) {
            vacio = false;
        }
        return vacio;
    }

    private static boolean CineVacioContar1linea(boolean[] butacas) {
        return ContarButacasLibres(butacas) == butacas.length;
    }
    

    private static boolean CineLleno(boolean[] butacas) {
        boolean lleno = true;
        int pos = 0;
        while (lleno && (pos < butacas.length)) {
            if (ButacaLibre(butacas, pos)) {
                lleno = false;
            }
            pos++;
        }
        return lleno;
    }

    private static int ContarButacasOcupadas(boolean[] butacas) {
        int ocupadas = 0;
        for (int b = 0; b < butacas.length; b++) {
            if (ButacaOcupada(butacas, b)) {
                ocupadas++;
            }
        }
        return ocupadas;
    }

    private static boolean CineLlenoContar(boolean[] butacas) {
        boolean lleno = true;
        int ocupadas = ContarButacasOcupadas(butacas);
        if (ocupadas != butacas.length) {
            lleno = false;
        }
        return lleno;
    }

    private static boolean CineLlenoContar1linea(boolean[] butacas) {
        return ContarButacasLibres(butacas) == 0;
    }



    private static int BuscarButacaLibre1(boolean[] butacas) {
        int posicion = -1;
        for (int corredor = 0; corredor < butacas.length; corredor++) {
            if (ButacaLibre(butacas, corredor)) {
                posicion = corredor;
            }
        }
        return posicion;
    }

    private static int BuscarButacaLibre2(boolean[] butacas) {
        int butLibre = 0;
        boolean butLlena = true;
        while (butLlena && butLibre < butacas.length) {
            if (ButacaLibre(butacas, butLibre)) {
                butLlena = false;
            }
            butLibre++;
        }
        return butLibre - 1;        
    }

    private static int BuscarButacaLibre3(boolean[] butacas) {
        int posicion = 0;
        while ((posicion < butacas.length) &&
                       (!ButacaLibre(butacas, posicion))) {
//                       (ButacaLibre(butacas, posicion) == false)) {
            posicion++;
        }
        /* Si hace falta devolver -1 */
        if (posicion == butacas.length) {
            posicion = -1;
        }
        /* ********** */
        return posicion;
    }

    private static float PorcentajeOcupacion (boolean[] butacas) {
        float ocupacion = 100 *
              (float)ContarButacasOcupadas(butacas) /
              (float)butacas.length;
        return ocupacion;
    }

    //****  DESAFIO ****//
    private static int Buscar2ButacasLibresContiguas
                                   (boolean[] butacas) {
    }

    private static int BuscarNButacasLibresContiguas
                                   (boolean[] butacas, int n) {
    }
}
