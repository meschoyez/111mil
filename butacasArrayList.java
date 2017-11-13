package colecciones.arreglos;

/**
 *
 * @author meschoyez
 */
public class ColeccionesArreglos {

    public static void main(String[] args) {
        int desocupadas = 0;
        boolean resultado;
        ArrayList<Boolean> butacas;
        butacas = new ArrayList<>();

        for (int p = 0; p < 4; p++) {
            butacas.add(false);
        }

        desocupadas = ContarButacasLibres(butacas);
        System.out.println("Hay" + desocupadas +
                " butacas libres");

        OcuparButaca(butacas, 0);
        desocupadas = ContarButacasLibres(butacas);
        System.out.println("Hay" + desocupadas +
                " butacas libres");
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

ContarButacasOcupadas

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

PorcentajeOcupacion

Buscar2ButacasLibresContiguas

BuscarNButacasLibresContiguas

}

