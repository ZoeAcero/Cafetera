import java.util.Scanner;

public class Pantalla {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar la cantidad de café dentro de la cafetera");
            System.out.println("2. Llenar cafetera de café");
            System.out.println("3. Servir una taza de 150 ml");
            System.out.println("4. Vaciar la cafetera por completo");
            System.out.println("5. Añadir café a la cafetera");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad actual de café: " + cafetera.getCantidadActual() + " c.c.");
                    break;
                case 2:
                    cafetera.llenarCafetera();
                    System.out.println("La cafetera ha sido llenada.");
                    break;
                case 3:
                    cafetera.servirTaza(150);
                    System.out.println("Se ha servido una taza de 150 ml.");
                    break;
                case 4:
                    cafetera.vaciarCafetera();
                    System.out.println("La cafetera ha sido vaciada.");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de café a añadir:");
                    int cantidad = scanner.nextInt();
                    cafetera.agregarCafe(cantidad);
                    System.out.println("Se ha añadido " + cantidad + " c.c. de café a la cafetera.");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
