
import java.util.Scanner;

public class hirsipuu {
    private static String[] sanat = { "datanomi", "linnunrata", "tietokone", "eurooppa", "kuusi", "vesi", "haikara",
            "suklaa", "keilaus", "lontoo" };
    private static String sana = sanat[(int) (Math.random() * sanat.length)];
    private static String kirjain = new String(new char[sana.length()]).replace("\0", "*");
    private static int luku = 0;
    public static String uuskirjain = "";

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        luku = 0;
        uuskirjain = "";
        sana = sanat[(int) (Math.random() * sanat.length)];
        kirjain = new String(new char[sana.length()]).replace("\0", "*");
        System.out.println("");
        System.out.println("HIRSIPUU");
        System.out.println("Aloitetaanko peli?");
        System.out.println("kylla - ei");

        Scanner lukija = new Scanner(System.in);
        String vastaus = lukija.nextLine();
        if (vastaus.contains("kylla")) {
            aloita();
        } else {
            System.out.println("");
            System.out.println("Olisiko sittenkin?");
            menu();
        }

    }

    public static void aloita() {
        Scanner lukija = new Scanner(System.in);

        while (luku < 7 && kirjain.contains("*")) {
            System.out.println("Arvaa kirjain");
            System.out.println(kirjain);
            String arvaus = lukija.next();
            if (!Character.isLetter(arvaus.charAt(0))) {
                System.out.println("Arvaus ei ole kirjain!");
            } else {
                peli(arvaus);
            }

        }
        lukija.close();

    }

    private static void peli(String arvaus) {
        boolean loytyi = false;
        if (uuskirjain.contains(arvaus)) {
            System.out.println("Olet jo arvannut tuon kirjaimen!");

        } else {
            for (int i = 0; i < sana.length(); i++) {
                if (sana.charAt(i) == arvaus.charAt(0)) {
                    loytyi = true;
                    uuskirjain += arvaus.charAt(0);

                }

            }
            kirjain = "";
            for (int i = 0; i < sana.length(); i++) {
                boolean a = false;
                for (int x = 0; x < uuskirjain.length(); x++) {
                    if (uuskirjain.charAt(x) == sana.charAt(i) && !a) {
                        a = true;
                        kirjain += uuskirjain.charAt(x);

                    }
                }
                if (!a) {
                    kirjain += "*";
                }
            }
        }

        if (!loytyi) {
            luku++;
            hirttokoysi();
        }
        if (kirjain.equals(sana)) {
            System.out.println("");
            System.out.println("Sinä voitit! Sana oli " + sana);
            menu();
        }
    }

    public static void hirttokoysi() {
        if (luku == 1) {
            System.out.println("Väärin, yritä uudestaan");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
        }
        if (luku == 2) {
            System.out.println("Väärin, yritä uudestaan");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (luku == 3) {
            System.out.println("Väärin, yritä uudestaan");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (luku == 4) {
            System.out.println("Väärin, yritä uudestaan");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |        \\____/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (luku == 5) {
            System.out.println("Väärin, yritä uudestaan");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (luku == 6) {
            System.out.println("Väärin, yritä uudestaan");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (luku == 7) {

            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("Peli ohi! Sana oli " + sana);
            menu();
        }
    }

}