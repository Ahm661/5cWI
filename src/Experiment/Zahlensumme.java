package Experiment;

public class Zahlensumme {
    public static void main(String[] args) {
        // Variable für die Summe
        int summe = 0;

        // Schleife über alle Zahlen von 4 bis 333, mit einer Schrittweite von 3
        for (int zahl = 4; zahl <= 333; zahl += 3) {
            // Überprüfen, ob die Zahl durch 4 oder 5 teilbar ist
            if (zahl % 4 == 0 || zahl % 5 == 0) {
                continue;  // Diese Zahl überspringen
            }

            // Wenn die Zahl zwischen 100 und 150 liegt, nimm den halben Wert
            if (zahl >= 100 && zahl <= 150) {
                summe += zahl / 2;
            } else {
                summe += zahl;
            }
        }

        // Ausgabe der Gesamtsumme
        System.out.println("Die Gesamtsumme ist: " + summe);
    }
}
