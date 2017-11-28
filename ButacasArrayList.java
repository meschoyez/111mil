/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cineventaentradas;

import java.util.ArrayList;

/**
 *
 * @author meschoyez
 */
public class CineVentaEntradas {

    public static void main(String[] args) {
        int desocupadas = 0;
        boolean resultado;
        ArrayList<Boolean> butacas;
        butacas = new ArrayList<>();

    /* Hacer el metodo principal (main) para que el programa
     * realice lo siguiente:
     *  - El cine cuenta con 15 butacas */
        for (int p = 0; p < 15; p++) {
            butacas.add(false);
        }

     /*  - El primer cliente compra 3 entradas
     *        (sugerencia: agregar metodo ComprarNEntradas) */
        boolean venta;
        venta = ComprarNEntradas(butacas, 3);
        ImprimirResultadoVenta(venta, 3);

     /*  - El segundo cliente compra 2 entradas */
        venta = ComprarNEntradas(butacas, 2);
        ImprimirResultadoVenta(venta, 2);
        
     /*  - El tercer cliente compra 5 entradas */
        venta = ComprarNEntradas(butacas, 5);
        ImprimirResultadoVenta(venta, 5);
     
     /*  - El segundo cliente cancela sus 2 entradas
     *        (sugerencia: agregar los metodos LiberarButaca
     *           CancelarReservaNButacas) */
        CancelarReservaNButacas(butacas, 2, 3);
        System.out.println("Se cancela reserva 2 entradas");
     
     /*  - El cuarto cliente compra 4 entradas */
        venta = ComprarNEntradas(butacas, 4);
        ImprimirResultadoVenta(venta, 4);
     
     /*  - El quinto cliente compra 1 entrada  */
        venta = ComprarNEntradas(butacas, 1);
        ImprimirResultadoVenta(venta, 1);

     /* Finalmente, mostrar por pantalla la cantidad de butacas
     * ocupadas y el porcentaje de ocupacion el cine
     */
        System.out.println("Butacas ocupadas: " +
                                ContarButacasOcupadas(butacas));
        System.out.println("Porcentaje ocupacion: " +
                                PorcentajeOcupacion(butacas));


    }

    private static void CancelarReservaNButacas
                     (ArrayList<Boolean> butacas, int cant, int pos) {
        for (int b = 0; b < cant; b++) {
            LiberarButaca(butacas, pos + b);
        }
    }

    private static boolean ComprarNEntradas
                           (ArrayList<Boolean> butacas, int n) {
        int pos = -2;
        boolean vendido = true;
        pos = BuscarNButacasLibresContiguas(butacas, n);
        if (pos >= 0) {
            for (int b = pos; b < pos + n; b++) {
                OcuparButaca(butacas, b);
            }
//            for (int b = 0; b < n; b++) {
//                OcuparButaca(butacas, pos + b);
//            }
        }
        else {
            vendido = false;
        }
        return vendido;
    }

    private static void ImprimirResultadoVenta (boolean v, int n) {
        if (v) {
            System.out.println("Vendidas " + n + " entradas");
        }
        else {
            System.out.println("No se pudieron vender las entradas");
        }
    }

    private static void LiberarButaca(
                   ArrayList<Boolean> butacas, int nro) {
        butacas.set(nro, false);
    }
                       
    private static int ContarButacasLibres(ArrayList<Boolean> butacas) {
        int desocupadas = 0;
        for (boolean ocupada : butacas) {
            if (!ocupada) {
                desocupadas++;
            }
        }
        return desocupadas;
    }

    private static int ContarButacasLibresForComun(ArrayList<Boolean> butacas) {
        int desocupadas = 0;
        for (int b = 0; b < butacas.size(); b++) {
            if (ButacaLibre(butacas, b)) {
                desocupadas++;
            }
        }
        return desocupadas;
    }

