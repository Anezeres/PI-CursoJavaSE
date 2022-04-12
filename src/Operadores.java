public class Operadores {
    public static void main(String[] args) {

        int primerVariable; //variable declarada pero no iniciada
        int segundaVariable = 5; // variable declarada e iniciada

        primerVariable = 11;

        int tercerVariable = primerVariable + segundaVariable; //operador suma

        System.out.println(tercerVariable);

        tercerVariable++;

        System.out.println(tercerVariable);

        tercerVariable += 25;

        System.out.println(tercerVariable);

        tercerVariable -= 15;

        System.out.println(tercerVariable);

        /**+
         * Para declarar constantes se utiliza la palabra reservada final
         */

        final double gravedad = 9.8;

        System.out.println("La constante gravitatoria en la tierra es: " + gravedad);

    }
}
