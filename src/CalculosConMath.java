public class CalculosConMath {

    public static void main(String[] args) {
        double variable1 = 5.85;
        double base = 5;
        double exponente = 3;

        int resultado = (int) Math.round(variable1); //refundicion
        int resultado2  = (int) Math.pow(base,exponente);


        System.out.println(resultado);
        System.out.println(resultado2);
    }
}
