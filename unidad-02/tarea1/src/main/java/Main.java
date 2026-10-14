import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("         TIENDA DAM-PRO");
        System.out.println("====================================");
        System.out.println();

        System.out.print("Introduce tu nombre: ");
        String nombreCliente = teclado.nextLine();

        System.out.print("¿Cuántos productos vas a comprar? ");
        int cantidadProductos = teclado.nextInt();
        teclado.nextLine();

        float total = 0.0f;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println();
            System.out.println("Producto " + i);
            System.out.print("Nombre: ");
            String nombreProducto = teclado.nextLine();

            System.out.print("Precio: ");
            float precioProducto = teclado.nextFloat();
            teclado.nextLine();

            System.out.printf("%s - %.2f euros%n", nombreProducto, precioProducto);
            total += precioProducto;
        }

        System.out.println();
        System.out.println("====================================");
        System.out.println("            TOTAL DEL TICKET");
        System.out.println("====================================");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Productos comprados: " + cantidadProductos);
        System.out.printf("TOTAL: %.2f euros%n", total);
        System.out.println("Gracias por tu compra, " + nombreCliente + ".");

        teclado.close();
    }
}
