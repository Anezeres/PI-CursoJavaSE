import javax.swing.*;
import java.util.*;


public class Condicionales {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("¿Que opcion escoges?");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Rectangulo");

            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    String ladoString = JOptionPane.showInputDialog("Ingrese la longitud del lado");

                    double ladoDouble = Double.parseDouble(ladoString);
                    if (ladoDouble >= 0) {

                        double areaCuadrado = ladoDouble * ladoDouble;
                        System.out.println("El area del cuadrado es: " + areaCuadrado);

                    } else {
                        System.out.println("Lo siento, no puede ingresar valores negativos");
                    }

                    break;

                case 2:

                    String baseString = JOptionPane.showInputDialog("Ingrese la longitud de la base");
                    String alturaString = JOptionPane.showInputDialog("Ingrese la longitud de la altura");

                    double baseDouble = Double.parseDouble(alturaString);
                    double alturaDouble = Double.parseDouble(alturaString);
                    if (baseDouble >= 0 && alturaDouble >= 0) {

                        double areaTriangulo = (baseDouble * alturaDouble) / 2;
                        System.out.println("El area del triangulo es: " + areaTriangulo);

                    } else {
                        System.out.println("Lo siento, no puede ingresar valores negativos");
                    }
                    break;

                case 3:
                    String radioString = JOptionPane.showInputDialog("Ingrese la longitud del radio");

                    double radioDouble = Double.parseDouble(radioString);
                    if (radioDouble >= 0) {

                        double areaCirculo = Math.PI * radioDouble * radioDouble;
                        System.out.println("El area del circulo es: " + areaCirculo);

                    } else {
                        System.out.println("Lo siento, no puede ingresar valores negativos");
                    }
                    break;

                case 4:
                    String baseRString = JOptionPane.showInputDialog("Ingrese la longitud de la base");
                    String alturaRString = JOptionPane.showInputDialog("Ingrese la longitud de la altura");

                    double baseRDouble = Double.parseDouble(alturaRString);
                    double alturaRDouble = Double.parseDouble(alturaRString);
                    if (baseRDouble >= 0 && alturaRDouble >= 0) {

                        double areaTriangulo = baseRDouble * alturaRDouble;
                        System.out.println("El area del rectangulo es: " + areaTriangulo);

                    } else {
                        System.out.println("Lo siento, no puede ingresar valores negativos");
                    }

                    break;

                default:

                    System.out.println("Lo siento, el valor ingresado no es correcto");

                    break;

            }

        }
}
