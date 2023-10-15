import java.util.Scanner;
import java.util.stream.IntStream;

public class RomanConverterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        IntStream.range(0, n)
                .forEach(x -> System.out.println(RomanConverter.toRoman(scanner.nextInt())));
        scanner.close();
    }
}

class RomanConverter {
    /**
     * Roman to decimal converter
     *
     * @param n number in decimal format
     * @return string representation of the number in Roman numeral
     */
    public static String toRoman(int n) {
        // Se kreiraat nizi za rimskite broevi i nivnite vrednosti za konverzija
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // Se kreira builder za nova niza koja kje go sodrzhi rimskiot broj
        StringBuilder roman = new StringBuilder();

        // Se iterira megju vrednostite i rimskite znakovi za da se kreira numerot
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                roman.append(romanSymbols[i]);
                n -= values[i];
            }
        }

        return roman.toString();
    }
}
