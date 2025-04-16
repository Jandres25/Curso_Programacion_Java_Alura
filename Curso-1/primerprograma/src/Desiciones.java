public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDePelicula = 8.2;
        String tipoPlan = "Plus";

        // Código para las condiciones
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Péliculas mas recientes");
        } else {
            System.out.println("Péliculas no recientes");
        }

        if (incluidoEnElPlan && tipoPlan.equals("Plus")){
            System.out.println("Disfrute la pélicula");
        } else {
            System.out.println("Contrate el plan plus");
        }
    }
}
