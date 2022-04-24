import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");

        String nombreUsuario = entrada.nextLine();

        System.out.println("Ingrese su edad: ");

        int edadUsuario = entrada.nextInt();

        System.out.println("El nombre ingresado es: " + nombreUsuario);
        System.out.println("La edad ingresada es: " + edadUsuario);


    }
}
