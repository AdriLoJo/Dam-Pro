/**
 * Autor: AdriLoJo
 * Versión: 1.0
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("         CONVERSOR DAM-PRO");
        System.out.println("====================================");
        System.out.println();
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        int opcion = 0;
        int conversiones = 0;

        System.out.println();
        System.out.println("Bienvenida/o, " + nombre + ".");

        while (opcion != 4) {
            System.out.println();
            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");
            System.out.println();
            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce los kilómetros: ");
                    float kilometros = teclado.nextFloat();
                    while (kilometros < 0) {
                        System.out.println("La distancia no puede ser negativa.");
                        System.out.print("Introduce los kilómetros de nuevo: ");
                        kilometros = teclado.nextFloat();
                    }
                    float metros = kilometros * 1000;
                    System.out.println("Resultado: " + metros + " metros");
                    System.out.println("Conversión realizada correctamente.");
                    conversiones++;
                    break;
                case 2:
                    System.out.print("Introduce los metros: ");
                    float cantidadMetros = teclado.nextFloat();
                    while (cantidadMetros < 0) {
                        System.out.println("La distancia no puede ser negativa.");
                        System.out.print("Introduce los metros de nuevo: ");
                        cantidadMetros = teclado.nextFloat();
                    }
                    float centimetros = cantidadMetros * 100;
                    System.out.println("Resultado: " + centimetros + " centímetros");
                    System.out.println("Conversión realizada correctamente.");
                    conversiones++;
                    break;
                case 3:
                    System.out.print("Introduce los kilómetros: ");
                    float kilometrosParaMillas = teclado.nextFloat();
                    while (kilometrosParaMillas < 0) {
                        System.out.println("La distancia no puede ser negativa.");
                        System.out.print("Introduce los kilómetros de nuevo: ");
                        kilometrosParaMillas = teclado.nextFloat();
                    }
                    float millas = kilometrosParaMillas * 0.621371f;
                    System.out.println("Resultado: " + millas + " millas");
                    System.out.println("Conversión realizada correctamente.");
                    conversiones++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        System.out.println();
        System.out.println("====================================");
        System.out.println("Usuario: " + nombre);
        System.out.println("Conversiones realizadas: " + conversiones);
        System.out.println("Gracias por utilizar DAM-PRO.");
        System.out.println("====================================");

        teclado.close();
    }
}
