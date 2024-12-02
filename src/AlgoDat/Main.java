package AlgoDat;

public class Main {
    public static void main(String[] args) {
        int[] data1 = DataGenerator.generateDataArray(3);
        int[] data2 = DataGenerator.generateDataArray(8, 0, 100);
        DataGenerator.printArray(data2);
    }
}