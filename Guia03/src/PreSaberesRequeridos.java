import javax.swing.JOptionPane;

public class PreSaberesRequeridos {
    // ? ¿Cómo adiciona datos en un arreglo de nombres, de tamaño 10 desde su
    // ? creación? Escriba el algoritmo en Java
    public void adicionar() {
        String[] a = new String[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = JOptionPane.showInputDialog(null, "Escriba un nombre: ");
        }
    }

    // ? ¿Cómo compararía dos datos tipo String en Java? Describa el procedimiento.
    public void comparar() {
        String nombre1 = "Cristobal";
        String nombre2 = "Andrés";

        if (nombre1.equals(nombre2)) {
            System.out.println("Los nombres son iguales");

        } else {
            System.out.println("Los nombres son diferentes");
        }
    }

    // ? Se tiene dos variables que almacenan valores diferentes. Diseñe un
    // ? algoritmo que le permita intercambiar los valores entre ellas.
    public void intercambiar() {
        var var1 = 2;
        var var2 = 600;

        System.out.println("The var1 is: " + var1);
        System.out.println("The var2 is: " + var2);

        int[] variables = new int[2];
        variables[0] = var1;
        variables[1] = var2;

        var1 = variables[1];
        var2 = variables[0];

        System.out.println("The var1 is: " + var1);
        System.out.println("The var2 is: " + var2);

    }

    public PreSaberesRequeridos() {
        // adicionar();
        comparar();
        intercambiar();
    }

    public static void main(String[] args) {
        new PreSaberesRequeridos();
    }
}
