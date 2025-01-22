import java.util.Random;

public class SortingComparison {
    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 400000}; // Array-Größen

        System.out.println("Vergleich der Sortieralgorithmen:");
        for (int size : sizes) {
            System.out.println("\nArray-Größe: " + size);

            int[] originalArray = generateRandomArray(size);

            // Selection Sort
            int[] selectionArray = originalArray.clone();
            double selectionTime = measureTime(() -> selectionSort(selectionArray));
            System.out.printf("Selection Sort: %.3f Sekunden\n", selectionTime);

            // Bubble Sort
            int[] bubbleArray = originalArray.clone();
            double bubbleTime = measureTime(() -> bubbleSort(bubbleArray));
            System.out.printf("Bubble Sort: %.3f Sekunden\n", bubbleTime);

            // Insertion Sort
            int[] insertionArray = originalArray.clone();
            double insertionTime = measureTime(() -> insertionSort(insertionArray));
            System.out.printf("Insertion Sort: %.3f Sekunden\n", insertionTime);

            // Quicksort
            int[] quickArray = originalArray.clone();
            double quickTime = measureTime(() -> quickSort(quickArray, 0, quickArray.length - 1));
            System.out.printf("Quicksort: %.3f Sekunden\n", quickTime);
        }
    }

    // Generiert ein Array mit zufälligen Zahlen
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000); // Zufallszahlen bis 100000
        }
        return array;
    }

    // Zeitmessung für eine Methode
    private static double measureTime(Runnable sortMethod) {
        long startTime = System.nanoTime();
        sortMethod.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0; // Zeit in Sekunden
    }

    // Selection Sort
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Bubble Sort
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Quicksort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
