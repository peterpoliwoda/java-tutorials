import java.util.Scanner;
import java.util.regex.Pattern;

public class RLE_Decoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj text");
        String text = scanner.nextLine();
        String dekodowanyText = decodeWithRLE(text);
        System.out.println("Text po odkodowaniu: " + dekodowanyText);
    }

    static String decodeWithRLE(String text) {

        StringBuilder wynik = new StringBuilder();
        char litera = text.charAt(0);
        StringBuilder liczbaStr = new StringBuilder();
        boolean mamLitere = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (jestNumerem(currentChar)) {
                liczbaStr.append(currentChar);
            } else if (mamLitere) {
                // Mam i litere i ilosc
                int ileRazyPowtorzyc = Integer.parseInt(liczbaStr.toString());
                wynik.append(String.valueOf(litera).repeat(Math.max(0, ileRazyPowtorzyc)));
                mamLitere = false;
            } else {
                // jest literą
                litera = currentChar;
                mamLitere = true;
            }
        }
        return wynik.toString();
    }

    static boolean jestNumerem(char testowany) {
        String strNum = String.valueOf(testowany);
        Pattern pattern = Pattern.compile("\\d+");
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

}
