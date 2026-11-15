# CorrectOrFalse

Ein kleines Rechenquiz für die Konsole, geschrieben in Java.
Der Spieler hat drei Versuche, eine Rechenaufgabe zu lösen. Bei der richtigen Antwort endet das Spiel sofort.

Das Projekt ist eine Übung aus dem ersten Studienjahr zu Schleifen, `break`, `continue` und Eingabeprüfung.

## Starten

Voraussetzung ist ein installiertes Java (JDK 11 oder neuer).

```bash
javac CorrectOrFalse.java
```

```bash
java CorrectOrFalse
```

## Beispiel

```
Teste dich selbst!
Was ergibt 5 + 10 / 2 * 10 ?
Versuch 1 von 3: 75
Leider falsch, versuch es noch einmal.
Versuch 2 von 3: abc
Bitte eine ganze Zahl eingeben.
Versuch 3 von 3: 55
Richtig, gut gemacht!
```

## Was der Code zeigt

| Thema            | Stelle im Code                                                                 |
|------------------|--------------------------------------------------------------------------------|
| `for`-Schleife   | Zählt die Versuche von 1 bis `MAX_VERSUCHE`                                    |
| `break`          | Verlässt die Schleife sofort bei der richtigen Antwort                         |
| `continue`       | Springt bei einer ungültigen Eingabe zum nächsten Versuch                      |
| Eingabeprüfung   | `hasNextInt()` prüft vor dem Lesen, ob wirklich eine ganze Zahl eingegeben wurde |
| Konstanten       | `static final` für Aufgabe, Lösung und Anzahl der Versuche                     |
| Eigene Methode   | `istRichtig(int)` trennt die Prüfung von der Ein- und Ausgabe                  |

## Warum ist 55 richtig?

Punktrechnung kommt vor Strichrechnung, und gleichrangige Rechnungen laufen von links nach rechts:

```
5 + 10 / 2 * 10
= 5 + 5 * 10
= 5 + 50
= 55
```

## Was gegenüber der ersten Version verbessert wurde

- Die Zeile „Chance #…“ wurde nach einer falschen Antwort doppelt ausgegeben. Das ist behoben.
- Bei einer Eingabe wie `abc` ist das Programm mit einer `InputMismatchException` abgestürzt. Jetzt kommt ein Hinweis.
- Die Antwort wird als `int` statt als `float` verglichen. Kommazahlen mit `==` zu vergleichen ist fehleranfällig, weil sie intern gerundet gespeichert werden.
- Die Klasse heißt jetzt wie das Projekt, und Aufgabe, Lösung und Zahl der Versuche stehen als Konstanten oben.
