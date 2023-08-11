import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int number = 1;
        int asciCode = 97;
        for (int i = 65; i <= 90; i++) {
            stringBuilder.append(number).append(": ").append((char) i)
                    .append(" ").append((char) asciCode).append("\n");
            number++;
            asciCode++;
        }
        for (int i = 48; i < 58; i++) {
            stringBuilder.append(number).append(": ").append((char) i).append("\n");
            number++;
        }
        FileWriter alphabet = new FileWriter("Alphabet.txt");
        alphabet.write(stringBuilder.toString());
        alphabet.close();

        FileReader readerAlphabet = new FileReader("Alphabet.txt");
        Scanner scanner = new Scanner(readerAlphabet);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}