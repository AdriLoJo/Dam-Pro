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

        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Productos: " + cantidadProductos);

        teclado.close();
    }
}
