public class Cadenas {
    public static void main(String[] args) {

        String nombre = "Julian";
        String nombre2 = "Daniel";
        String nombre3 = "Julian";
        String nombre4 = "juliaN";

        String correo = "alvarez.julian@correounivalle.edu.co";

        int longitudNombre = nombre.length();

        System.out.println("La primera letra de el nombre " + nombre + " es: " + nombre.charAt(0));
        System.out.println("La ultima letra del nombre " + nombre + " es: " + nombre.charAt(longitudNombre - 1));
        System.out.println("El nombre " + nombre + " posee " + longitudNombre + " letras.");

        String entidad = correo.substring(14,correo.length());

        System.out.println(entidad);

        System.out.println(nombre + " y " + nombre2 + " Son iguales? ->> "+nombre.equals(nombre2));
        System.out.println(nombre + " y " + nombre3 + " Son iguales? ->> "+nombre.equals(nombre3));
        System.out.println(nombre + " y " + nombre4 + " Son iguales textualmente? ->> "+nombre.equalsIgnoreCase(nombre4));




    }
}
