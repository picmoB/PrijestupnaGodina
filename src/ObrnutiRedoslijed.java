import java.util.Scanner;
import java.util.regex.Pattern;

public class ObrnutiRedoslijed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesi neku rečenicu: ");
        String redoslijed01 = input.nextLine();

//        StringBuilder redoslijed02 = new StringBuilder(redoslijed01);
//        redoslijed02.reverse();
//        System.out.println(redoslijed02);       // Dobar dan => nad raboD

//        int brojac = redoslijed01.split("\\s").length;
//        System.out.print(brojac);

        Pattern recenica = Pattern.compile("\\s");
        String[] novaRecenica = recenica.split(redoslijed01);
        String rezultat = "";

        for (int i = 0; i < novaRecenica.length; i++) {
            if (i == novaRecenica.length - 1) {
                rezultat = novaRecenica[i] + rezultat;
            } else {
                rezultat = " " + novaRecenica[i] + rezultat;
            }
        }
        System.out.println(rezultat);
    }
}
