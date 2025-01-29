import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            Scanner scanner = new Scanner(System.in);

            // Prvi zadatak: Zbroj znamenaka unesenog broja koristeći petlju while
            System.out.print("Unesite broj za zbroj znamenaka: ");
            int broj = scanner.nextInt();
            int zbrojZnamenaka = 0;

            while (broj != 0) {
                zbrojZnamenaka += broj % 10;  // Dodajemo posljednju znamenku
                broj /= 10;                   // Skidamo posljednju znamenku
            }

            System.out.println("Zbroj znamenaka unesenog broja je: " + zbrojZnamenaka);

            // Drugi zadatak: Zbroj brojeva od 1 do 1000 koji su djeljivi s 7 koristeći petlju do while
            int i = 1, zbrojDjeljivih = 0;

            do {
                if (i % 7 == 0) {  // Provjeravamo je li broj djeljiv s 7
                    zbrojDjeljivih += i;
                }
                i++;
            } while (i <= 1000);

            System.out.println("Zbroj brojeva od 1 do 1000 koji su djeljivi s 7 je: " + zbrojDjeljivih);
        }


}