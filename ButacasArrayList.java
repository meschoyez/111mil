/**
 *
 * @author meschoyez
 */
public class ButacasArrayList {

    public static void main(String[] args) {
        int desocupadas = 0;
        boolean resultado;
        ArrayList<Boolean> butacas;
        butacas = new ArrayList<>();

    /* Hacer el metod principal (main) para que el programa
     * realice lo siguiente:
     *  - El cine cuenta con 15 butacas
     *  - El primer cliente compra 3 entradas
     *  - El segundo cliente compra 2 entradas
     *  - El tercer cliente compra 5 entradas
     *  - El segundo cliente cancela sus 2 entradas
     *  - El cuarto cliente compra 4 entradas
     *  - El quinto cliente compra 1 entrada
     * Finalmente, mostrar por pantalla la cantidad de butacas
     * ocupadas y el porcentaje de ocupacion el cine
     */

        for (int p = 0; p < 4; p++) {
            butacas.add(false);
        }

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
                                   (boolean[] butacas) {
        return BuscarNButacasLibresContiguas(butacas, 2);
    }

    private static int BuscarNButacasLibresContiguas
                                   (ArrayList<Boolean> butacas, int n) {
        int posicion = 0, contiguos = 0, primeraLibre = -1;
        while ((contiguos < n) || ((posicion + n-1) < butacas.size())) {
            if (ButacaLibre(butacas, posicion)) {
                contiguos++;
            }
            else {
                contiguos = 0;
            }
            posicion++;
        }
        if (contiguos == n) {
            primeraLibre = posicion - n + 1;
        }
        return primeraLibre;
    }

    private static int BuscarNButacasLibresContiguasForeach
                                   (ArrayList<Boolean> butacas, int n) {
        int posicion = 0, contiguos = 0, primeraLibre = -1;
        for (boolean b : butacas) {
            if ((contiguos < n) && (primeraLibre == -1) &&
                        (ButacaLibre(butacas, posicion)) {
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

