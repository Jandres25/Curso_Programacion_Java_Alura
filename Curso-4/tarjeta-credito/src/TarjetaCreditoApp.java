import java.util.Scanner;

public class TarjetaCreditoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite de su tarjeta de crédito: ");
        double limite = scanner.nextDouble();
        scanner.nextLine();

        TarjetaCredito tarjeta = new TarjetaCredito(limite);

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Realizar una compra");
            System.out.println("0. Salir y mostrar resumen");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese una descripción para la compra: ");
                String descripcion = scanner.nextLine();

                System.out.print("Ingrese el valor de la compra: ");
                double valorCompra = scanner.nextDouble();
                scanner.nextLine();

                Compra compra = new Compra(descripcion, valorCompra);

                if (tarjeta.realizarCompra(compra)) {
                    System.out.println("Compra realizada con éxito. Saldo restante: " + tarjeta.getSaldoRestante());
                } else {
                    System.out.println("Saldo insuficiente para realizar esta compra. Saldo restante: " + tarjeta.getSaldoRestante());
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        // Muestra las compras registradas ordenadas por valor
        System.out.println("\nResumen de Compras realizadas:");
        for (Compra comp : tarjeta.getComprasOrdenadas()) {
            System.out.println(comp);
        }
        System.out.println("\nSaldo final en la tarjeta: " + tarjeta.getSaldoRestante());

        scanner.close();
    }
}