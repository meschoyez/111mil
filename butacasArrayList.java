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


    private static boolean ButacaLibre(ArrayList<Boolean> butacas, int nro) {
        return ! butacas.get(nro);
    }


    private static boolean OcuparButaca(
                   ArrayList<Boolean> butacas, int nro) {
        boolean libre = ButacaLibre(butacas, nro);
        if (libre) {
            butacas.set(nro, true);
        }
        return libre;
    }

}