    private static boolean OcuparButaca(
                   ArrayList<Boolean> butacas, int nro) {
        boolean libre = ButacaLibre(butacas, nro);
        if (libre) {
            butacas.set(nro, true);
        }
        return libre;
    }

    private static boolean ButacaLibre(ArrayList<Boolean> butacas, int nro) {
        return ! butacas.get(nro);
    }

/* Completar metodos faltantes */

    private static boolean ButacaOcupada (ArrayList<Boolean> butacas, int nro) {
        return butacas.get(nro);
    }
    
    private static boolean CineVacioFor(ArrayList<Boolean> butacas) {
        boolean vacio = true;
        for (int pos = 0; pos < butacas.size(); pos++) {
            if (butacas.get(pos)) {
                vacio = false;
            }
        }
        return vacio;
    }

    private static boolean CineVacioForeach(ArrayList<Boolean> butacas) {
        boolean vacio = true;
        for (Boolean b : butacas) {
            if (b) {
                vacio = false;
            }
        }
        return vacio;
    }

    private static boolean CineVacio(ArrayList<Boolean> butacas) {
        return ! butacas.contains(true);
    }

    private static boolean CineLleno(ArrayList<Boolean> butacas) {
        return ! butacas.contains(false);
    }

    private static int ContarButacasOcupadasFor(ArrayList<Boolean> butacas) {
        int ocupadas = 0;
        for (int b = 0; b < butacas.size(); b++) {
            if (ButacaOcupada(butacas, b)) {
                ocupadas++;
            }
        }
        return ocupadas;
    }

    private static int ContarButacasOcupadas(ArrayList<Boolean> butacas) {
        int ocupadas = 0;
        for (boolean b : butacas) {
            if (b) {
                ocupadas++;
            }
        }
        return ocupadas;
    }

    private static int BuscarButacaLibre1(ArrayList<Boolean> butacas) {
        int posicion = 0, libre = -1;
        for (Boolean b : butacas) {
            if (b == false) {
                libre = posicion;
            }
            posicion++;
        }
        return libre;
    }

    private static int BuscarButacaLibre2(ArrayList<Boolean> butacas) {
        int posicion = 0, libre = -1;
        for (Boolean b : butacas) {
            if ((b == false) && (libre < 0)) {
                libre = posicion;
            }
            posicion++;
        }
        return libre;
    }

    private static int BuscarButacaLibre(ArrayList<Boolean> butacas) {
        return butacas.indexOf(false);
    }

    private static float PorcentajeOcupacion (ArrayList<Boolean> butacas) {
        float ocupacion = 100 *
              (float)ContarButacasOcupadas(butacas) /
              (float)butacas.size();
        return ocupacion;
    }


    private static int Buscar2ButacasLibresContiguas
                                   (ArrayList<Boolean> butacas) {
        return BuscarNButacasLibresContiguas(butacas, 2);
    }

    private static int BuscarNButacasLibresContiguas
                                   (ArrayList<Boolean> butacas, int n) {
        int posicion = 0, contiguos = 0, primeraLibre = -1;
        while ((contiguos < n) && (posicion < butacas.size())) {
            if (ButacaLibre(butacas, posicion)) {
                contiguos++;
            }
            else {
                contiguos = 0;
            }
            posicion++;
        }
        if (contiguos == n) {
            primeraLibre = posicion - n;
        }
        return primeraLibre;
    }

    private static int BuscarNButacasLibresContiguasForeach
                                   (ArrayList<Boolean> butacas, int n) {
        int posicion = 0, contiguos = 0, primeraLibre = -1;
        for (boolean b : butacas) {
            if ((contiguos < n) && (primeraLibre == -1) &&
                        (ButacaLibre(butacas, posicion))) {
                contiguos++;
                if (contiguos == n) {
                    primeraLibre = posicion - n + 1;
                }
            }
            else {
                contiguos = 0;
            }
            posicion++;
        }
        return primeraLibre;
    }
    
}
