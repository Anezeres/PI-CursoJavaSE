import javax.swing.*;

class JOption {
    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");

        String edadUsuario = JOptionPane.showInputDialog("Introduce tu edad");

        System.out.println("Hola " + nombreUsuario + ". Tienes una edad de " + edadUsuario + " años");
    }
}