import java.util.Scanner;

/**
 * Kleines Rechenquiz: Der Spieler hat drei Versuche, eine Aufgabe zu lösen.
 * Zeigt den Einsatz von Schleife, break und Eingabeprüfung.
 */
public class CorrectOrFalse {

    private static final int MAX_VERSUCHE = 3;
    private static final String AUFGABE = "5 + 10 / 2 * 10";
    // Punkt vor Strich, von links nach rechts: 10 / 2 = 5, 5 * 10 = 50, 5 + 50 = 55
    private static final int LOESUNG = 55;

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        boolean richtig = false;

        System.out.println("Teste dich selbst!");
        System.out.println("Was ergibt " + AUFGABE + " ?");

        for (int versuch = 1; versuch <= MAX_VERSUCHE; versuch++) {
            System.out.print("Versuch " + versuch + " von " + MAX_VERSUCHE + ": ");

            // Keine Eingabe mehr (z. B. Strg+D): Spiel beenden.
            if (!eingabe.hasNext()) {
                break;
            }

            // Eingabeprüfung: Ist das nächste Wort keine ganze Zahl,
            // wird es verworfen und der Versuch zählt als falsch.
            if (!eingabe.hasNextInt()) {
                eingabe.next();
                System.out.println("Bitte eine ganze Zahl eingeben.");
                continue;
            }

            if (istRichtig(eingabe.nextInt())) {
                richtig = true;
                break; // richtige Antwort: Schleife sofort verlassen
            }

            if (versuch < MAX_VERSUCHE) {
                System.out.println("Leider falsch, versuch es noch einmal.");
            }
        }

        if (richtig) {
            System.out.println("Richtig, gut gemacht!");
        } else {
            System.out.println("Leider nicht geschafft. Die richtige Antwort ist " + LOESUNG + ".");
        }

        eingabe.close();
    }

    static boolean istRichtig(int antwort) {
        return antwort == LOESUNG;
    }
}
