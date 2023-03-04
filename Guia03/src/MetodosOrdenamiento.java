
import java.util.Random;

import javax.swing.JOptionPane;

public class MetodosOrdenamiento {

    // * Compara el numero actual con el anterior
    // * Luego se comprar el actual con el anterior
    // * if nActual > nSiguiente: se intercambian
    static int[] arreglo;
    static int nEl;
    int aux;
    String text, text2;
    public Random random = new Random();

    public MetodosOrdenamiento() {
        nEl = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de elementos del arreglo: "));
        arreglo = new int[nEl];
        text = "";
        text2 = "";
        leerArreglo();
        // metodoBurbuja();
        // metodoInsercion();
        // metodoSeleccion();
        // metodoShell();

        // metodoQuickSort(arreglo, 0, nEl - 1);

        // imprimirArreglo();
    }

    public void leerArreglo() {
        // for (int i = 0; i < arreglo.length; i++) {
        // arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un
        // número: "));
        // }
        int num;
        for (int i = 0; i < arreglo.length; i++) {
            num = random.nextInt(nEl);
            arreglo[i] = num;
        }
    }

    public void imprimirArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            text += arreglo[i] + ", ";
        }
        JOptionPane.showMessageDialog(null, "El arreglo es: \n" + text);
    }

    public void metodoBurbuja() {
        long startTime = System.currentTimeMillis();

        // ? MÉTODO BURBUJA
        for (int i = 0; i < (nEl - 1); i++) {
            for (int j = 0; j < (nEl - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        JOptionPane.showMessageDialog(null, "El tiempo total del método burbuja es: " + totalTime + " mili-segundos.");
    }

    public void metodoInsercion() {
        long startTime = System.currentTimeMillis();

        int aux, j;
        for (int i = 0; i < arreglo.length; i++) {
            j = i;
            aux = arreglo[i];
            while (j > 0 && aux < arreglo[j - 1]) {
                arreglo[j] = arreglo[j - 1];
                j--;
            }
            arreglo[j] = aux;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        JOptionPane.showMessageDialog(null,
                "El tiempo total del método inserción es: " + totalTime + " mili-segundos.");
    }

    public void metodoShell() {
        long startTime = System.currentTimeMillis();
        for (int i = nEl / 2; i > 0; i /= 2) {
            for (int j = i; j < nEl; j += 1) {
                int temp = arreglo[j];
                int k;
                for (k = j; k >= i && arreglo[k - i] > temp; k -= i) {
                    arreglo[k] = arreglo[k - i];
                }
                arreglo[k] = temp;
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        JOptionPane.showMessageDialog(null, "El tiempo total del método shell es: " + totalTime + " mili-segundos.");
    }

    // ? Para una cantidad de datos grandes
    public static void metodoQuickSort(int arreglo[], int primero, int ultimo) {
        long startTime = System.currentTimeMillis();
        int i, j, central;
        double pivote;

        central = (primero + ultimo) / 2;
        pivote = arreglo[central];
        i = primero;
        j = ultimo;
        do {
            while (arreglo[i] < pivote)
                i++;
            while (arreglo[j] > pivote)
                j--;
            if (i <= j) {
                intercambiar(arreglo, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j)
            metodoQuickSort(arreglo, primero, j); // mismo proceso con sublista izqda
        if (i < ultimo)
            metodoQuickSort(arreglo, i, ultimo); // mismo proceso con sublista derecha

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        JOptionPane.showMessageDialog(null,
                "El tiempo total del método quick-sort es: " + totalTime + " mili-segundos.");
    }

    public static void intercambiar(int[] arreglo, int i, int j) {
        int aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    public void metodoSeleccion() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < nEl - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nEl; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        JOptionPane.showMessageDialog(null,
                "El tiempo total del método selección es: " + totalTime + " mili-segundos.");
    }

    public static void main(String[] args) {

        new MetodosOrdenamiento();

    }
}
