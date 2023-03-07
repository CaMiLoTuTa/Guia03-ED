import java.util.Random;

import javax.swing.JOptionPane;

public class TrabajoAutonomo {
    public TrabajoAutonomo() {
        numAle();
        imprimirArreglo();
        tiempo();
        imprimirArreglo();
    }

    int nEl = 500;
    int aux;
    int[] lista;

    // * Genere una lista de 1000 números aleatorios de 100 a 7000.
    public void numAle() {
        Random random = new Random();
        lista = new int[nEl];
        int num;

        for (int i = 0; i < lista.length; i++) {
            num = random.nextInt(100, 7000);
            lista[i] = num;
        }
    }

    // * Investigue como podría calcular el tiempo en mili-segundos para ordenar la
    // * lista generada utilizando los diferentes algoritmos que se estudian en esta
    // * guía.
    public void tiempo() {

        long startTime = System.currentTimeMillis();
        metodoBurbuja();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        JOptionPane.showMessageDialog(null, "El tiempo total del método burbuja es: " + totalTime + " mili-segundos.");
    }

    public void metodoBurbuja() {
        // ? MÉTODO BURBUJA
        for (int i = 0; i < (nEl - 1); i++) {
            for (int j = 0; j < (nEl - 1); j++) {
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }

    public void imprimirArreglo() {
        String text = "";
        int c = 0, e = 15;

        for (int i = 0; i < lista.length; i++) {
            if ((nEl - 1) == i) {
                text += lista[i] + ".";

            } else {
                text += lista[i] + ", ";
            }
            c++;
            if (c == e) {
                text += "\n";
                c = 0;
            }
        }
        JOptionPane.showMessageDialog(null, "El arreglo es: \n" + text);
    }

    public static void main(String[] args) {
        new TrabajoAutonomo();
    }
}
